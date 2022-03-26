<?PHP

// Declarações / Instruções Condicionais
# São Instruções de controle de fluxo do programa de acordo 
# com a condição lógica.

# Esta condição lógica é construída com operadores de comparação associados
# com operadores lógicos.

// Declaração IF com operadores de comparação
# Define um bloco do código que são executados se a condição lógica for verdadeira

# Exemplo 01 - Teste (SE/ENTÃO) com variável "String"
$nome = 'Jogo';
if ($nome = 'Jogo'){
	echo '# --- Exemplo 01 - Teste com variável "String"';
	echo '<br>';
	echo 'Este teste será apresentado apenas se a ';
	echo '<br>';
	echo 'condição lógica testada entre parenteses';
	echo '<br>';
	echo 'for verdadeira. Significa que este bloco de chaves';
	echo '<br>';
	echo 'sera executado';
};

# Exemplo 02 - Teste (SE/ENTÃO...SENÂO) com variável numérica
# Neste exemplo conta com uma alternativa para ao caso da comparação
# lógica falhar.
$idade = 19;
if ($idade <= 18){
	echo '<br>';
	echo '#---- Exemplo 02 - Teste com variável numérica e bloco IF executado';
	echo '<br>';
	echo 'Considerando que idade é menor ou igual a 18';
	echo '<br>';
	echo 'para que este bloco seja executado';
} else {
	echo '<hr>';
	echo '#---- Exemplo 02 - Teste com variável numérica e bloco ELSE executado';
	echo '<br>';
	echo 'Esta parte do código será executada caso';
	echo '<br>';
	echo 'a condição lógica tenha sido falsa.';
	echo '<br>';
}

# Exemplo 03 - Teste com variável numérica
# SE...SENÃOSE...SENÂO...
# Esta construção permite a construção lógica que realiza mais de uma verificação 
# de teste lógico.
echo '<hr>';
$media = 8;
if ($media <= 3) {
	echo 'Sua média é inferior ou igual a 3,0. <br>';
	echo 'REPROVADO';
	echo '<br>';
} else if ($media <= 6) {	
	echo 'Sua média é inferior ou igual a 6,0 <br>';
	echo 'Requer a execução de "EXAME"';
	echo '<br>';
} else if ($media <= 7) {
	echo 'Sua nota é inferior ou igual a 7,0. <br>';
	echo 'Requer atividade de recuperação';
	echo '<br>';
} else {
	echo 'Nota igual ou superior a 7,0. <br>';
	echo 'APROVADO';
	echo '<br>';
}

# Exemplo 04 - Teste de uma única instrução sem chaves
# Podemos deixar de utilizar as "Chaves", apenas se existir uma única instrução
# no bloco.
echo '<hr>';
$media = 2;
if ($media <= 3)
	echo 'Sua média é inferior ou igual a 3,0. <br> REPROVADO <br>';
else if ($media <= 6) {	
	echo 'Sua média é inferior ou igual a 6,0 <br>';
	echo 'Requer a execução de "EXAME"';
	echo '<br>';
} else if ($media <= 7) {
	echo 'Sua nota é inferior ou igual a 7,0. <br>';
	echo 'Requer atividade de recuperação';
	echo '<br>';
} else {
	echo 'Nota igual ou superior a 7,0. <br>';
	echo 'APROVADO';
	echo '<br>';
}

?>