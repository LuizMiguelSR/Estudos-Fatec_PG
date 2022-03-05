#include <iomanip>
#include <iostream>
#include <locale.h>
using namespace std;


bool primo(int x);

int main(int argc, char *argv[]) {
	setlocale(LC_ALL,"");
    system("cls");
    
	int x;
    cin>>x;
    cout<<primo(x)<<"\n";
    
    
    return 0;
}

bool primo(int x){
	int c=0;
	
	for(int i=1; i<=x; i++){
		if(x % i == 0){
			c++;
		}
	}
	
	if(c>2)	{
		return 0;
	}
	
	else{
		return 1;
	}
	
}	
