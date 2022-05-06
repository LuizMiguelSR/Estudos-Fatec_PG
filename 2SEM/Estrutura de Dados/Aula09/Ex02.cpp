#include <iostream>
using namespace std;

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

int main(int argc, char *argv[]){
	int array[7] = {3,6,1,2,8,10,4};
    cout<<"VETOR DESORGANIZADO\n";
	for(int i = 0; i < 7; i++){ 
		cout << array[i] << ' ';
	}
	cout << endl;
    cout<<"\n\n";
    cout<<"VETOR ORGANIZADO\n";
	quicksort(array, 0, 7);
	for(int i = 0; i < 7; i++){
		cout << array[i] << ' ';
	}
    
	return 0;
}