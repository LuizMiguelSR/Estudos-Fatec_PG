<?PHP
    // Funções - Retorno de valor pela função
    # RETURN
    #
    # Declaração RETURN provoca o fim da execução de código de uma função. Retornando o controle da execução para o código que chamou a função.

    # Exemplo 01
    function apresentar_texto() {
        echo "Este texto será apresentado";
        return;
        echo "Este texto não será apresentado";
    }
    apresentar_texto();

    # Exemplo 02
    function adicionar($a, $b){
        #Primeira forma
        $resultado = $a + $b;
        return $resultado;

        #Segunda forma
        return ($a + $b);
    }
    echo "<hr>";
    $x = 10;
    $y = 20;
    $soma = adicionar($x, $y);
    adicionar($x, $y);
    echo "Faz a operação de adição <br>";
    echo "$x + $y = ".$soma;
    echo "<br>";

    # Exemplo 03 - Retorno de um valor booleano
    echo "<hr>";
    $nome = "Agda";
    if(avalia_nome($nome)){
        echo "Nome do cliente correto";
        echo "<br";
    } else{
        echo "Nome do cliente Não está correto";
        echo "<br>";
    }
    echo "<hr>";

    function avalia_nome($n){
        if($n == "Maria"){
            return true;
        } else {
            return false;
        }
    }

    // Exemplo 04 - Retorno de um valor NULL
    $nome = "Agda";
    if(avalia() == null){
        echo "Função retornou Null";
        echo "<br";
    } else{
        echo "Função retornou valor não válido";
        echo "<br>";
    }
    echo "<hr>";

    function avalia(){
        // Código
        Return 10;
    }
?>