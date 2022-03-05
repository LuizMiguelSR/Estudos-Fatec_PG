#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

int posi(int x){
    if ((x%2==0)||(x>0)) {
        return 0;
    } else {
        return 1;
    }
}

int main(int argc, char** argv){
    setlocale(LC_ALL,"");
    system("cls");

    
    return 0;
}