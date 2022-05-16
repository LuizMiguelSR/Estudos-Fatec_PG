<?PHP
    // Classes
    # Introdução a Programação Orientada a Objetos

    # Uma classe é definida pela declaração "class" seguido do nome da classe. Também, possui chaves de limitação de construção de código.

    # Por convenção do PSR-1 o nome de uma classe deve ser sempre atribuído de forma:
    # StudyCaps, PascalCase, MixedCase
    # Link: https://www.php-fig.org/psr/psr-1/

    # Exemplo de definição de classe
    class AnimaisMamiferos # Primeira letra capital
    {
        // Inserimo as propriedades e funções
    }

    class FigurasGeometrica
    {
        // Definição das propriedades
        public $largura, $altura;
        public $x;
        public $y;
        
        // Definição de um método (função)
        function metCalcArea($a, $b)
        {
            return $a * $b;
        }
    }
?>