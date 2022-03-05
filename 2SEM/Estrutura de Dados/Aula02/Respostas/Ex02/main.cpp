#include <iostream>
#include <math.h>

using namespace std;

int main() {
	float a, b, c;
	
	//Lendo os coeficientes da equação de segundo grau
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
	
	//Cálculo do Delta
	//b² - 4ac
	float delta = powf(b, 2) - 4 * a * c; //powf é uma função contida em Math para calcular potências

	//Se delta é negativo, então a equação de segundo grau não possui raízes no conjunto dos números reais	
	if (delta < 0) {
		cout << endl << "A expressao quadratica nao possui raizes reais!";
		return 0;
	}
	
	//Se delta é nulo, então a equação possui apenas uma raiz
	if (delta == 0) {
		float raiz = (-1 * b) / (2 * a);
		cout << endl << "Raiz unica da equacao e igual a: " << raiz;
		return 0;
	}
	
	//Caso contrário, utilize a fórmula de Bhaskara para calcular as duas raízes
	//A função sqrt (contida no cabeçalho Math) calcula a raiz quadrada de um número
	float x1 = ((-1 * b) + (sqrt(delta))) / (2 * a);
	float x2 = ((-1 * b) - (sqrt(delta))) / (2 * a);
	
	cout << endl << "Raizes da equacao: x' = " << x1 << ", x'' = " << x2 << endl;
	
	return 0;
}
