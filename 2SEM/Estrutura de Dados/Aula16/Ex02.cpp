/*Faça um programa semelhante ao anterior, mas que armazene os números em 4 filas: A dos números divisíveis por 3, por 4, por 5 e dos números que não são divisíveis por nenhum deles.*/
#include <cstdlib> 
#include <iostream>
#include <locale.h> 
using namespace std; 
class Fila3
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            Fila3(int qtde) //define o tamanho do vetor que Entra 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void Entra(int n) //Entra os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n;
            } 
            void Mostra() //mostra o dados Entrados
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<" "; 
                } 
            } 
            int Sai() //retira os valores da ultima posiÃ§Ã£o
            { 
                if(ProximaPosicaoLivre > 0){
                    int ValorRet = VET[0]; 
                    for (int i = 1; i < ProximaPosicaoLivre; i++){
                        VET[i-1] = VET[i];
                    }
                    ProximaPosicaoLivre--; 
			        return ValorRet;
                } 
            } 
}; 
class Fila4
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            Fila4(int qtde) //define o tamanho do vetor que Entra 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void Entra(int n) //Entra os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n;
            } 
            void Mostra() //mostra o dados Entrados
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<" "; 
                } 
            } 
            int Sai() //retira os valores da ultima posiÃ§Ã£o
            { 
                if(ProximaPosicaoLivre > 0){
                    int ValorRet = VET[0]; 
                    for (int i = 1; i < ProximaPosicaoLivre; i++){
                        VET[i-1] = VET[i];
                    }
                    ProximaPosicaoLivre--; 
			        return ValorRet;
                } 
            } 
}; 
class Fila5
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            Fila5(int qtde) //define o tamanho do vetor que Entra 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void Entra(int n) //Entra os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n;
            } 
            void Mostra() //mostra o dados Entrados
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<" "; 
                } 
            } 
            int Sai() //retira os valores da ultima posiÃ§Ã£o
            { 
                if(ProximaPosicaoLivre > 0){
                    int ValorRet = VET[0]; 
                    for (int i = 1; i < ProximaPosicaoLivre; i++){
                        VET[i-1] = VET[i];
                    }
                    ProximaPosicaoLivre--; 
			        return ValorRet;
                } 
            } 
}; 
class Filan
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            Filan(int qtde) //define o tamanho do vetor que Entra 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void Entra(int n) //Entra os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n;
            } 
            void Mostra() //mostra o dados Entrados
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<" "; 
                } 
            } 
            int Sai() //retira os valores da ultima posiÃ§Ã£o
            { 
                if(ProximaPosicaoLivre > 0){
                    int ValorRet = VET[0]; 
                    for (int i = 1; i < ProximaPosicaoLivre; i++){
                        VET[i-1] = VET[i];
                    }
                    ProximaPosicaoLivre--; 
			        return ValorRet;
                } 
            } 
}; 
int main(int argc, char *argv[]) 
{
    setlocale(LC_ALL,""); 
    int num, i=1;
    Fila3 fila(20);
    Fila4 fila1(20); 
    Fila5 fila2(20); 
    Filan fila3(20); 
    for(int i = 0; i < 10; i++)
    {
        cout << "Digite um número: ";
        cin >> num;
            if(num%3==0)
            {               
                fila.Entra(num);
            }
            else if(num%4==0)
            {                
                fila1.Entra(num);
            }
            else if(num%5==0)
            {
                fila2.Entra(num);
            }
            else
            {
                fila3.Entra(num);
            }
    }

    cout << "\nFila de números divisivéis por 3: ";
    fila.Mostra();

    cout << "\nFila de números divisivéis por 3: ";
    fila1.Mostra();

    cout << "\nFila de números divisivéis por 5: ";
    fila2.Mostra(); 

    cout << "\nFila de números divisivéis por nenhum dos três: ";
    fila3.Mostra();      
    cout << "\n" ;
    
    system("PAUSE"); 
    return EXIT_SUCCESS; 
}