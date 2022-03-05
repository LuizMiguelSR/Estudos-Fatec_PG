#include <iostream>

using namespace std;

// classe No
class ListaEncadeada
{
    private:
        int v;
        ListaEncadeada* prox;
    public:
        ListaEncadeada(int v) // construtor
        {
            this->v = v;
            this->prox = NULL;
        }

        int obterValor() // obt�m o valor
        {
            return v;
        }

        ListaEncadeada* obterProx() // obt�m o pr�ximo No
        {
            return prox;
        }

        void setProx(ListaEncadeada* p) // seta o pr�ximo No
        {
            prox = p;
        }
};

// classe Lista
class Lista
{
    private:
        ListaEncadeada* cabeca; // primeiro elemento
        ListaEncadeada* cauda; // �ltimo elemento

    public:
        Lista()
        {
            // se n�o passar elemento, ent�o cabeca e cauda s�o NULL
            cabeca = NULL;
            cauda = NULL;
        }

        Lista(int v)
        {
            // se passar elemento, ent�o cria novo No
            cabeca = new ListaEncadeada(v);
            cauda = cabeca;
        }

        virtual ~Lista() // destrutor
        {
            delete cabeca;
        }

        void mostrar() // mostra todos os elementos da lista
        {
            cout << "\nImprimindo todos os elementos...\n";
            ListaEncadeada* c = cabeca;

            if(vazia())
                cout << "A lista NAO possui elementos!!\n";
            else
            {
                while(c) // percorre a lista
                {
                    cout << c->obterValor() << endl;
                    c = c->obterProx();
                }
                cout << endl;
            }
        }

        bool vazia() // verifica se a lista est� vazia
        {
            return (cabeca == NULL);
        }

        // insere no in�cio (semelhante a push_front da list)
        void inserir_inicio(int v)
        {
            ListaEncadeada* novo_ListaEncadeada = new ListaEncadeada(v);

            if(vazia())
            {
                cabeca = novo_ListaEncadeada;
                cauda = novo_ListaEncadeada;
            }
            else
            {
                novo_ListaEncadeada->setProx(cabeca);
                cabeca = novo_ListaEncadeada;
            }
        }

        // insere no final (semelhante a push_back da list)
        void inserir_final(int v)
        {
            ListaEncadeada* novo_ListaEncadeada = new ListaEncadeada(v);

            if(vazia())
            {
                cabeca = novo_ListaEncadeada;
                cauda = novo_ListaEncadeada;
            }
            else
            {
                cauda->setProx(novo_ListaEncadeada);
                cauda = novo_ListaEncadeada;
            }
        }

        // retorna o tamanho da lista
        int tamanho()
        {
            if(vazia()) // se for vazia, ent� retorna 0
                return 0;

            ListaEncadeada* c = cabeca;
            int tam = 0;
            
            // percorre a lista
            do
            {
                c = c->obterProx();
                tam++;
            }
            while(c);
            
            return tam;
        }

        // verifica se um elemento existe na lista
        bool existe(int v)
        {
            ListaEncadeada* c = cabeca;
            
            while(c)
            {
                if(c->obterValor() == v)
                    return true;
                c = c->obterProx();
            }
            return false;
        }

        // remove da lista, remo��o do final (semelhante a pop_back da list)
        void remover()
        {
            if(!vazia())
            {
                // se houver s� 1 elemento
                if(cabeca->obterProx() == NULL)
                    cabeca = NULL;
                else if(cabeca->obterProx()->obterProx() == NULL) // 2 elementos
                    cabeca->setProx(NULL);
                else // > 2 elementos
                {
                    ListaEncadeada* ant_ant = cabeca;
                    ListaEncadeada* ant = cabeca->obterProx();
                    ListaEncadeada* corrente = cabeca->obterProx()->obterProx();

                    while(corrente)
                    {
                        ListaEncadeada* aux = ant;
                        ant = corrente;
                        ant_ant = aux;
                        corrente = corrente->obterProx();
                    }
                    delete ant_ant->obterProx(); // libera mem�ria
                    ant_ant->setProx(NULL); // seta o prox como NULL
                    cauda = ant_ant; // atualiza a cauda
                }
            }
        }
};

int main(int argc, char *argv[])
{
	Lista l;
	
	if(l.vazia())
		cout << "Lista vazia!!\n";
	else
		cout << "Lista NAO vazia!!\n";
	
	l.mostrar();
	
	if(l.existe(10))
		cout << "\nO elemento 10 existe na lista!!\n";
	else
		cout << "\nO elemento 10 NAO existe na lista!!\n";
	
	l.inserir_final(10);
	l.inserir_final(20);
	l.inserir_final(30);
	l.inserir_final(40);
	l.inserir_inicio(50);
	
	l.mostrar();
	
	if(l.vazia())
		cout << "Lista vazia!!\n";
	else
		cout << "Lista NAO vazia!!\n";
	
	if(l.existe(10))
		cout << "\nO elemento 10 existe na lista!!\n";
	else
		cout << "\nO elemento 10 NAO existe na lista!!\n";
	
	l.remover();
	
	l.mostrar();
	
	cout << "Tamanho da lista: " << l.tamanho() << endl;
	
	return 0;
}