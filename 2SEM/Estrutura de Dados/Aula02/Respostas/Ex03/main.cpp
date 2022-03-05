#include <iostream>

using namespace std;

int main() {
	float b, h;
	
	//Lendo os atributos do retângulo (base e altura)
	cout << "Informe a base do retangulo: ";
	cin >> b;
	
	if (b < 0) {
		cout << endl << "Valor invalido para a base do retangulo!" << endl;
		return 0;
	}
	
	cout << endl << "Informe a altura do retangulo: ";
	cin >> h;
	
	if (h < 0) {
		cout << endl << "Valor invalido para a altura do retangulo!" << endl;
		return 0;
	}

	//Calculando a área do retângulo (base x altura)
	float area = b * h;
	cout << endl << "Area do retangulo: " << area << endl;
	
	return 0;
}
