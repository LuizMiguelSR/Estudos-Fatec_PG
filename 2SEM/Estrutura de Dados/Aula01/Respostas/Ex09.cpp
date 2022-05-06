#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include<locale.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int i, n, maior = 0, menor = 0, soma = 0, media;

    for (i=1; i < 5; i++) {
        printf("Informe um número: ");
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
    printf("\nO número maior é %d\n", maior);
    printf("\nO número menor é %d\n", menor);
    printf("\nA média é %d\n", media);
    
    return 0;
}
