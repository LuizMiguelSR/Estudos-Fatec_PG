#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
int fatorial (int n ){
    if ((n==0)||(n==1))
        return 1;
    return (n-1)*fatorial(n-1);
}
int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");

    int fat;
    cout << "Deseja calcular o fatorial de quanto?" <<endl;
    cin >> fat;
    cout << fat << "! é " << fatorial(fat);
    cout<<"\n";
    return 0;
}