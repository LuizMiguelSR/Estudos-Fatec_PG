#include <iostream>
using namespace std;

void shellsort(int org[], int tam){
    for(int gap=tam/2; gap>0; gap/=2){
        for(int i = gap; i < tam; i++) {
            int temp = org[i];
            int j;
            for(j = i; j >= gap && org[j-gap] > temp; j -= gap){
                org[j]=org[j-gap];
            }
            org[j] = temp;
        }
    }
}

int main (int argc, char** argv){
    int tam;
    cout<<"Insira o tamanho do vetor: ";
    cin>> tam;
    int org[tam];
    cout<<"Insira os valores do vetor: \n";
    for(int i=0; i < tam; i++){
        cin>>org[i];
    }
    shellsort(org, tam);
    cout<<"Vetor organizado: ";
    for(int i=0; i < tam; i++){
        cout<<org[i]<<" ";
    }
    cout<<endl;
    return 0;
}