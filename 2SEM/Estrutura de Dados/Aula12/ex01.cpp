#include <cstdlib>
#include <iostream>

using namespace std;

class conta{
	
      public:
      	
      int numero;
      double saldo;
      double limite;
      string nome;
      
      conta(int num, double s, double l, string n){
                
				numero=num; saldo=s; limite=l;
                nome=n;
        }

		bool saca(double valor) {
     		if (saldo + limite < valor) {
       			return false;
     		}
     		else {
       			saldo = saldo - valor;
       			return true;
     		}
   
 		}
 
 		double deposita(double quantidade) {
     		saldo =saldo + quantidade;
     		return saldo;
   		}
 
  		bool transfere(conta destino, double valor) {
    		bool retirou = saca(valor);
    		if (retirou == false) {
      		// não deu pra sacar!
      			return false;
    		}
    		else {
      			destino.deposita(valor);
      			return true;
    		}
  
		}
};

int main(int argc, char** argv) {
	
	double saldo, limite;
	string nome;
	int numero;
	
	cout<<"Entre com o nome, numero da conta, saldo e limite \n";
	cin>>nome>>numero>>saldo>>limite;
	
	conta Fa23(numero, saldo, limite, nome); // criando o objeto Fa23
	conta Fa24(236,1000, 100, "Paulo");   // criando o objeto Fa24
	
	if(Fa23.transfere(Fa24,1200)>0){
			cout<<"Tranferencia realizada \n";
	}
			
	else{
		
			cout<<"Transferencia não realizada \n";
	}
	
	
	return 0;
}