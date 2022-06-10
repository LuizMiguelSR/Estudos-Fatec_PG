<?php
    /*
        Página destinada para deletar um usuário cadastrado no banco de dados,
        mediante o recebimento dos parâmetros mediante o método post deletar
        com o código do funcionário.
    */
    require_once 'config.php';
    $gestor = new PDO(
        "mysql:host=".MYSQL_HOST.";".
        "dbname=".MYSQL_DATABASE.";charset=utf8",
        MYSQL_USER,
        MYSQL_PASS
    );
    $deleta = $_POST["deletar"];
    $sql = "DELETE FROM funcionarios WHERE codigo = $deleta";
    $gestor->query($sql);
    include 'folha.php';
?>