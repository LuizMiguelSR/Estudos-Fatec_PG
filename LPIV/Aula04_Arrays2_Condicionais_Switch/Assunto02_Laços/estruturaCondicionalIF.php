<?PHP

// Declara��es / Instru��es Condicionais
# S�o Instru��es de controle de fluxo do programa de acordo 
# com a condi��o l�gica.

# Esta condi��o l�gica � constru�da com operadores de compara��o associados
# com operadores l�gicos.

// Declara��o IF com operadores de compara��o
# Define um bloco do c�digo que s�o executados se a condi��o l�gica for verdadeira

# Exemplo 01 - Teste (SE/ENT�O) com vari�vel "String"
$nome = 'Jogo';
if ($nome = 'Jogo'){
	echo '# --- Exemplo 01 - Teste com vari�vel "String"';
	echo '<br>';
	echo 'Este teste ser� apresentado apenas se a ';
	echo '<br>';
	echo 'condi��o l�gica testada entre parenteses';
	echo '<br>';
	echo 'for verdadeira. Significa que este bloco de chaves';
	echo '<br>';
	echo 'sera executado';
};

# Exemplo 02 - Teste (SE/ENT�O...SEN�O) com vari�vel num�rica
# Neste exemplo conta com uma alternativa para ao caso da compara��o
# l�gica falhar.
$idade = 19;
if ($idade <= 18){
	echo '<br>';
	echo '#---- Exemplo 02 - Teste com vari�vel num�rica e bloco IF executado';
	echo '<br>';
	echo 'Considerando que idade � menor ou igual a 18';
	echo '<br>';
	echo 'para que este bloco seja executado';
} else {
	echo '<hr>';
	echo '#---- Exemplo 02 - Teste com vari�vel num�rica e bloco ELSE executado';
	echo '<br>';
	echo 'Esta parte do c�digo ser� executada caso';
	echo '<br>';
	echo 'a condi��o l�gica tenha sido falsa.';
	echo '<br>';
}

# Exemplo 03 - Teste com vari�vel num�rica
# SE...SEN�OSE...SEN�O...
# Esta constru��o permite a constru��o l�gica que realiza mais de uma verifica��o 
# de teste l�gico.
echo '<hr>';
$media = 8;
if ($media <= 3) {
	echo 'Sua m�dia � inferior ou igual a 3,0. <br>';
	echo 'REPROVADO';
	echo '<br>';
} else if ($media <= 6) {	
	echo 'Sua m�dia � inferior ou igual a 6,0 <br>';
	echo 'Requer a execu��o de "EXAME"';
	echo '<br>';
} else if ($media <= 7) {
	echo 'Sua nota � inferior ou igual a 7,0. <br>';
	echo 'Requer atividade de recupera��o';
	echo '<br>';
} else {
	echo 'Nota igual ou superior a 7,0. <br>';
	echo 'APROVADO';
	echo '<br>';
}

# Exemplo 04 - Teste de uma �nica instru��o sem chaves
# Podemos deixar de utilizar as "Chaves", apenas se existir uma �nica instru��o
# no bloco.
echo '<hr>';
$media = 2;
if ($media <= 3)
	echo 'Sua m�dia � inferior ou igual a 3,0. <br> REPROVADO <br>';
else if ($media <= 6) {	
	echo 'Sua m�dia � inferior ou igual a 6,0 <br>';
	echo 'Requer a execu��o de "EXAME"';
	echo '<br>';
} else if ($media <= 7) {
	echo 'Sua nota � inferior ou igual a 7,0. <br>';
	echo 'Requer atividade de recupera��o';
	echo '<br>';
} else {
	echo 'Nota igual ou superior a 7,0. <br>';
	echo 'APROVADO';
	echo '<br>';
}

?>