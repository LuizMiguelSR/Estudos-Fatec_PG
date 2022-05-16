<?PHP 
/*Arrays Associativo*/
//=====================

# Ao contrario dos arrays de indice numerico (posicionais).
# As chaves de acesso no arrays associativos (nomeado) são do tipo "string".

// Exemplo

$valores1 = [
	'A' => 20,
	'B' => 30,
	'C' => 40
];

echo $valores1['A'];
echo '<br>';

$valores2 = [
	'nome' => 'Julio',
	'email' => 'julio@gmail.com',
	'nacionalidade' => 'brasileira',
	'idade' => '43'
];

echo $valores2['nome'];
echo '<br>';

?>