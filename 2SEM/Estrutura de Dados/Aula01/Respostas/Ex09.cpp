#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include<locale.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int i, n, maior = 0, menor = 0, soma = 0, media;

    for (i=1; i < 5; i++) {
        printf("Informe um n�mero: ");
        scanf("%d", &n);
        soma = soma + n;
        if (i==1) {
            maior = n;
            menor = n;
        } else {
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
    }
    media = soma / 4;
    printf("\nO n�mero maior � %d\n", maior);
    printf("\nO n�mero menor � %d\n", menor);
    printf("\nA m�dia � %d\n", media);
    
    return 0;
}
