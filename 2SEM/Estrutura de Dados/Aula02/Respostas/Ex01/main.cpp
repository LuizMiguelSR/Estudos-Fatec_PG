#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
    //Variáveis que serão utilizadas nas expressões
    
    int a = 5, b = 3, c = 12; //Declaração em única linha
    cout << "Variaveis" << endl;
    cout << "a = " << a << ", ";
    cout << "b = " << b << ", ";
    cout << "c = " << c << endl;
    
    //Variável que armazenará o resultado das expressões
    int r;

	//Nota: NOT = !, OR = || e AND = &&
	cout << endl << "Expressoes" << endl;
    
    //a)	((a * b) / 3) + 10
    r = ((a * b) / 3) + 10;
    cout << "((a * b) / 3) + 10 = " << r << endl;
    
    //b)	not (b * 5)
    r = !(b * 5);
    cout << "not (b * 5) = " << r << endl;
    
    //c)	b * 5;
    r = b * 5;
    cout << "b * 5 = " << r << endl;
    
    //d)	c + (b or a);
    r = c + ( b || a);
    cout << "c + (b or a) = " << r << endl;
    
    //e)	c + b;
    r = c + b;
    cout << "c + b = " << r << endl;
    
    //f)	a and b;
    r = a && b;
    cout << "a and b = " << r << endl;
    
    //g)	a > 10;
    r = a > 10;
    cout << "a > 10 = " << r << endl;
    
    //h)	c == 12;
    r = (c == 12);
    cout << "c == 12 = " << r << endl;
    
    //i)	(b * a) < b;
    r = (b * a) < b;
    cout << "(b * a) < b = " << r << endl;
    
    //j)	a = a + 20;
    r = (a = a + 20);
    cout << "a = a + 20 = " << r << endl;
    
    //k)	not (a > b);
    r = !(a > b);
    cout << "not (a > b) = " << r << endl;
    
	return 0;
}
