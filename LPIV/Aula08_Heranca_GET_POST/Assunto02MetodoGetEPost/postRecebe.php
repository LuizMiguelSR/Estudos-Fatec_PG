<?php
    $email = $_POST["email"]; // Método POST
    $senha = $_POST["senha"]; 

    // Apenas para gerir o código para visualizar as variáveis 
    echo "<br>";
    echo "Seu email é: $email <br>";
    echo "Sua senha é: $senha <br>";

    var_dump($_POST);
?>