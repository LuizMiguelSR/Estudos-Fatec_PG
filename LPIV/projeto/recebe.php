
<?php

    $gestor = new PDO("mysql:host=localhost;dbname=bancoprojeto;charset=utf8","root","");
    $dado = $gestor->query("Select * FROM validar");
    $valida = $dado->fetchAll(PDO::FETCH_ASSOC);

    $email = $_POST["email"]; // Método POST para validar login e senha
    $senha = $_POST["senha"]; 

    $c=0;
    // Condicional para confirmar login e senha
    foreach($valida as $val) {
        if($email == $val["email"] && $senha === $val["senha"]){
            include 'calculadora.php';
            $c=1;
        } 
    }
    if($c == 0){
        include 'erro.php';
    }
    
?>