#include <iostream>
#include <locale.h>
using namespace std;

int main(int argc, char** argv){
    setlocale(LC_ALL,"");

    int a=1, b=2, c=3;
    int vet[10]={0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
    int *pt1, *pt2, *pt3, *vaux;
    pt1=&a;
    pt2=&b;
    pt3=&c;

    cout<<"Endere�o de mem�ria de a = "<<&a;
    cout<<"\nEndere�o de mem�ria de pt1 = "<<pt1;
    cout<<"\nValor da vari�vel apontada por pt1 = "<<*pt1;

    vaux=&vet[1];
    cout<<"\nValor da vari�vel apontada por vaux = "<<*vaux;

    for(int i = 1; i<=10; i=i+2){
        vet[i]+=10;
        vaux=&vet[i];
        cout<<"\nNovo valor do vetor na posi��o "<<i<<" = "<<*vaux;
    }

    return 0;
}