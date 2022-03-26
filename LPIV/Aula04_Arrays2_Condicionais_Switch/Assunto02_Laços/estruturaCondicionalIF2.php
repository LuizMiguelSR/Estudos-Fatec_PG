<?PHP

// Declarações IF com proposições
# Utilizando:
# A) Operadores de comparação 
# B) Operadores lógicos

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
		echo 'O número é maior ou igual a 100 <br>';
	} else {
		echo 'O número é positivo, porém é menor do que 100';
	}
} else {
	echo 'O número é negativo <br>';
}

?>