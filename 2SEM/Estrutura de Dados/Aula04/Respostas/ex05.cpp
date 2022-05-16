#include <stdio.h>
#include <locale.h>
#include <iostream>
using namespace std;
int main () {
    setlocale(LC_ALL,"");
    system("cls");

    int l, c, som=0;
    float mat [6][6];

    for(l=0; l < 6; l++) {
        for(c=0; c < 6; c++) {
            cout<<"Digite um numero\n";
            cin>>mat[l][c];
        }
    }

    cout<<"\nExibindo a Matriz\n";

    for(l=0; l < 6; l++) {
        for(c=0; c < 6; c++) {
            cout<<"\t"<<mat[l][c];
        }
        cout<<"\n";
    }

    cout<<"\nExibindo resultados\n";

    for(l=0; l < 6; l++) {
        for(c=0; c < 6; c++) {
            if (l > c) {
                som += mat[l][c];
            }
        }
    }

    cout<<"\nA soma dos numeros abaixo da  diagonal principal é: "<<som<<endl;

    return 0;
}