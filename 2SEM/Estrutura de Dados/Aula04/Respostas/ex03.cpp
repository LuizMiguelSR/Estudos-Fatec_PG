#include <stdio.h>
#include <locale.h>
#include <iostream>
using namespace std;

int main() {
    setlocale (LC_ALL,"");
    system ("cls");

	int matA[2][3];
	int matB[3][2];
	int l, c;

	for (l=0; l<2; l++)	{
		for (c=0; c<3; c++) {
			cout<<"Digite um número para a Matriz A\n";
			cin>>matA[l][c];
		}
	}

	for (l=0; l<2; l++) {
        for (c=0; c<3; c++) {
            cout<<"\t"<<matA[l][c];
		}
		cout<<"\n";
	}

    cout<<"\n";
    
	for (l=0; l<3; l++)	{
		for (c=0; c<2; c++) {
			matB[l][c]=matA[c][l];
		}
	}

	for (l=0; l<3; l++)	{
        for (c=0; c<2; c++) {
            cout<<"\t"<<matB[l][c];
		}
		cout<<"\n";
	}

	return (0);
}