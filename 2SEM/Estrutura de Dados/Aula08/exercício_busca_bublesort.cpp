#include <cstdlib>
#include <iostream>
#include <locale.h>

using namespace std;
//Parte 2 busca binaria
int busca(int tam, int* notas, int n){
    int ini = 0;
    int fim = tam -1;
    int meio;

    while(ini<=fim){
        meio = (ini + fim)/2;
        if (n < notas[meio]){
            fim = meio -1;
        } else if (n>notas[meio]){
            ini =  meio +1;
        } else return meio;
    } return -1;
}

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    int notas[10] = {9, 7, 5, 0, 10, 4, 8, 11, 6, 1};
    double aux;
//Parte 1 ordenação em Bubble sort
    for(int i=0; i<10; i++) {
        for(int j=0; j<9; j++) {
            if(notas[j] > notas[j+1]) {
                aux = notas[j];
                notas[j] = notas[j+1];
                notas[j+1] = aux;
            }
        }
    }

    for(int i=0; i<10; i++)
        cout << notas[i] << " ";
    cout << endl;
    
    int tam = sizeof(notas)/sizeof(int);
    int n;

    cout << "Qual número quer buscar? ";
    cin >> n;

    if (busca(tam, notas, n) == -1){
        cout << "\nO número "<<n<<" não se encontra no vetor.\n";
    } else {
        cout << "\nO número "<<n<<" está na posição "<<busca(tam, notas, n)<<"do vetor.\n";
    }
   
    return 0;
}