<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Método GET e POST</title>
</head>
<body>
    <h1>Método GET e POST</h1></hr>
    <h3>Login de usuário</h3>
    <form action="postRecebe.php" method="post">
        <label>
            Email: 
            <input type="e-mail" name="email"/>
        </label>
        <label>
            Senha: 
            <input type="password" name="senha"/>
            <input type="submit" value="Logar">
        </label>
    </form>

</body>
</html>