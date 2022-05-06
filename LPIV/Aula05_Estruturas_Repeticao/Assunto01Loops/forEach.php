<?PHP

// La�o For Each

// Permite executar um bloco de c�digo a partir de valores de um array

// Ao utilizar o foreach n�o h� a necessidade de uma vari�vel incremental (um contador). Pois o ciclo passa automaticamente, de forma sequencial em cada elemento do array.

// Cada elemento do array � carregado para a vari�vel ap�s a declara��o "as".

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