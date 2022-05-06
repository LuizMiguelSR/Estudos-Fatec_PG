#include <cstdlib>
#include <iostream>

using namespace std;

class ListaDeArray
{
      private:
             int *VET;
             int ProximaPosicaoLivre;
      public:
             ListaDeArray(int qtde)
             {
                 VET = new int[qtde];
                 ProximaPosicaoLivre = 0;
             }
             void Insere(int n)
             {
                  int pos = ProximaPosicaoLivre - 1;
                  while((n < VET[pos]) && (pos > -1))
                  {
                          VET[pos+1] = VET[pos];
                          pos--;
                  }
                  VET[pos+1] = n;
                  ProximaPosicaoLivre++;
             }
             void Mostra()
             {
                  for(int i = 0; i<ProximaPosicaoLivre; i++)
                  {
                          cout <<VET[i] <<"\n";
                  }
             }
             int Busca(int n)
             {
                  for(int i = 0; i<ProximaPosicaoLivre; i++)
                  {
                          if(n == VET[i]) return i;
                  }
                  return -1;
             }
             void Remove(int n)
             {
                  int pos = Busca(n);
                  if(pos > -1)
                  {
                         for(int i = pos+1; i < ProximaPosicaoLivre; i++)
                         {
                                 VET[i-1] = VET[i];
                         }
                         ProximaPosicaoLivre--;
                  }
             }
};

int main(int argc, char *argv[])
{
    ListaDeArray lista(50);
    lista.Insere(1);
    lista.Insere(12);
    lista.Insere(3);
    lista.Insere(7);
    lista.Remove(200);
    lista.Remove(3);
    lista.Mostra();
    cout <<"\n\n\n";
    cout <<lista.Busca(5) <<"\n\n\n";
    system("PAUSE");
    return EXIT_SUCCESS;
}
