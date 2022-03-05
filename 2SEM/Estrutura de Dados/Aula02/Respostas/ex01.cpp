#include <stdio.h>
#include <iostream>
#include <locale.h>
#include <conio.h>

int main() {
    setlocale(LC_ALL,"");
    system("cls");

    int n1, qua;
    do {
        printf("Digite um número: ");
        scanf("%d", &n1);
        qua = n1 * n1;
        printf("O quadrado de %d é %d\n", n1, qua);
    } while (qua%6!=0);
    return 0;
}