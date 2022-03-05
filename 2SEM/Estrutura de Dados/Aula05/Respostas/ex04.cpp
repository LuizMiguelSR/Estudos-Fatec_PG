#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

bool bis(int x){

	if((x%4==0 && x%100!=0) || (x%400==0))	{
		return 1;
	} else {
		return 0;
	}
	
}	
int main(int argc, char *argv[]) {
	setlocale(LC_ALL,"");
    system("cls");
    
	int x;
    cin>>x;
    cout<<bis(x)<<"\n";
    
    return 0;
}