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
            FilaDeArray(int qtde) //define o tamanho do vetor que EntraFim 
            { 
                MAX = qtde; 
                VET = new int[MAX]; 
                ProximaPosicaoLivre = 0; 
            } 
            void EntraFim(int n) //Entra no fim os dados no vetor
            { 
                if(ProximaPosicaoLivre < MAX)  
			        VET[ProximaPosicaoLivre++] = n;
            }
            void EntraIni(int n) //Entra no �nicio os dados no vetor
            {            	
            	if(ProximaPosicaoLivre < MAX)
                {
             	 	for(int i=ProximaPosicaoLivre; i>=0; i--){            	 		
             	 		VET[i]=VET[i-1];             	 		
					}
					VET[0] = n;
					ProximaPosicaoLivre++;
				} 
            } 
            void Mostra() //mostra o dados EntraFimdos
            { 
                for(int i = 0; i<ProximaPosicaoLivre; i++) 
                { 
                    cout <<VET[i] <<"\n"; 
                } 
            }
            int SaiIni() //retira os valores da ultima posição
            { 
                if(ProximaPosicaoLivre > 0)  
			        return VET[--ProximaPosicaoLivre]; 
            }  
            int SaiFim() //retira os valores da ultima posição
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
    fila.EntraIni(1); 
    fila.EntraIni(2); 
    fila.EntraIni(3); 
    fila.EntraIni(4); 
    fila.Mostra(); 
    cout <<"\nSai " <<fila.SaiIni() <<".\n\n"; 
    cout <<"\nSai " <<fila.SaiFim() <<".\n\n";
    fila.EntraFim(4); 
    fila.Mostra();
    cout << "\n" ;
    system("PAUSE"); 
    return EXIT_SUCCESS; 
}