#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

int fat(int v) {
    int f, n;
    f = 1; 
    n = v; 
    while (n>0) { 
        f = f * n; 
        n--; 
    } 
    return f;
} 

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");

    int v;

    cout<<"Digite o valor para fatorar: ";
    cin>>v;

    cout<<"\nO fatorial de "<<v<<" é "<<fat(v)<<endl;

    return 0;
}