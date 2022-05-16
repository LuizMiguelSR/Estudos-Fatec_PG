#include <stdio.h>
#include <iostream>
#include <locale.h>
using namespace std;
int main(){
    setlocale(LC_ALL,"");
    system("cls");

    int vet[8], aux, i, x;
    for(i=0; i<8; i++){
        cout<<"Digite um número: ";
        cin>>vet[i];
        
    }

    for (i=0; i<8; i++){
        for(x=i+1; x<8; x++){
            if (vet[i]>vet[x]){
                aux=vet[i];
                vet[i]=vet[x];
                vet[x]=aux;
            }
        }
    }

    for (i=0; i<8; i++) {
        cout<<vet[i];
    }
    return 0;
}