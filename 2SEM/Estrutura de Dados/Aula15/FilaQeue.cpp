#include <iostream>
#include <queue> //Fila - FIFO (First-in-First-out)

using namespace std;

int main(){

    queue<int>f1,f2;

    f2.push(10); //coloca o valor do elemento na pilha
    f2.push(20);
    f2.push(30);
    f2.push(40);
    f2.push(50);
    f2.emplace(60); //coloca o valor do elemento na pilha

    f2.swap(f1); //troca os elementos da pilha para outra

    cout << "Primeiro elemento da fila: " << f1.front() << endl; //mostra o primeiro elemento da fila
    cout << "Ultimo elemento da fila: " << f1.back() << endl; //mostra o ultimo elemento da fila
    cout << "Tamanho da fila: " << f1.size() << endl; //mostra o tamanho da fila

    while(!f1.empty()){
        cout << f1.front() << " - " << endl; //mostra o topo da pilha
        f1.pop(); //retira o elemento do topo da pilha
    }

    if(f1.empty()){
        cout << "Fila vazia" << endl;
    } else {
        cout << "Fila contem elementos" << endl;
    }

    cout << "Numero de elementos da Fila " << f1.size() << endl;

    return 0;
}