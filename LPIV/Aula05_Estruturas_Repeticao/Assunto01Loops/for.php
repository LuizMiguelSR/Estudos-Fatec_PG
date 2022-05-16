<?PHP

// Laço For
// Permite executar um bloco de código em um determinado numero de vezes.

// O laço for se constitui de três parâmetros
// 1. Valor inicial númerico (contador) - Utilizado para constrolar o número de vezes do loop (de repetição).
// 2. Condição - Utilizado para avaliar o contador e o encerramento do loop.
// 3. Incremento ou decremento - Altera o valor do contador.

// Note que a variável é criada e inicializada dentro do laço FOR.
for($x = 1; $x < 10; $x++){
	echo "Exemplo 01 - Laco FOR - Valor de x = " . $x . "<br>";
}

echo "<hr>";

for($x = 1; $x < 10; $x++)
	echo "Exemplo 02 - Laco FOR - Valor de x = " . $x . "<br>";

echo "<hr>";

$x = 1;
for(; $x < 10; $x++)
	echo "Exemplo 03 - Laco FOR - Valor de x = " . $x . "<br>";

echo "<hr>";

?>