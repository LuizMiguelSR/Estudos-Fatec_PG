<?PHP
    // Funções com parâmetros opcionais
    # Podemos criar funções que tenham parâmetros com uma quantidade pré definida. Porém,
    # a chamada da função não se obriga a passar todos os parâmetros.

    # Exemplo
    function dividir($a, $b=2) {
        # Parâmetro $a
        #   Obrigatório
        #   Valor passado com argumento na chamada
        # Parâmetro $b
        #   Opcional
        #   a) Valor também passado na chamada da função.
        #   b) Ou, caso não seja passado ele assume um valor especifico.
        echo "Valor de a = ".$a."<br>";
        echo "Valor de b = ".$b."<br>";
        echo "Resultado da divisão = ".$a / $b."<br>";
    }
    // Exemplo de chamada com 1 parâmetro
    echo "Chamada da função com apenas 1 parâmetro <br>";
    dividir(10);
    echo "<br>";
    // Exemplo de chamada com 2 parâmetros
    echo "Chamada da função com 2 parâmetros <br>";
    dividir(20, 10);

    // Há uma observação importante
    # Os parâmetros opcionais devem ser definidos depois dos parâmetros obrigatórios.
?>