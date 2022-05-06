#include <iostream> 
#include <iomanip>
#include <locale.h>
using namespace std;

bool primo(int x){
    int c = 0;
    for(int i=1; i<=x; i++){
        if(x%i==0){
            c++;
        }
    }
    if(c>2){
        return 0;
    } else {
        return 1;
    }
}

int main(int argc, char** argv){
    setlocale(LC_ALL,"");
    system("cls");

    int x;
    cout<<"Dgite o número para verificar: ";
    cin>>x;

    if (primo(x)==1){
        cout<<"\nÉ primo!"<<endl;
    } else {
        cout<<"\nNão é primo!"<<endl;
    }
    
    return 0;
}