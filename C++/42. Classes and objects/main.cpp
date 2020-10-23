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
				msg = "Hai pagato " + b + " euro per la gestione annua del tuo conto\n";
			}
			else
				msg = "Non hai abbastanza soldi per pagare i costi di gestione annua del tuo conto\n";

			return msg;
		}

		string nextMonth(int annual_pay, int interestsPerc) {
			string msg;
			if (month == 12) {
				month = 1;
				if (isPayed == false) {
					removeMoney(annual_pay);
					msg = "Le spese di gestione sono state pagate automaticamente.\n";
				}
				else
					isPayed = 0;
			}
			else
				month++;

			interests(interestsPerc);
			string a = to_string(money / 100 * interestsPerc);
			msg += "Hai ricevuto " + a + " euro di interessi.";

			return msg;
		}
};

int main() {
	float money;
	int account_number, interests, annual_pay;
	string man;

	cout << "Inserisci i costi di gestione annua del conto: ";
	cin  >> annual_pay;
	cout << "Inserisci la percentuale di interessi: ";
	cin  >> interests;

	cout << "Inserisci il numero del conto: ";
	cin  >> account_number;
	cout << "Inserisci il proprietario del conto: ";
	cin  >> man;
	cout << "Inserisci il saldo del conto: ";
	cin  >> money;

	Account account(account_number, man, money);

	int r;
	float input;
	string monthName[] = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
	do {
		cout << "benvenuto " << account.getMan() << " (" << account.getAccount_number() << ")\n";
		cout << "il mese di oggi è: " << monthName[account.getMonth() - 1] << "\n";
		cout << "1. Deposita\n";
		cout << "2. Preleva\n";
		cout << "3. Visualizza saldo\n";
		cout << "4. Prossimo mese\n";
		if ((account.getIsPayed() == false) && (account.getMonth() >= 11))
			cout << "5. Paga i costi di gestione annua\n";
		cout << "0. Esci\n";
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
				cout << account.nextMonth(annual_pay, interests) << "\n";
				break;
			case 5:
				system("clear");
				cout << account.payAnnualCosts(annual_pay) << "\n";
				break;
		}
	} while (r != 0);
	return 0;
}
