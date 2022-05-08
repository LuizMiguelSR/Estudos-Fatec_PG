<<<<<<< Updated upstream

<?php
    $email = $_POST["email"]; // Método POST
    $senha = $_POST["senha"]; 

    // Condicional para confirmar login e senha
    if($email == "teste@gmail.com" && $senha == 0000){
        include 'calculadora.php';
    } else {
        include 'erro.php';
    }
=======

<?php
    $email = $_POST["email"]; // Método POST para validar login e senha
    $senha = $_POST["senha"]; 

    // Condicional para confirmar login e senha
    if($email == "teste@gmail.com" && $senha === "0000"){
        include 'calculadora.php';
    } else {
        include 'erro.php';
    }
>>>>>>> Stashed changes
?>