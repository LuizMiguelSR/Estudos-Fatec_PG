<?PHP
    // Funções com parâmetros Adicionais
    # Situação em que a função tem apenas um parâmetro. Porém, na chamada da função  são passados um número maior de argumentos.

    # Exemplo
    function divisor($a) {
        # Parâmetro #a - Obrigatório.
        # Porém, podem haver mais parâmetros.
        # Avalia quantos argumentos foram passados
        $qtArgum = func_num_args();

        // Tratamento de ações em função do número de argumentos recebidos
        switch ($qtArgum) {
            case 1:
                $x = func_get_arg(0);
                echo "<br>";
                echo "A função recebeu UM argumento <br>";
                echo "Resultado da divisão = ".$x / 2;
                echo "<br>";
            break;
            case 2:
                $x = func_get_arg(0);
                $y = func_get_arg(1); 
                echo "<br>";
                echo "A função recebeu DOIS argumentos <br>";
                echo "Resultado da divisão = ".$x / $y;
                echo "<br>";
            break;
            case 3:
                $x = func_get_arg(0);
                $y = func_get_arg(1); 
                $z = func_get_arg(2);
                echo "<br>";
                echo "A função recebeu TRÊS argumentos <br>";
                echo "Resultado da divisão = ".($x / $y)/$z;
                echo "<br>";
            break;
        }
        echo "A quantidade de argumentos = ".$qtArgum;
    }
    echo "<hr>";
    divisor(40);
    echo "<hr>";
    divisor(40, 20);
    echo "<hr>";
    divisor(40, 20, 2);
    echo "<br>";
    echo "<hr>";

    // Propondo um outra forma de tratamento com os argumentos recebidos
    function nova_funcao(...$argum){
        foreach($argum as $x){
            echo "$x <br>";
        }
    }

    nova_funcao(10, 20, 30, 40, 50);
?>