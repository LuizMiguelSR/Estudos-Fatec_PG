#include <stdio.h>
#include <conio.h>
#include <locale.h>
#include <iostream>
using namespace std;

int main() {
    setlocale (LC_ALL,"");
    system ("cls");

    int index = 0; 
    char value[4];

    
    for (index = 0; index < 10; index++){
        cout<<"Digite uma letra: ";
        cin>>value[index];
    }
        
    cout<<"Ao contrário é:";

    for(index = index; index >= 0; index--){
        cout<<value[index];
    }
getchar();
system("pause");
return(0); 
}