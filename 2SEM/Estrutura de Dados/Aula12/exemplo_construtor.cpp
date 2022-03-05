/*Crie uma classe chamada Triangulo onde crie variáveis da classe,  os métodos que são  2, o primeiro é para ver se é triangulo e o segundo é para ver que tipo de triangulo é, os três abaixo: Escaleno ? os 3 lados diferentes;
Isósceles ? 2 lados iguais; Equilátero ? os 3 lados iguais. Obs. Não esquecer de verificar primeiramente se é triangulo.*/
#include <iostream>
using namespace std;

class triangulo{
    public:

    int a, b, c;

    triangulo (int a, int b, int c){
        this->a=a;
        this->b=b;
        this->c=c;
    }

    bool etriangulo(){
        if(a<b+c && b<a+c && c<a+b){ 
            return true; 
        }else{ 
            return false;
        } 
    }

    string tipotriangulo(){
        if(etriangulo()==true){
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
    int l1, l2, l3;

    cout<<"Digite os lados do triangulo: ";
    cin>>l1>>l2>>l3;

    triangulo obj(l1, l2, l3);

    cout<<obj.tipotriangulo()<<"\n";

    return 0;
}