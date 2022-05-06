<?PHP

// Exercicio 01

// Faça um programa que imprima a tabuada do 0 ao 10
$i = 0;
while ($i <= 10){
	for($x = 1; $x <= 10; $x++){
		$z = $i * $x;
		echo "$i X $x = $z <br>";
	}
	echo "<hr>";
	$i++;
}

?>