#include <stdio.h>
#include<locale.h>
#include<iostream>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int a;
    printf("Informe o ano: ");
    scanf("%i", &a);

    if (a%4==0 || a%400==0) {
        printf("\nEste ano � bisexto!\n");
    } else if (a%100==0){
        printf("\nEste ano n�o � bisexto!\n");
    } else {
        printf("\nEste ano n�o � bisexto!\n");
    }
    
    return 0;
}
