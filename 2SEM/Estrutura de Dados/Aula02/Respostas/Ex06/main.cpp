#include <iostream>

using namespace std;

int main() {
	int numero;
	
	//Lendo o n�mero do usu�rio
	cout << "Digite um numero: ";
	cin >> numero;
	
	cout << endl;
	
	//Verificando se o n�mero � par ou �mpar
	//Para isto, basta verificar o resto da divis�o do n�mero por 2.
	//Exemplos: 8 / 2 = 0 (resto 0); 13 / 2 = 6 (resto 1)
	if (numero % 2 == 0) {
		cout << "Numero " << numero << " e par" << endl;
	} else {
		cout << "Numero " << numero << " e impar" << endl;
	}
	
	return 0;
}
