<?PHP

// Controle de fluxo utilizando 'Laços/Loops'
// Laço while
// Existem 4 laços em php
// São utilizados para executar um codigo ou um bloco de codigo repetidas vezes

//WHILE

# Note que neste tipo de loop o código interno pode nunca ser executado.
$x = 1;
while ($x < 10) {
	echo "Cilo while em execução " . $x;
	echo "<br>";
	$x++;
}

echo '<hr>';
$x = 1;
while ($x < 10) {
	echo 'Ciclo while em execução' . $x++ . '<br>';
}

echo '<hr>';
?>