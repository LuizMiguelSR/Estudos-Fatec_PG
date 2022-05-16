#include <iomanip>
#include <iostream>
#include <locale.h>
using namespace std;

float adi (float x, float y) {
    float a=x+y;
    return a;
}
float sub (float x, float y) {
    float s=x-y;
    return s;
}
float mul (float x, float y) {
    float m=x*y;
    return m;
}
float div (float x, float y) {
    float d=x/y;
    return d;
}

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");
    
        int op;
        float x,y;

        do {
            cout<<"\nDigite dois n?meros e escolha uma opera??o 1 para soma, 2 para subtra??o, 3 para multiplica??o, 4 para divis?o e 0 para encerrar "<<"\n";
            cin>>x>>y>>op;

            if (op != 0) {
                switch (op) {
                case 1:
                    cout<<"\nO resultado ? : "<<fixed<<setprecision(2)<<adi(x,y);
                    break;
                case 2:
                    cout<<"\nO resultado ? : "<<fixed<<setprecision(2)<<sub(x,y);
                    break;
                case 3:
                    cout<<"\nO resultado ? : "<<fixed<<setprecision(2)<<mul(x,y);
                    break;
                case 4:
                    cout<<"\nO resultado ? : "<<fixed<<setprecision(2)<<div(x,y);
                    break;
                default:
                    cout<<"\nComando inv?lido digite novamente.";
                    break;
                }                
            } else {
                cout<<"\nEncerrando...";
            }

        } while (op != 0);
    return 0;
}