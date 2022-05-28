<?php
    /*
        Página destinada a consulta da folha de pagamento de funcionários, apenas pela sessão do administrador
        , de forma que é feita uma consulta a tabela funcionários no banco de dados 
    */
    session_start();
    if($_SESSION['nome'] != 'Administrador') {
        include 'sair.php';
    } else {

        // Presença de concatenação de strings
        require_once 'config.php';
        $gestor = new PDO(
            "mysql:host=".MYSQL_HOST.";".
            "dbname=".MYSQL_DATABASE.";charset=utf8",
            MYSQL_USER,
            MYSQL_PASS
        );
        
        $dados = $gestor->query("Select * FROM funcionarios");
        $funcionarios = $dados->fetchAll(PDO::FETCH_ASSOC);
        
        // Formatação de números double para moeda corrente.
        $formatter = new NumberFormatter('pt_BR',  NumberFormatter::CURRENCY);
?>
    <!DOCTYPE html>
    <html lang="pt-br">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
            <title>Folha de Pagamento</title>
        </head>
        <body>
            <!-- NavBar utilizando o BootStrap -->
            <div class="container">
                <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                    <div class="container-fluid">                
                        <a class="navbar-brand" href="#">Folha de Pagamento</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavDropdown">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link">Usuário: <?php echo "{$_SESSION['nome']}"; ?> </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="cadastroFunc.php">Cadastrar Funcionário</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="sair.php">Sair</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>    
            </div>
            
            <!-- Título -->
            <div class="container mt-5">
                <div class="row">
                    <h3 class="mt-5 text-center">FOLHA DE PAGAMENTO</h3>
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
                            <th scope="col">Deletar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- 
                            Consulta dos valores no banco de dados 
                            A seguir temos o uso da estrutura de controle foreach, para mostrar
                            todos os registros do banco de dados compondo assim a folha de 
                            pagamento.
                        -->
                        <?php foreach($funcionarios as $func):?>
                                <tr>
                                    <td><?= $func["codigo"]?></td>
                                    <td><?= $func["nome"]?></td>
                                    <td><?= $formatter->formatCurrency($func["salBase"], 'BRL')?></td>
                                    <td><?= $formatter->formatCurrency($func["valeTransp"], 'BRL')?></td>
                                    <td><?= $formatter->formatCurrency($func["irrf"], 'BRL')?></td>
                                    <td><?= $formatter->formatCurrency($func["inss"], 'BRL')?></td>
                                    <td><?= $formatter->formatCurrency($func["salLiq"], 'BRL')?></td>
                                    <td><input class="btn btn-light" type="submit" name="<?= $func["nome"]?>" value="Deletar"></td>
                                </tr>                            
                        <?php endforeach; ?>
                    </tbody>
                </table>
            </div>
        </body>
    </html>
<?php } ?>