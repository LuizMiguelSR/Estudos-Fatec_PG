#include <stdio.h>
#include <locale.h>
#include <iostream>
using namespace std;
int main (){
    setlocale(LC_ALL,"");
    system("cls");
    int vet1[7], vet2[7], vet3[7], vet4[7], i=0;

    cout<<"Vamos digitar os valores dos vetores\n";

    for(i=0; i<7; i++){
        cout<<"Digite um número: ";
        cin>>vet1[i];
        cout<<"Digite outro número: ";
        cin>>vet2[i];
        cout<<"Digite a operação 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão: ";
        cin>>vet3[i];
        if (vet3[i]==1) {
            vet4[i]=vet1[i]+vet2[i];
        } else if (vet3[i] == 2) {
            vet4[i]=vet1[i]-vet2[i];
        } else if (vet3[i] == 3) {
            vet4[i]=vet1[i]*vet2[i];
        } else {
            vet4[i]=vet1[i]/vet2[i];
        }
    }

    cout<<"Resultados\n";

    for(i=0; i<7; i++){
        cout<<"Resultado da "<<i+1<<"º operação é "<<vet4[i]<<endl;
    }

    return 0;
}