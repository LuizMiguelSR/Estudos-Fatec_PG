#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");
    int anoBi(int ano);
        int main() {
            int ano;
            cout << "Digite o ano:" << endl;
            cin >> ano;
            cout << anoBi(ano);
            return 0;
        }

    int anoBi(int ano){
        if( (ano % 4 == 0) && (ano % 100 != 0)|| (ano % 400==0)){
            return 1;
        }
    return 0;
    }
}