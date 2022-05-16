<?PHP 
/*Arrays Mistos*/
//=====================
# Array misto é a combiação de array numérico e associativo,
# não são utilizados com frequência, pois é mais difícil de 
# gerenciar o código de manipulção dos valores do array.

// Exemplo

$valores1 = [
	0 => 10,
	'nome' => 'Luiz Miguel',
	'sobrenome' => 'Santos',
	10 => 100.00,
	11 => 'Endereço'
];

# Para apresentar os dados
echo $valores1['nome'];
echo '<br>';
echo $valores1[10];
echo '<br>';

?>