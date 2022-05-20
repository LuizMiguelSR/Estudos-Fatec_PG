<?php
    # Primeiro testar se for realizado um POST indica que o botão de inclusão foi pressionado
    if ($_SERVER['REQUEST_METHOD'] != 'POST') {
        die('Acesso inválido');
    }
    
    $codigo = $_POST['codigo'];
    $nome = $_POST['nome'];
    $email = $_POST['email'];

    # Adicionar a base de dados
    require_once '../config.php';
    $gestor = new PDO(
        "mysql:host=".MYSQL_HOST.";".
        "dbname=".MYSQL_DATABASE.";charset=utf8",
        MYSQL_USER,
        MYSQL_PASS
    );

    $sql = "INSERT INTO fornecedores VALUES(:codigo, :nome, :email)";
    $stmt = $gestor->prepare($sql);
    $stmt -> execute(['codigo'=>$codigo, 'nome'=>$nome, 'email'=>$email]);

    echo "Inserção com sucesso<br>";
    echo "<a href='index.php'>Voltar</a>"
?>