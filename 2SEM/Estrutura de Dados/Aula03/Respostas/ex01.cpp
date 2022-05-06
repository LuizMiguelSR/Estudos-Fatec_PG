#include <stdio.h>
#include <conio.h>
#include <locale.h>
#include <iostream>
using namespace std;

int main() {
    setlocale (LC_ALL,"");
    system ("cls");
    int i=0, vet[10], x;

    do {
        cout<<"Digite um n�mero: \n";
        cin>>x;
        if(x>0){
            vet[i]=x;
            i++;
        }
    } while (i<10 && x>0);

    for (int y=0; y<i; y++){
        vet[y]=vet[y]*(-1);
        cout<<vet[y]<<"\n";
    }

    
getchar();
system("pause");
return(0); 
}