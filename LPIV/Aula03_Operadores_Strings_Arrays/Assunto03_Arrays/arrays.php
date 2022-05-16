<?PHP 
/*Concatenção de Strings*/
//=====================

/* É um coleção de valores (em uma única dimensão) 
Funciona como uma variavel que contem muitos valores.
A localização é designada por um índice do "array" 

Exemplo Não tradicionais*/
$valores1 = array(1, 2, 3, 10, 20, 30);		# Array numérico
$nomes1 = array('Pedro', 'Paulo', 'Jose');	# Array texto

/* A partir do PHP 5.x passou-se a representar o array 
de forma mais simples.*/
$valores2 = [1, 2, 3, 10, 20, 30];		# Array numérico
$nomes2 = ['Pedro', 'Paulo', 'Jose'];	# Array texto

/* Os arrays possuem como índice base o valor zero (0)*/
echo $valores2[0];
echo "<br>";
echo $valores2[1];
echo "<br>"

/* Outra forma de atribuição é com a utilização de atribuidor => 

Exemplo*/
;$dados = [
            10 => 100,
            20 => 50,
            30 => 300
          ];
echo $dados[10];
echo "<br>";

?>