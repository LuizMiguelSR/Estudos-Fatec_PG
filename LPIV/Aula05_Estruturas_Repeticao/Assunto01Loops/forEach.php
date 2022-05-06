<?PHP

// Laço For Each

// Permite executar um bloco de código a partir de valores de um array

// Ao utilizar o foreach não há a necessidade de uma variável incremental (um contador). Pois o ciclo passa automaticamente, de forma sequencial em cada elemento do array.

// Cada elemento do array é carregado para a variável após a declaração "as".

//Exemplo 01
$vetor = ['Maria', 'Pedro', 'Jose'];
foreach($vetor as $variavel) {
	echo $variavel . "<br>";
}

echo "<hr>";

// Exemplo 02
$estadoCapital = [
	'Acre' => 'Rio Branco',
	'Amapa' => 'Macapa',
	'Alagoas' => 'Maceio',
	'Ceara' => 'Fortaleza'
];

foreach($estadoCapital as $chave => $value){
	echo "Para o estado $chave a capital e $value <br>";
};

?>