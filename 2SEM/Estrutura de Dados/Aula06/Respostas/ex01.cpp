#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
//vetor auxiliar e vetor extraido
float media(int vet[], int tam){
    float soma = 0;
    for (int i=0; i<tam; i++){
        soma = soma+vet[i];
    }
    return soma/tam;
}

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");
//Definindo o tamanho do vetor
    int tam;
    cout<<"Digite o tamanho do vetor: ";
    cin>>tam;
    int x[tam];

//Populando o vetor
    for (int i=0; i<tam; i++){ 
        cout<<"Digite um número: ";
        cin>>x[i];
    }
    cout<<media(x,tam);
    return 0;
}