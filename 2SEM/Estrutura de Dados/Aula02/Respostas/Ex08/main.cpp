#include <iostream>

using namespace std;

int main() {
	int ano;
	
	//Lendo o ano informado pelo usuário
	cout << "Informe um ano: ";
	cin >> ano;

	//Validando o ano (não pode ser negativo)
	if (ano < 0) {
		cout << endl << "Ano invalido!" << endl;
		return 0;
	}
	
	cout << endl;
	
	//Verifica se o ano é divisível por 400
	bool divisivelPor400 = (ano % 400 == 0);
	
	//Verifica se o ano é divisível por 4 e não por 100
	bool divisivelPor4 = (ano % 4 == 0 && ano % 100 != 0);

	//Um ano é considerado bissexto se uma das duas condições acima for verdadeira
	if (divisivelPor400 || divisivelPor4) {
		cout << "Ano " << ano << " e bissexto!";
	} else {
		cout << "Ano " << ano << " nao e bissexto!";
	}
	
	cout << endl;
	
	return 0;
}
