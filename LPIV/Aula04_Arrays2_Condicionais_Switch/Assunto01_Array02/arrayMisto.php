<?PHP 
/*Arrays Mistos*/
//=====================
# Array misto � a combia��o de array num�rico e associativo,
# n�o s�o utilizados com frequ�ncia, pois � mais dif�cil de 
# gerenciar o c�digo de manipul��o dos valores do array.

// Exemplo

$valores1 = [
	0 => 10,
	'nome' => 'Luiz Miguel',
	'sobrenome' => 'Santos',
	10 => 100.00,
	11 => 'Endere�o'
];

# Para apresentar os dados
echo $valores1['nome'];
echo '<br>';
echo $valores1[10];
echo '<br>';

?>