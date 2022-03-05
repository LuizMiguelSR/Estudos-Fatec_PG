#include <iostream>

using namespace std;

int main() {
	int idade;
	
	//Lendo a idade da pessoa
	cout << "Digite a idade de uma pessoa: ";
	cin >> idade;

	//Idade negativa não é válida
	if (idade < 0) {
		cout << endl << "Idade invalida!" << endl;
		return 0;
	}
	
	cout << endl;
	
	//Verificando o intervalo de idade da pessoa
	if (idade <= 11) {
		cout << "A pessoa e uma crianca";
	} else if (idade <= 17) {
		cout << "A pessoa e adolescente";
	} else if (idade <= 49) {
		cout << "A pessoa e adulta";
	} else {
		cout << "A pessoa e idosa";
	}
	
	cout << endl;
	
	return 0;
}
