#include <iostream>

using namespace std;

int main() {
	float b, h;
	
	//Lendo os atributos do triângulo (base e altura)
	cout << "Informe a base do triangulo: ";
	cin >> b;
	
	if (b < 0) {
		cout << endl << "Valor invalido para a base do triangulo!" << endl;
		return 0;
	}
	
	cout << endl << "Informe a altura do triangulo: ";
	cin >> h;
	
	if (h < 0) {
		cout << endl << "Valor invalido para a altura do triangulo!" << endl;
		return 0;
	}

	//Calculando a área do triângulo (base x altura)
	float area = (b * h) / 2;
	cout << endl << "Area do triangulo: " << area << endl;
	
	return 0;
}
