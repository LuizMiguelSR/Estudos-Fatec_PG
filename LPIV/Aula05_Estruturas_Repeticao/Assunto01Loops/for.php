<?PHP

// La�o For
// Permite executar um bloco de c�digo em um determinado numero de vezes.

// O la�o for se constitui de tr�s par�metros
// 1. Valor inicial n�merico (contador) - Utilizado para constrolar o n�mero de vezes do loop (de repeti��o).
// 2. Condi��o - Utilizado para avaliar o contador e o encerramento do loop.
// 3. Incremento ou decremento - Altera o valor do contador.

// Note que a vari�vel � criada e inicializada dentro do la�o FOR.
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