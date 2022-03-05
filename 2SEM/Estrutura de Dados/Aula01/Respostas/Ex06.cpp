#include <stdio.h>
#include<locale.h>
#include<iostream>
#include<string.h>
#include<math.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    float id;
    printf("Informe a sua idade: ");
    scanf("%f", &id);

    if (id>=0 && id<=11) 
    {
        printf("\nVocê é uma criança!\n");
    } 
    else if (id>=12 && id<=17)
    {
        printf("\nVocê é adolescente!\n");
    } 
    else if (id>=18 && id<=49) 
    {
        printf("\nVocê é um adulto!");
    } 
    else if (id>=50) 
    {
        printf("\nVocê é um idoso!");
    } 
    else 
    {
        printf("\nIdade inválida!\n");
    }
    
    return 0;
}
