#include <stdio.h>
#include <iostream>
#include <locale.h>
#include <conio.h>

int main() {
    setlocale(LC_ALL,"");
    system("cls");

    int n1, c=0;
    do {
        printf("Digite um número: ");
        scanf("%d", &n1);
        if (n1 >= 100 && n1 <= 200) {
            c++;
        }
    } while (n1!=0);
    printf("Foram digitados %d números entre 100 e 200", c);
    return 0;
}