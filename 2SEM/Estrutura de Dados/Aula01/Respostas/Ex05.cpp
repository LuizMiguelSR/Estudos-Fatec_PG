#include <stdio.h>
#include<locale.h>
#include<iostream>
#include<string.h>
#include<math.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int n1;
    printf("Informe um número: ");
    scanf("%d", &n1);

    if (n1%2==0)
    {
        printf("\nO número é par!\n");
    } else {
        printf("\nO número é ímpar!\n");
    }
    
    return 0;
}
