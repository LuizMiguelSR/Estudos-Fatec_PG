<?php
 
    function calculoComissao($comissao, $comissaoFuncionario){
        // criação do laço foreach para cada funcionário e valor da venda.
        foreach($comissaoFuncionario as $i => $vendas){
            switch ($comissao) {
                case 1:
                    echo "Funcionario ".$i." recebeu R$ ".$vendas * 0.05." de comissão<br>";
                    break;
                case 2:
                    echo "Funcionario ".$i." recebeu R$ ".$vendas * 0.10." de comissão<br>";
                    break;
                case 3:
                    echo "Funcionario ".$i." recebeu R$ ".$vendas * 0.15." de comissão<br>";
                    break;
                default:
                    echo "Valor incorreto.<br>";
                    break;
            }
        }
        echo "<hr>";
    }
    
    function calculoDepedentes($nomeFuncionario, $depedentes, $salario){
        // criação do laço foreach para calculo da renda por depedentes.
        
        foreach($nomeFuncionario as $j) {           
            if($depedentes >= 3 && $salario >= 1500){
                echo $j." recebeu bonus de R$ ".$salario * 0.05." <br>";
            }else if($depedentes = 2 && $salario >= 1000){
                echo $j." recebeu bonus de R$ ".$salario * 0.10." <br>";
            } else {
                echo $j." recebeu bonus de R$ ".$salario * 0.15." <br>";
            }
        }
        echo "<hr>";
    }

    echo "Digite a opção desejada: (1) Calculo comissão/ (2) Calculo depedentes: <br><br>";
    $opcao = 2;

    if ($opcao == 1){
        // entrada da porcentagem de comissão de cada funcionário.
        $comissao = 1;
        echo "-==CALCULO DE COMISSÃO==-<br>";
        echo "Escolha porcentagem comissão: (1) para 5%, (2) para 10% e (3) para 15%: <br><br>";        
        // criação do array com nomes de funcionário e quantidade vendida.
        $comissaoFuncionario = ['Maria' => 100.0, 'José' => 200.0, 'Antonio' => 300.0];
        // saída da função calculo da comissão.
        calculoComissao($comissao, $comissaoFuncionario);
    } else if ($opcao == 2){
        // quantidade de bonus recebida por cada funcionário de acordo com o quantidade depedentes
        $depedentes = 4;
        $salario = 1501.00;
        echo "-==CALCULO DE DEPEDENTES==-<br>";
        echo "Digite a quantidade de dependentes: ".$depedentes."<br>";       
        echo "Digite o salario: R$ ".$salario."<br><br>";
        $nomeFuncionario = ['Maria', 'José', 'Antonio'];
        // saída da função calculo da comissão.
        calculoDepedentes($nomeFuncionario, $depedentes, $salario);
    } else {
        echo "Opção inválida!";
    }
?>