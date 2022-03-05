#include <cstdlib> 
#include <iostream> 
using namespace std; 
class PilhaDeArray 
{ 
    private: //argumentos privados
            int *VET; 
            int ProximaPosicaoLivre; 
            int MAX; 
    public: 
            PilhaDeArray(int qtde) //define o tamanho do vetor que empilha 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void Empilha(int n) //empilha os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n; 
            } 
            void Mostra() //mostra o dados empilhados
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<"\n"; 
                } 
            } 
            int Desempilha() //retira os valores da ultima posição
            { 
                if(ProximaPosicaoLivre > 0)  
			        return VET[--ProximaPosicaoLivre]; 
            } 
}; 
int main(int argc, char *argv[]) 
{ 
    PilhaDeArray pilha(50); 
    pilha.Empilha(3); 
    pilha.Empilha(5); 
    pilha.Empilha(7); 
    pilha.Empilha(1); 
    pilha.Mostra(); 
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n"; 
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n"; 
    pilha.Mostra();
    cout << "\n" ;
    system("PAUSE"); 
    return EXIT_SUCCESS; 
}