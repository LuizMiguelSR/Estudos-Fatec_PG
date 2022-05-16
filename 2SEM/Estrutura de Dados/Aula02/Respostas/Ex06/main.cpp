#include <iostream>

using namespace std;

int main() {
	int numero;
	
	//Lendo o número do usuário
	cout << "Digite um numero: ";
	cin >> numero;
	
	cout << endl;
	
	//Verificando se o número é par ou ímpar
	//Para isto, basta verificar o resto da divisão do número por 2.
	//Exemplos: 8 / 2 = 0 (resto 0); 13 / 2 = 6 (resto 1)
	if (numero % 2 == 0) {
		cout << "Numero " << numero << " e par" << endl;
	} else {
		cout << "Numero " << numero << " e impar" << endl;
	}
	
	return 0;
}
