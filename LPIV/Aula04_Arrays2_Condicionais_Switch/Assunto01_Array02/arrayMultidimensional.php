<?PHP 
/*Arrays Multidimencionais*/
//=====================
# S�o arrays num�ricos ou associativos, cujos valores s�o outros "arrays".
# � uma estrutura multidimensional, pois possui elementos de "array" dentro de um 
# array.

// Exemplo 01
// Array MULDIMENSIONAL NUM�RICO

$dados = [
	[10, 20, 30, 40],		# Elemento 1 de �ndice 0 � um array.
	[100, 200, 300, 400],	# Elemento 2 de �ndice 1 � um array.
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
	'Cliente' => ['Nome01', 'Endere�o01', 'Fone'],
	'Estados' => ['Paran�', 'Alagoas', 'DF-Brasil�a']
];

# Como acessar os elementos do array multidimensional associativo
echo $dados2['Cliente'][0];
echo '<br>';

?>