#include <iostream>

using namespace std;

// Bubblesort
void ordenar(int vet[], int tamanho){
    int k, j, aux;

    for (k = 1; k < tamanho; k++) {
        for (j = 0; j < tamanho - 1; j++) {
            if (vet[j] > vet[j + 1]) {
                aux          = vet[j];
                vet[j]     = vet[j + 1];
                vet[j + 1] = aux;
            }
        }
    }
}

int buscaBi(int vet[], int tamanho, int chave){
    int primeiro = 0;
    int ultimo = tamanho - 1;
    int meio;
    
    while(primeiro <= ultimo){
        meio = (primeiro + ultimo) / 2;
        
        if (vet[meio] == chave){
            return meio;
            
        } else {
            if (chave>vet[meio]){
                primeiro = meio + 1;
            }else{
                ultimo = meio - 1;
            }
        }
    }
    
    return -1;
}

int main(){
    int x[10];
    int busca;
    
    for(int i=0;i<10;i++){
        cout << "Digite o " << i << "º: ";
        cin >> x[i];
    }
    
    ordenar(x, 10);
    
    for(int k=0;k<10;k++){
        cout << x[k] << "\t";
    }
    
    cout << "\nDigite o numero que você está buscando: ";
    cin >> busca;
    
    cout << "O valor se localiza no indice: " << buscaBi(x, 10, busca);

    return 0;
}