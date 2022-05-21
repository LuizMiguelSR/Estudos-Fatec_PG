<?php

    require_once 'config.php';
    $gestor = new PDO(
        "mysql:host=".MYSQL_HOST.";".
        "dbname=".MYSQL_DATABASE.";charset=utf8",
        MYSQL_USER,
        MYSQL_PASS
    );
    
    $dados = $gestor->query("Select * FROM funcionarios");
    $funcionarios = $dados->fetchAll(PDO::FETCH_ASSOC);

?>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>Consulta Holerite</title>
    </head>
    <body>
        <!-- NavBar -->
        <div class="container">
            <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                <div class="container-fluid">                
                    <a class="navbar-brand" href="#">Consulta Holerite</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavDropdown">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="index.php">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about.php">Sobre</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>    
        </div>
        
        <!-- Título -->
        <div class="container mt-5">
            <div class="row">
                <h3 class="mt-5 text-center">CONSULTA DE HOLERITE</h3>
            </div>
        </div>
        <div class="container">
            <table class="table table-hover table-dark">
                <thead>
                    <tr>
                        <th scope="col">Cód</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Sál. Base</th>
                        <th scope="col">V.T</th>
                        <th scope="col">IRRF</th>
                        <th scope="col">INSS</th>
                        <th scope="col">Sál. Líquido</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach($funcionarios as $func):?>
                            <tr>
                                <td><?= $func["codigo"]?></td>
                                <td><?= $func["nome"]?></td>
                                <td><?= $func["salBase"]?></td>
                                <td><?= $func["valeTransp"]?></td>
                                <td><?= $func["irrf"]?></td>
                                <td><?= $func["inss"]?></td>
                                <td><?= $func["salLiq"]?></td>
                            </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
    </body>
</html>