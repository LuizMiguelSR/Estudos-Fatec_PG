#include <stdio.h>
#include<locale.h>
#include<iostream>
#include<string.h>
#include<math.h>
 
int main() {

    setlocale(LC_ALL,"");
    system("cls");

    int n1;
    printf("Informe um n�mero: ");
    scanf("%d", &n1);

    if (n1%2==0)
    {
        printf("\nO n�mero � par!\n");
    } else {
        printf("\nO n�mero � �mpar!\n");
    }
    
    return 0;
}
