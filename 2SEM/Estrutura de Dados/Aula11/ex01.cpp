/*Criar uma classe matem�tica que contenham dois atributos da classe A, B inteiros e os seguintes m�todos: Entrada de dados; soma, multiplica��o, subtra��o e divis�o (fazer o tratamento da divis�o, n�o dividir por zero).*/
#include <iostream>
using namespace std;

class matematica{
    public:
    int a, b;

    void entrada(){
        cout<<"Digite dois valores: ";
        cin>>a>>b;
        
    }
    int getsoma(){
        return a + b;
    }
    int getmulti(){
        return a * b;
    }
    int getsubtr(){
        return a - b;
    }
    int getdivis(){
        if (a && b == 0) {
            return -1;
        } else {
            return a / b;
        }   
    }
};

int main(int argc, char** argv){
    matematica obj;

    obj.entrada();

    char op;
    cout<<"Digite o operador: ";
    cin>>op;

    switch (op){
    case '+':
        cout<<obj.getsoma();
        break;
    case '-':
        cout<<obj.getsubtr();
        break;
    case '*':
        cout<<obj.getmulti();
        break;
    case '/':
        cout<<obj.getdivis();
        break;
    default:
        break;
    }

    return 0;
}