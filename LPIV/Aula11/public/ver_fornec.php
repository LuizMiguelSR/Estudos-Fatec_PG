<?php

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
    <h3>Quadro de fornecedores</h3>
    <hr/>
        <table border="1">
            <thead>
                <tr>
                    <h3>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Email</th>
                    </h3>
                </tr>
            </thead>
            <tbody>
                <?php foreach($fornecedores as $fornec):?>
                    <tr>
                        <td><?= $fornec["codigo"]?></td>
                        <td><?= $fornec["nome"]?></td>
                        <td><?= $fornec["email"]?></td>
                    </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
    <p>Total Fornecedores: <strong><?= count($fornecedores)?></p>
    <a href="index.php">Voltar</a>
</body>
</html>