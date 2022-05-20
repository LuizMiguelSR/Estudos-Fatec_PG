<!DOCTYPE html>
    <html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>SUCESSO</title>
    </head>
    <body>

        <!-- BootStrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

        <!-- NavBar -->
        <div class="container">
            <div class="row">
                <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="#">Usuário Registrado</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavDropdown">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                            <a class="nav-link" href="about.php">Sobre</a>
                            </li>
                        </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <br>
        <?php
            # Primeiro testar se for realizado um POST indica que o botão de inclusão foi pressionado
            if ($_SERVER['REQUEST_METHOD'] != 'POST') {
                die('Acesso inválido');
            }
            
            $nome = $_POST['nome'];
            $email = $_POST['email'];
            $sneha = $_POST['senha'];

            # Adicionar a base de dados
            require_once 'config.php';
            $gestor = new PDO(
                "mysql:host=".MYSQL_HOST.";".
                "dbname=".MYSQL_DATABASE.";charset=utf8",
                MYSQL_USER,
                MYSQL_PASS
            );

            $sql = "INSERT INTO validar VALUES(:email, :senha, :nome)";
            $stmt = $gestor->prepare($sql);
            $stmt -> execute(['email'=>$email, 'senha'=>$senha, 'nome'=>$nome]);

            echo '<div class="container mt-5>"';
            echo '<div class="row">';
            echo '<div class="alert alert-primary d-flex align-items-center mt-5" role="alert">';
            echo '<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-exclamation-triangle-fill flex-shrink-0 me-2" viewBox="0 0 16 16" role="img" aria-label="Warning:">';
            echo '<path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>';
            echo '</svg>';
            echo '<div>';
            echo 'Inserção com sucesso<br>';
            echo "<a href='index.php'>Voltar</a>";
            echo '</div>';
            echo '</div>';
            echo '</div>';
            echo '</div>';

        ?>

    </body>
</html>