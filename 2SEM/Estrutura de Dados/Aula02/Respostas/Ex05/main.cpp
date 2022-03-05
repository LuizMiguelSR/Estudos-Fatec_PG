#include <iostream>

using namespace std;

int main() {
	float b, B, h;
	
	//Lendo os atributos do trapézio (base menor, base maior e altura)
	cout << "Informe a base menor do trapezio: ";
	cin >> b;
	
	if (b < 0) {
		cout << endl << "Valor invalido para a base menor do trapezio!" << endl;
		return 0;
	}

	cout << endl << "Informe a base maior do trapezio: ";
	cin >> B;
	
	if (B < 0) {
		cout << endl << "Valor invalido para a base maior do trapezio!" << endl;
		return 0;
	} else if (B < b) {
		cout << endl << "A base maior e menor do que a base menor!" << endl;
		return 0;
	}
	
	cout << endl << "Informe a altura do trapezio: ";
	cin >> h;
	
	if (h < 0) {
		cout << endl << "Valor invalido para a altura do trapezio!" << endl;
		return 0;
	}

	//Calculando a área do trapézio (((base maior + base menor) x altura) / 2)
	float area = ((b + B) * h) / 2;
	cout << endl << "Area do trapezio: " << area << endl;
	
	return 0;
}
