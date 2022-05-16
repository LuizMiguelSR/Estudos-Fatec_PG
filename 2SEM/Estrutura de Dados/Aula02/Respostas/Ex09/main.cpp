#include <iostream>

using namespace std;

int main() {
	int angulo1, angulo2, angulo3;

	//Lendo os �ngulos do tri�ngulo, e verificando se todos s�o maior que zero	
	cout << "Digite o primeiro angulo de um triangulo: ";
	cin >> angulo1;
	
	if (angulo1 <= 0) {
		cout << endl << "Angulo invalido!";
		return 0;
	}
	
	cout << endl << "Digite o segundo angulo de um triangulo: ";
	cin >> angulo2;
	
	if (angulo2 <= 0) {
		cout << endl << "Angulo invalido!";
		return 0;
	}
	
	cout << endl << "Digite o terceiro angulo de um triangulo: ";
	cin >> angulo3;
	
	if (angulo3 <= 0) {
		cout << endl << "Angulo invalido!";
		return 0;
	}
	
	//Verificando se a soma dos �ngulos do tri�ngulo equivale a 180�. Se n�o for, ent�o a figura geom�trica n�o � um tri�ngulo
	if ((angulo1 + angulo2 + angulo3) != 180) {
		cout << endl << "A soma dos angulos internos de um triangulo deve ser igual a 180!" << endl;
		return 0;
	}
	
	cout << endl;

	//Verificando os �ngulos
	if (angulo1 == angulo2 && angulo2 == angulo3) { //Todos os �ngulos iguais, ent�o ele � equil�tero
		cout << "Este e um triangulo equilatero";
	} else if (angulo1 == angulo2 || angulo2 == angulo3 || angulo1 == angulo3) { //Um par de �ngulos igual, ent�o � is�sceles
		cout << "Este e um triangulo isosceles";
	} else { //Todos os �ngulos s�o diferentes, ent�o ele � escaleno
		cout << "Este e um triangulo escaleno";
	}
	
	cout << endl;
	
	return 0;
}
