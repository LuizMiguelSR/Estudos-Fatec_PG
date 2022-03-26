<?PHP
    // Funções - Com Parâmetros
    # Parâmetros são variáveis ou valores inseridos dentro dos parênteses das funções.

    # Exemplo
    function adicao($a, $b){
        // Código da função
        # As variáveis $a e $b dentro dos parênteses da função, são chamados de argumentos da função.
        echo 'Variável recebida na função a = '.$a.'<br>';
        echo 'Variável recebida na função b = '.$b.'<br>';
    }
    
    # Exemplo de chamada com Parâmetros
    $x = 10;
    adicao($x, 20);

    // Exemplo com "Array"
    echo "<hr>";
    $nomes = ['Maria', 'Agda', 'Dalena'];
    foreach ($nomes as $nome){
        saudacao($nome);
    }

    function saudacao($varNome){
        echo "Boa tarde $varNome <br>";
    }

?>