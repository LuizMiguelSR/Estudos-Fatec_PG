#include <iostream>
#include <locale.h>
using namespace std;

void calcularImpar(int *X, int *Y){
    for(int i = *X; i<=*Y; i++){
        if(i%2!=0){
            cout<<i;
            if(i!=*Y){
                cout<<", ";
            } else {
                cout<<" e FIM!";
            }
        }
    }
}

int main(int argc, char** argv){
    setlocale(LC_ALL,"");

    int a, b;

    cout<<"Valor de a e b: ";
    cin>>a>>b;

    cout<<"\nOs números impares entre "<<a<<" e "<<b<<" são: ";

    calcularImpar(&a, &b);

    return 0;
}