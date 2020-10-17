#include <iostream>

using namespace std;

int main() {
  int n;
  bool f = true;

  cout << "inserisci un numero: ";
  cin  >> n;

  for (int i = 2; i <= n / 2 && f == true; i++) {
    if (n % i == 0)
      f = false;
  }

  if (f == true)
    cout << "il numero inserito è primo\n";
  else
    cout << "il numero inserito non è primo\n";

  return 0;
}
