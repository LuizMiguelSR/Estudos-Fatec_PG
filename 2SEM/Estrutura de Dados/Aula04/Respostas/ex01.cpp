#include <stdio.h>
#include <locale.h>
#include <iostream>
using namespace std;
int main () {
    setlocale(LC_ALL,"");
    system("cls");

    int l, c, som=0;
    float mat [4][4];

    for(l=0; l < 4; l++) {
        for(c=0; c < 4; c++) {
            cout<<"Digite um numero\n";
            cin>>mat[l][c];
        }
    }

    cout<<"\nExibindo a Matriz\n";

    for(l=0; l < 4; l++) {
        for(c=0; c < 4; c++) {
            cout<<"\t"<<mat[l][c];
        }
        cout<<"\n";
    }

    cout<<"\nExibindo resultados\n";

    for(l=0; l < 4; l++) {
        for(c=0; c < 4; c++) {
            if (l==c) {
                som += mat[l][c];
            }
        }
    }

    cout<<"\nO somatório da diagonal principal é: "<<som;

    return 0;
}