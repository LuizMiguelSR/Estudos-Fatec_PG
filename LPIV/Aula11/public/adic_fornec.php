<?php

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar fornecedores</title>
</head>
<body>
    <h3>Adicionar Fornecedores</h3>    
    <hr/>
    <form action="adic_fornec_submit.php" method="post">
        <div>
            <label>Código:</label>
            <input type="number" name="codigo" maxlength="11">
        </div>
        <div>
            <label>Nome:</label>
            <input type="text" name="nome" maxlength="50">
        </div>
        <div>
            <label>Email:</label>
            <input type="email" name="email" maxlength="50">
        </div>
        <div>
            <input type="submit" value="Incluir">
        </div>
    </form>
    <hr/>
    <a href="index.php">Voltar</a>
</body>
</html>