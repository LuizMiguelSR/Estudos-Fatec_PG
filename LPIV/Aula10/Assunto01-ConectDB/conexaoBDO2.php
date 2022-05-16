<?PHP
    $gestor = new PDO("mysql:host=localhost;dbname=bancoteste;charset=utf8","root","");
    $dado = $gestor->query("Select * FROM fornecedores");
    $fornecedores = $dado->fetchAll(PDO::FETCH_ASSOC);
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
    <hr>
        <table border="1">
            <thead>
                <tr>
                    <h3>
                        <th>Fornecedores</th>
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
</body>
</html>