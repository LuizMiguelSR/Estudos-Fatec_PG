
<?php

    require_once 'config.php';
    $gestor = new PDO(
        "mysql:host=".MYSQL_HOST.";".
        "dbname=".MYSQL_DATABASE.";charset=utf8",
        MYSQL_USER,
        MYSQL_PASS
    );
    $dado = $gestor->query("Select * FROM funcionarios");
    $valida = $dado->fetchAll(PDO::FETCH_ASSOC);

    $email = $_POST["email"]; // Método POST para validar login e senha
    $senha = $_POST["senha"]; 

    $c=0;
    // Condicional para confirmar login e senha
    if ($email == 'admin@email.com' && $senha === '1234'){
        include 'cadastroFunc.php';
        $c++;
    } else {
        foreach($valida as $val) {
            if($email == $val["email"] && $senha === $val["senha"]){
                include 'consultaHol.php';
                $c++;
            } 
        }
    }

    if($c == 0){
        include 'erro.php';
        $c=0;
    }
    
?>