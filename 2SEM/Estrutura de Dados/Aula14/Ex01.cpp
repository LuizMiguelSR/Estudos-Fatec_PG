#include <iostream>
#include <locale.h>
using namespace std;

int main(int argc, char** argv){
    setlocale(LC_ALL,"");

    int a, b, soma;
    int *pont1, *pont2;
    
    cout<<"Digite os valores de a e b: ";
    cin>>a>>b;
    pont1=&a;
    pont2=&b;
    cout<<"Endere�o de memoria de a = "<<&a;
    cout<<"\nEndere�o de memoria de b = "<<&b;
    cout<<"\nEndere�o de memoria de pont1 = "<<pont1;
    cout<<"\nEndere�o de memoria de pont2 = "<<pont2;
 
    pont1=&soma;
    soma = a + b;
    
    cout<<"\nEndere�o de memoria de pont1 = "<<*pont1;

    return 0;
}