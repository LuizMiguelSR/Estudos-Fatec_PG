#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include<locale.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int l1, l2, l3;

    printf("Digite os lados do tri�ngulo\n");
    scanf ("%i %i %i", &l1, &l2, &l3);
    if (l1 == l2 && l2 == l3) {
        printf("Tri�ngulo EQUILATERO");
    } else if (l1 != l2 && l2 != l3 && l1 != l3) {
        printf("Tri�ngulo ESCALENO");
    } else {
        printf("Tri�ngulo ISOSCELES");
    }
    
    return 0;
}
