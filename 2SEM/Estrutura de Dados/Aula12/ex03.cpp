/*Escreva uma classe ?EntradaDeCinema? com a seguinte estrutura (dados): 
?	Int dia do filme
?	float hor�rio
?	int sala
?	float valor 

E com as seguintes a��es (m�todos):
?	Construtor: com a finalidade de inicializar todos os atributos.
?	CalculaDesconto: que deve receber como par�metro a data de nascimento do cliente (do tipo Data) e caso seja menor de 12 anos, deve ser dado um desconto de 50% no valor normal.
?	CalculaDesconto: que deve receber como par�metro a data de nascimento do cliente (do tipo Data) e o n�mero de sua carteira de estudante (do tipo int). Se o estudante tiver idade entre 12 e 15 anos, deve ser dado um desconto de 40%, de 16 a 20 um desconto de 30% e mais que 20 anos um desconto de 20% no valor normal.
?	CalculaDescontoHor�rio: esse m�todo deve dar um desconto de 10% sobre o valor aferido ap�s todas as outras op��es de desconto, caso o hor�rio do filme seja antes das 16 horas.
?	toString(): que deve imprimir todos os dados do ingresso.
*/
#include <iostream>
using namespace std;

class entradadecinema{
    public:

    int diadofilme, sala;
    float horario, valor;

    entradadecinema(){
        this->diadofilme=diadofilme;
        this->sala=sala;
        this->horario=horario;
        this->valor=valor;
    }

    bool emaiorouigual(int valor){
        

    }
    bool emenorouigual(int valor){

    }
    bool ediferente(int valor){

    }

};

int main(int argc, char** argv){

    return 0;
}