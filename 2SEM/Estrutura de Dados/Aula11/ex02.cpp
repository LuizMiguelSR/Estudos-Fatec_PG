/*Crie uma classe chamada Triangulo onde crie variáveis da classe,  os métodos que são  2, o primeiro é para ver se é triangulo e o segundo é para ver que tipo de triangulo é, os três abaixo: Escaleno ? os 3 lados diferentes;
Isósceles ? 2 lados iguais; Equilátero ? os 3 lados iguais. Obs. Não esquecer de verificar primeiramente se é triangulo.*/
#include <iostream>
using namespace std;

class triangulo{
    public:

    int a, b, c;

    bool etriangulo(){
        if(a<b+c && b<a+c && c<a+b){ 
            return 1; 
        }else{ 
            return 0;
        } 
    }

    string tipotriangulo(){
        if(etriangulo()==1){
            if (a==b && b==c){
                return "Triângulo Equilatero";
            } else if (a==b || b==c || c==a) {
                return "Triângulo Isosceles";
            } else {
                return "Triângulo Escaleno";
            }
        }else{
            return "Não forma Triângulo";
        }       
    }

};

int main(int argc, char** argv){
    triangulo obj;

    cout<<"Digite os lados do triangulo: ";
    cin>>obj.a>>obj.b>>obj.c;

    cout<<obj.tipotriangulo()<<"\n";

    return 0;
}