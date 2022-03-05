#include <iostream>

using namespace std;

int main() {
	float n1, n2, n3, n4;
	float menor, maior, media;

	//Lendo os quatro números do usuário
	//A partir do segundo, faz-se comparações para verificar se o novo número é
	//menor ou maior que os anteriores
	cout << "Digite o primeiro numero: ";
	cin >> n1;
	
	menor = n1;
	maior = n1;
	
	cout << endl << "Digite o segundo numero: ";
	cin >> n2;
	
	if (n2 < menor) {
		menor = n2;
	} else if (n2 > maior) {
		maior = n2;
	}
	
	cout << endl << "Digite o terceiro numero: ";
	cin >> n3;
	
	if (n3 < menor) {
		menor = n3;
	} else if (n3 > maior) {
		maior = n3;
	}
	
	cout << endl << "Digite o quarto numero: ";
	cin >> n4;
	
	if (n4 < menor) {
		menor = n4;
	} else if (n4 > maior) {
		maior = n4;
	}
	
	//Calculando a média artimética
	media = (n1 + n2 + n3 + n4) / 4;

	//Exibindo os resultados	
	cout << endl << "Maior numero digitado: " << maior << endl;
	cout << "Menor numero digitado: " << menor << endl;
	cout << "Media artimetica dos numeros: " << media << endl;
	
	return 0;
}
