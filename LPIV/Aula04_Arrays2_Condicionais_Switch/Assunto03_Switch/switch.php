<?PHP

// Deckaração e instruções condicionais
# Switch - É uma alternativa de encadeamento de if...ElseIf:

$nome = 'Luiz Miguel';
# Neste caso temos a construção lógica de uma condição lógica,
# mas, podemos construir a condição lógica e armazenar em uma variável.

switch ($nome) {
	case 'Joao':
	// Executa este código até encontrar o declaração: break
	echo 'Execução do código Joao <br>';
	break;

	case 'Maria':
	// Executa este código até encontrar o declaração: break
	echo 'Execução do código Maria <br>';
	break;

	default:
	// Executa este código até encontrar o declaração: break
	echo 'Execução do código Default <br>';
	break;
}
# Exemplo 01
?>