<?PHP
    // Classes - Construct
    # Nos exemplos anteriores tinhamos as propriedades já preenchidas, o que só faria sentido na presença de alguma propriedade padrão, com 
    # a posibilidade de alguma propriedade padrão, com a possitibilidade de alteração posterior.

    # Para tornar estas propriedades dinâmicas, devemos utilizar o construct

    // Exemplo

    class Humano2
    {
        private $nome;     
        private $codNome;  
        # Modificador de acesso private faz com que estas propriedades sejam visíveis apenas pelos métodos no interior da classe.
        # Os objetos não sabem, não conhecem estas propriedades. Apenas conhecem o método.

        # Esta função (construct) é executada automaticamente quando se instancia um objeto da classe
        function __construct($n, $c)
        {
            $this->nome = $n;
            # $this->nome recebe o valor de $n
            $this->codNome = $c;
            # $this->codNome recebe o valor de $c
        }

        public function funCodNome()
        {
            return $this->nome . ' ' . $this->codNome;
        }
    }

    $mulher = new Humano2('Carla','Professora');
    # Ao criar o bojeto "mulher" a função construct é chamada automaticamente  com a passagem dos argumentos
    echo $mulher->funCodNome();
    echo "<br>";

    $mulher1 = new Humano2('Caroline','Professora');
    echo $mulher1->funCodNome();
    echo "<br>";

?>