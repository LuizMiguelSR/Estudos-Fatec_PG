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
        printf("\nVoc� � uma crian�a!\n");
    } 
    else if (id>=12 && id<=17)
    {
        printf("\nVoc� � adolescente!\n");
    } 
    else if (id>=18 && id<=49) 
    {
        printf("\nVoc� � um adulto!");
    } 
    else if (id>=50) 
    {
        printf("\nVoc� � um idoso!");
    } 
    else 
    {
        printf("\nIdade inv�lida!\n");
    }
    
    return 0;
}
