/*Faça um programa que simule a entrada de 20 números inteiros aleatórios numa fila. Ao ler os números da fila, deve se criar duas filas: Uma para alocar os pares, outra para alocar os ímpares. Posteriormente, deve se mostrar na tela as duas filas resultantes.*/
#include <cstdlib> 
#include <iostream>
#include <locale.h> 
using namespace std; 
class FilaDePar
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            FilaDePar(int qtde) //define o tamanho do vetor que Entra 
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
class FilaDeImpar
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            FilaDeImpar(int qtde) //define o tamanho do vetor que Entra 
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
    FilaDePar fila(20);
    FilaDeImpar fila1(20); 
    for(int i = 0; i < 10; i++)
    {
        cout << "Digite um número: ";
        cin >> num;
            if(num%2==0)
            {               
                fila.Entra(num);
            }
            else 
            {                
                fila1.Entra(num);
            }
    }

    cout << "\nFila de números pares: ";
    fila.Mostra();

    cout << "\nFila de números Ímpares: ";
    fila1.Mostra();     
    cout << "\n" ;
    
    system("PAUSE"); 
    return EXIT_SUCCESS; 
}