#include <iostream>
#include <stack> //PILHA - LIFO (Last-in-First-out)

using namespace std;

int main(){

    stack<int>p1,p2;

    p2.push(10); //coloca o valor do elemento na pilha
    p2.push(20);
    p2.push(30);
    p2.push(40);
    p2.push(50);
    p2.emplace(60); //coloca o valor do elemento na pilha

    p2.swap(p1); //troca os elementos da pilha para outra

    cout << "Numero de elementos da Pilha " << p1.size() << endl; //mostra a quantidade de elementos da pilha

    while(!p1.empty()){
        cout << p1.top() << endl; //mostra o topo da pilha
        p1.pop(); //retira o elemento do topo da pilha
    }

    if(p1.empty()){
        cout << "Pilha vazia" << endl;
    } else {
        cout << "Pilha contem elementos" << endl;
    }

    cout << "Numero de elementos da Pilha " << p1.size() << endl;

    return 0;
}