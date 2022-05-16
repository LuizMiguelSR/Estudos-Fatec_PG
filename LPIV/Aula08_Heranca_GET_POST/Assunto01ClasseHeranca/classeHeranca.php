<?php 
    // Herança - É uma classe base da qual a partir dela outras serão criadas por esta classe base.
    // 
    // Todas classes provenientes desta classe base são denominadas de classe derivada.

    /* 
    Mamíferos são classificados em três grupos:
        a) Monotrenados
        b) Masurpiais
        c) Eutérios
    */

    # Exemplo de uma classe base
    class baseMamifero
    {
        public $especie;
        public $peso;

        function grupoEspec()
        {
            return "Este animal é do grupo {$this->especie}";
            // As chaves {} são necessárias para fazer a concatenação de texto com a propriedade.
        }
    }
    # Uso de herança
    $grupoanimal = new baseMamifero();
    $grupoanimal->especie = "Monotremado";

    echo $grupoanimal->grupoEspec();
?>