<?PHP

// Declara��es IF com proposi��es
# Utilizando:
# A) Operadores de compara��o 
# B) Operadores l�gicos

# Exemplo 01
$valor = 20;
if ($valor > 10 && $valor != 30){
	# code...
} else {
	# code...
}

# Exemplo 02
# IF aninhado
if ($valor >= 0) {
	if ($valor >= 100) {
		echo 'O n�mero � maior ou igual a 100 <br>';
	} else {
		echo 'O n�mero � positivo, por�m � menor do que 100';
	}
} else {
	echo 'O n�mero � negativo <br>';
}

?>