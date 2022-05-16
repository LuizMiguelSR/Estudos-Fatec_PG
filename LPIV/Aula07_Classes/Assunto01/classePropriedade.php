<?PHP
    // Classes
    # Apenas com propriedades ou apenas com métodos

    # Exemplo 01

    class Pessoa1 
    {
        # Classe apenas com propriedades 
        public $nome;
        public $codNome;
    }

    class Pessoa2
    {
        # Classe apenas com método
        private function msg()
        {
            // Método acessível fora da classe
            return $this -> nome . ' ' . $this -> codNome;

        }

        public function movimento()
        {
            $this->msg();
        }
    }
    // A classe Pessoa1 está permitindo o acesso de duas propriedades
    $humano1 = new Pessoa1();
    $humano1-> nome = 'João';
    $humano1-> codNome = 'Assessor';

    $humano2 = new Pessoa2();
    echo $humano2-> movimento();

?>