#include <stdio.h>
#include <iostream>
#include <locale.h>
#include <conio.h>

int main() {
    setlocale(LC_ALL,"");
    system("cls");

    int c=0;
    float pa, pb;
    pa = 5000000 * 1.03;
    pb = 7000000 * 1.02;

    do {
        pa = pa * 1.03;
        pb = pb * 1.02;
        c = c + 1;
    } while (pb > pa);

    printf("O pa�s A vai demorar %d anos para ter uma popula��o maior que o pa�s B", c);
    
    return 0;
}