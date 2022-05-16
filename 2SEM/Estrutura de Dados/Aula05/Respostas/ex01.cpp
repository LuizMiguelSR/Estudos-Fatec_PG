#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

float fahrenheit(float c) {
    float f=(c*9/5)+32;
    return f;
}
float celsius(float f) {
    float c=(f-32)*5/9;
    return c;
}

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");

        float c, f;
        int sect;
        cout<<"Escolha uma temperatura 1 para Fahrenheit, 2 para celsius ";
        cin>>sect;

        if (sect == 1) {
            cout<<"\nDigite a temperatura em Celsius: ";
            cin>>c;
            cout<<"\nA temperatura em fahrenheit é : "<<fahrenheit(c);
        } else if (sect == 2) {
            cout<<"\nDigite a temperatura em Fahrenheit: ";
            cin>>c;
            cout<<"\nA temperatura em Celsius é : "<<celsius(f);
        } else {
            cout<<"\nCódigo inválido";
        }

    return 0;
}