<?PHP 
/*Operadores*/
//=====================

/*O operador spaceship foi adicionado no php
e possui a seguinte operação:
compara o valor da esquerda com o valor da direita 
este operador retorna tres valores:*/

$x = 1 <=> 1; # Retorna 0 
# Equivale (1 = 1)
# O valor da esquerda é igual o da direita

$x = 3 <=> 2; # Retorna 1
# Equivale (3 > 2)
# O valor da esquerda é maior que o da direita

$x = 1 <=> 2; # Retorna -1
# Equivale a (1 < 2)
# O valor da esquerda é menor que o da direita
?>