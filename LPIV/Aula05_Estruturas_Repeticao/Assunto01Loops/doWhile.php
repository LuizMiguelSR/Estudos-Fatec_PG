<?PHP

// Laço Do while
// Diferente do loop while o codigo interno do laço  do while sempre será executado pelo menos uma vez.
$x = 1;
do {
	echo "Loop do while em execucao " . $x;
	echo "<br>";
	$x++;
}while($x < 10);

echo '<hr>';

$x = 1;
do echo "Loop do while em execucao de forma reduzida " . $x++. "<br>"; while($x < 10);

echo '<hr>';

?>