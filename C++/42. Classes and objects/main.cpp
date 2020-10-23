#include <iostream>
#include <string.h>

using namespace std;

class Account {
	private:
		int account_number;
		string man;
		float money;
		bool isPayed;
		int month;

		void interests(int a) {
			money = money + (money / 100 * a);
		}

	public:
		Account (int a, string b, float c) {
			account_number = a;
			man = b;
			money = c;
			isPayed = 0;
			month = 1;
		}

		string getMan() {
			return man;
		}

		int getAccount_number() {
			return account_number;
		}

		float getMoney () {
			return money;
		}

		int getMonth() {
			return month;
		}

		bool getIsPayed() {
			return isPayed;
		}

		void addMoney(int a) {
			money += a;
		}

		void removeMoney(int a) {
			money -= a;
		}

		string payAnnualCosts(int a) {
			string msg = " ";
			if ((money > a) && (isPayed == false)) {
				removeMoney(a);
				isPayed = true;
				string b = to_string(a);
				msg = "You payed" + b + " euros of annual tax\n";
			}
			else
				msg = "you don't have enought money for pay the annual tax\n";

			return msg;
		}

		string nextMonth(int annualTax, int interestsPerc) {
			string msg;
			if (month == 12) {
				month = 1;
				if (isPayed == false) {
					removeMoney(annualTax);
					msg = "The annual tax was payed automatically\n";
				}
				else
					isPayed = 0;
			}
			else
				month++;

			interests(interestsPerc);
			string a = to_string(money / 100 * interestsPerc);
			msg += "You recieved" + a + " euros of interests\n";

			return msg;
		}
};

int main() {
	float money;
	int account_number, interests, annualTax;
	string man;

	cout << "Enter the annual tax cost: ";
	cin  >> annualTax;
	cout << "Enter the percentage of interests: ";
	cin  >> interests;

	cout << "Enter the number of the account: ";
	cin  >> account_number;
	cout << "Enter the proprietary of the account: ";
	cin  >> man;
	cout << "Enter the sale of the account: ";
	cin  >> money;

	Account account(account_number, man, money);

	int r;
	float input;
	string monthName[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	do {
		cout << "Welcome " << account.getMan() << " (" << account.getAccount_number() << ")\n";
		cout << "The month is: " << monthName[account.getMonth() - 1] << "\n";
		cout << "1. Deposit\n";
		cout << "2. Pickup\n";
		cout << "3. View sale\n";
		cout << "4. Next month\n";
		if ((account.getIsPayed() == false) && (account.getMonth() >= 11))
			cout << "5. Pay the annual tax\n";
		cout << "0. exit\n";
		cin  >> r;

		switch (r) {
			case 1:
				cin >> input;
				system("clear");
				account.addMoney(input);
				break;
			case 2:
				cin >> input;
				system("clear");
				account.removeMoney(input);
				break;
			case 3:
				system("clear");
				cout << "Il tuo saldo è: " << account.getMoney() << "\n";
				break;
			case 4:
				system("clear");
				cout << account.nextMonth(annualTax, interests) << "\n";
				break;
			case 5:
				system("clear");
				cout << account.payAnnualCosts(annualTax) << "\n";
				break;
		}
	} while (r != 0);
	return 0;
}
