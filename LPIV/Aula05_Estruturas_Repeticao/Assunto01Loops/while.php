<?PHP

// Controle de fluxo utilizando 'La�os/Loops'
// La�o while
// Existem 4 la�os em php
// S�o utilizados para executar um codigo ou um bloco de codigo repetidas vezes

//WHILE

# Note que neste tipo de loop o c�digo interno pode nunca ser executado.
$x = 1;
while ($x < 10) {
	echo "Cilo while em execu��o " . $x;
	echo "<br>";
	$x++;
}

echo '<hr>';
$x = 1;
while ($x < 10) {
	echo 'Ciclo while em execu��o' . $x++ . '<br>';
}

echo '<hr>';
?>