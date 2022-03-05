#include <iostream>
#include <math.h>

using namespace std;

int main() {
	float a, b, c;
	
	//Lendo os coeficientes da equa��o de segundo grau
	cout << "Entre com o valor do coeficiente A (diferente de 0): ";
	cin >> a;

	//Validando o coeficiente A	
	if (a == 0) {
		cout << endl << "Valor invalido para o coeficiente A!";
		return 0;
	}
	
	cout << endl << "Entre com o valor do coeficiente B: ";
	cin >> b;
	
	cout << endl << "Entre com o valor do coeficiente C: ";
	cin >> c;
	
	//C�lculo do Delta
	//b� - 4ac
	float delta = powf(b, 2) - 4 * a * c; //powf � uma fun��o contida em Math para calcular pot�ncias

	//Se delta � negativo, ent�o a equa��o de segundo grau n�o possui ra�zes no conjunto dos n�meros reais	
	if (delta < 0) {
		cout << endl << "A expressao quadratica nao possui raizes reais!";
		return 0;
	}
	
	//Se delta � nulo, ent�o a equa��o possui apenas uma raiz
	if (delta == 0) {
		float raiz = (-1 * b) / (2 * a);
		cout << endl << "Raiz unica da equacao e igual a: " << raiz;
		return 0;
	}
	
	//Caso contr�rio, utilize a f�rmula de Bhaskara para calcular as duas ra�zes
	//A fun��o sqrt (contida no cabe�alho Math) calcula a raiz quadrada de um n�mero
	float x1 = ((-1 * b) + (sqrt(delta))) / (2 * a);
	float x2 = ((-1 * b) - (sqrt(delta))) / (2 * a);
	
	cout << endl << "Raizes da equacao: x' = " << x1 << ", x'' = " << x2 << endl;
	
	return 0;
}
