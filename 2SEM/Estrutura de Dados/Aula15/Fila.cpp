#include <cstdlib> 
#include <iostream> 
using namespace std; 
class FilaDeArray 
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            FilaDeArray(int qtde) //define o tamanho do vetor que Entra 
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
                    cout <<VET[i] <<"\n"; 
                } 
            } 
            int Sai() //retira os valores da ultima posição
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
    FilaDeArray fila(50); 
    fila.Entra(3); 
    fila.Entra(5); 
    fila.Entra(7); 
    fila.Entra(1); 
    fila.Mostra(); 
    cout <<"\nSai " <<fila.Sai() <<".\n\n"; 
    cout <<"\nSai " <<fila.Sai() <<".\n\n"; 
    fila.Mostra();
    cout << "\n" ;
    system("PAUSE"); 
    return EXIT_SUCCESS; 
}