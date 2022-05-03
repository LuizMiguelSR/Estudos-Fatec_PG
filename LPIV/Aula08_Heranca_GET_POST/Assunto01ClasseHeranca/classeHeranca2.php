<?php 
    // Herança 
    // Uso de "extends"

    # Exemplo de herança de classe
    
    # Classe base (Mãe)
    class baseMamifero
    {
        public $especie;
        public $peso;

        function grupoEspec()
        {
            return "Este animal é do grupo {$this->especie}";
        }
    }

    # Exemplo extends

    # Classe derivada
    class Euterios extends baseMamifero 
    {
        // Não é necessário definir novamente as mesmas propriedades, pois este já existem na classe base.
        // Porém, podemos acrescentar outras propriedades métodos.
        public $qtdPernas;
        public $pelosSimOuNao;

        function qtdPernasTem()
        {
            return "O animal possui {$this->qtdPernas} patas";
        }
    }

    $animal = new Euterios();
    // Método da classe derivada
    $animal->qtdPernas = 4;
    echo "Metódo da classe derivada";
    echo "<br>";
    echo $animal->qtdPernasTem();
    echo "<br>";

    // Método da classe base
    $animal->especie = 'Euterio';
    echo "<br>";
    echo "Método de classe base";
    echo "<br>";
    echo $animal->grupoEspec();
?>