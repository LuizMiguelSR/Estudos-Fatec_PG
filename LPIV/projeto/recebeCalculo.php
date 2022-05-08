<?php
    $operador = $_POST["operador"]; // Método POST, com o valor do operador escolhido para redirecionar a página de calulo

    // Condicional para definar o operador
    switch ($operador) {
        case '+':
            include 'soma.php';
            break;
        case '-':
            include 'subtracao.php';
            break;
        case '*':
            include 'multiplicar.php';
            break;            
        case '/':
            include 'dividir.php';
            break;
        default:
            include 'calculadora.php';
            break;  
    }
?>