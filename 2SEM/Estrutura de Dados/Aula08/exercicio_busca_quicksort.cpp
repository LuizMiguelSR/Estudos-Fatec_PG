#include <iostream>
#include <locale.h>
using namespace std;

//Parte 1 metódo com algoritmo de ordenação
void quicksort(int valores[], int inicio, int fim){
	int i, j, pivo, aux;
	i = inicio;
	j = fim-1;
	pivo = valores[(inicio + fim) / 2];
	while(i <= j){
		while(valores[i] < pivo && i < fim){
			i++;
		}
		while(valores[j] > pivo && j > inicio){
			j--;
		}
		if(i <= j){
			aux = valores[i];
			valores[i] = valores[j];
			valores[j] = aux;
			i++;
			j--;
		}
	}
	if(j > inicio){
        quicksort(valores, inicio, j+1);
    }	
	if(i < fim){
        quicksort(valores, i, fim);
    }
}

//Parte 2 metódo com a busca binária
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

int main(int argc, char *argv[]){
	setlocale(LC_ALL,"");

//chamada do metódo com algoritmo de ordenação do tipo quick sort
	int valores[10] = {5, 8, 1, 2, 7, 3, 6, 9, 4, 10};
    cout<<"VETOR DESORGANIZADO\n";
	for(int i = 0; i < 10; i++){ 
		cout << valores[i] << ' ';
	}
	cout << endl;
    cout<<"\n";
    cout<<"VETOR ORGANIZADO\n";
	quicksort(valores, 0, 10);
	for(int i = 0; i < 10; i++){
		cout << valores[i] << ' ';
	}

//chamada do metódo com busca binária
    int tam = sizeof(valores)/sizeof(int);
    int n;
	cout<<"\n";
    cout << "\nQual número quer buscar? ";
    cin >> n;
    if (busca(tam, valores, n) == -1){
        cout << "\nO número "<<n<<" nao se encontra no vetor.\n";
    } else {
        cout << "\nO número "<<n<<" esta na posição "<<busca(tam, valores, n)<<" do vetor.\n";
    }    
	return 0;
}