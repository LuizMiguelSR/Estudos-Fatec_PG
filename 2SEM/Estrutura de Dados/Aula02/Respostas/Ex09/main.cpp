#include <iostream>

using namespace std;

int main() {
	int angulo1, angulo2, angulo3;

	//Lendo os ângulos do triângulo, e verificando se todos são maior que zero	
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
	
	//Verificando se a soma dos ângulos do triângulo equivale a 180º. Se não for, então a figura geométrica não é um triângulo
	if ((angulo1 + angulo2 + angulo3) != 180) {
		cout << endl << "A soma dos angulos internos de um triangulo deve ser igual a 180!" << endl;
		return 0;
	}
	
	cout << endl;

	//Verificando os ângulos
	if (angulo1 == angulo2 && angulo2 == angulo3) { //Todos os ângulos iguais, então ele é equilátero
		cout << "Este e um triangulo equilatero";
	} else if (angulo1 == angulo2 || angulo2 == angulo3 || angulo1 == angulo3) { //Um par de ângulos igual, então é isósceles
		cout << "Este e um triangulo isosceles";
	} else { //Todos os ângulos são diferentes, então ele é escaleno
		cout << "Este e um triangulo escaleno";
	}
	
	cout << endl;
	
	return 0;
}
