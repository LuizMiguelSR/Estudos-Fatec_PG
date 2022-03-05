#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
char resg[5]={'a', 'a', 'a', 'a', 'a'};
char resposta(char res[]){
    int som = 0;  
    for (int i=0; i<5;i++) {
        if (resg[i]==res[i]){
            som = som + 1;
        }
    }
    return som;
}

int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");
    char res[5], resg[5];

    for (int i = 0; i<5; i++) {
        cout<<"Digite a resposta: ";
        cin>>res[i];
    }
    cout<<resposta(res);
    return 0;
}