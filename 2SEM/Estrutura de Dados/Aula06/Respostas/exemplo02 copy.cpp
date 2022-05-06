#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
int fibonacci(int num ){
    if (num == 1 || num == 2)
        return 1;
    else
        return fibonacci(num-1) + fibonacci(num - 2);
}
int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");

    int n;
    cout << "Deseja calcular o fibonacci de quanto?" <<endl;
    cin >> n;
    cout << fibonacci(n) << "\n";
    for (int i=1; i<=n; i++){
        cout<<fibonacci(i)<<"\t";
    }
    return 0;
}