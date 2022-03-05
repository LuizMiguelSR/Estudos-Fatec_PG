/*Crie uma classe chamada Triangulo onde crie vari�veis da classe,  os m�todos que s�o  2, o primeiro � para ver se � triangulo e o segundo � para ver que tipo de triangulo �, os tr�s abaixo: Escaleno ? os 3 lados diferentes;
Is�sceles ? 2 lados iguais; Equil�tero ? os 3 lados iguais. Obs. N�o esquecer de verificar primeiramente se � triangulo.*/
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
                return "Tri�ngulo Equilatero";
            } else if (a==b || b==c || c==a) {
                return "Tri�ngulo Isosceles";
            } else {
                return "Tri�ngulo Escaleno";
            }
        }else{
            return "N�o forma Tri�ngulo";
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