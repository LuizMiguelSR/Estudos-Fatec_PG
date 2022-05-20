<?php
    // A ideia é criar uma forma de conexão um pouco mais segura. Desta forma vamos criar uma pasta
    // "Public" dentro dela nosso código em PHP iniciando pelo index com inserção no Banco de Dados.
    
    # Chama o código de conexão com o banco de dados contido no código "config.php"

    require_once '../config.php';
    $gestor = new PDO(
        "mysql:host=".MYSQL_HOST.";".
        "dbname=".MYSQL_DATABASE.";charset=utf8",
        MYSQL_USER,
        MYSQL_PASS
    );
    
    $dados = $gestor->query("Select * FROM fornecedores");
    $fornecedores = $dados->fetchAll(PDO::FETCH_ASSOC);

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Título Aqui</title>
</head>
<body>

    <h3>Fornecedores</h3>
    <hr>
    <a href="adic_fornec.php">Adicionar Fornecedores</a>
    <span> | </span>
    <a href="ver_fornec.php">Visualizar Fornecedores</a>
        
</body>
</html>