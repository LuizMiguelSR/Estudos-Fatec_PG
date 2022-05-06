#include <iostream>
using namespace std;
class  alunos{
    public:

    string matricula, nome;

    void setmatricula (string matricula){
        this->matricula=matricula;
    }
    string getmatricula (){
        return matricula;
    }
    void setnome(string nome){
        this->nome=nome;
    }
    string getnome(){
        return nome;
    }
};
int main(int argc, char** argv) {
    alunos obj;
    obj.matricula="GR";
    obj.nome="Fabio";
    cout<<obj.getnome()<<"\n";
    cout<<obj.getmatricula()<<"\n";
}