<?PHP 
/*Arrays Multidimencionais*/
//=====================
# São arrays numéricos ou associativos, cujos valores são outros "arrays".
# É uma estrutura multidimensional, pois possui elementos de "array" dentro de um 
# array.

// Exemplo 01
// Array MULDIMENSIONAL NUMÉRICO

$dados = [
	[10, 20, 30, 40],		# Elemento 1 de índice 0 é um array.
	[100, 200, 300, 400],	# Elemento 2 de índice 1 é um array.
	[1000,
	2000,
	3000,
	4000
	]
];

# Como acessar os elementos do array multidimensional
echo $dados[1][1];
echo '<br>';

// Exemplo 02
// Array MULDIMENSIONAL ASSOCIATIVO

$dados2 = [
	'Cliente' => ['Nome01', 'Endereço01', 'Fone'],
	'Estados' => ['Paraná', 'Alagoas', 'DF-Brasilía']
];

# Como acessar os elementos do array multidimensional associativo
echo $dados2['Cliente'][0];
echo '<br>';

?>