<?PHP
    // Classes
    # Introdução a Programação Orientada a Objetos

    # Para trabalhar com classes precisamos instanciar a classe.

    # Para acessar as propriedades de uma classe precisamos dos métodos com a utilização da pseudo variável $this seguida do operador seta -> 

    # Exemplo 01 - Definição e detalhes
    # A construção da classe antes ou depois do código principal, não interfere na visibilidade ou na sintaxe.

    class Humano
    {
        # Propriedades - Neste caso já preenchidas
        public $nome = "Maria"; # public é um modificador de acesso
        public $codinome = "Professora";


        # Métodos
        public function nomeCompleto()
        {
            return $this -> codinome . ' ' . $this -> nome;
            # Atenção
            # Note que para acessar a propriedade nomeCompleto definida como public $nome foi necessário utilizar a pseudo variável $this seguida do operador seta -> .
            #
            # A variável "nome", definida abaixo do return, embora, tenha o mesmo nome, não é a propriedade definida como "public $nome". É apenas uma variável da função.
        }
    }

    # As classes se utilizam de "Acess Modifiers", que são: public e private, dos quais indicam os niveis de acesso (ou seja a abrangência da visibilidade destas propriedades e métodos).

    # Instancia de um objeto de classe
    # Um objeto - É uma variável criada a partir de uma classe. Instanciar um objeto é criar um objeto a partir de uma classe atribuindo a variável a expressão "new" e o nome da classe.

    $mulher = new Humano();
    # Criamos um objeto de nome homem a partir da classe Humano. Podemos então acessar as propriedades e métodos deste novo objeto.

    echo $mulher -> nomeCompleto();

?>