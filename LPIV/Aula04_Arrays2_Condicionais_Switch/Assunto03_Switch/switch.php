<?PHP

// Deckara��o e instru��es condicionais
# Switch - � uma alternativa de encadeamento de if...ElseIf:

$nome = 'Luiz Miguel';
# Neste caso temos a constru��o l�gica de uma condi��o l�gica,
# mas, podemos construir a condi��o l�gica e armazenar em uma vari�vel.

switch ($nome) {
	case 'Joao':
	// Executa este c�digo at� encontrar o declara��o: break
	echo 'Execu��o do c�digo Joao <br>';
	break;

	case 'Maria':
	// Executa este c�digo at� encontrar o declara��o: break
	echo 'Execu��o do c�digo Maria <br>';
	break;

	default:
	// Executa este c�digo at� encontrar o declara��o: break
	echo 'Execu��o do c�digo Default <br>';
	break;
}
# Exemplo 01
?>