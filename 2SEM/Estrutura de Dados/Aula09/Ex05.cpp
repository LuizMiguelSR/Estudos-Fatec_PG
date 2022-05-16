#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

void ordenar(int vet1[], int vet2[], int x){

}
int main(){
    setlocale(LC_ALL,"");
    system("cls");
    int x[5];
    int busca;
    
    for(int i=0;i<5;i++){
        cout<<"Digite o "<<i<<"º: ";
        cin>>x[i];
    }
    
    ordenar(x, 5);

    cout<<"\nVetor organizado"<<endl;
    for(int k=0;k<5;k++){
        cout<<x[k]<<" ";
    }

    return 0;
}