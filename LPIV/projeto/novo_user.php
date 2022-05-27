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
                                <a class="nav-link" href="folha.php">Folha de pagamento</a>
                            </li>
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
            $cod = $_POST['cod'];
            $email = $_POST['email'];
            $senha = $_POST['senha'];
            $salBase = $_POST['salBase'];
            $dias = $_POST['dias'];
            $dep = $_POST['dep'];
            
            # Classe para calcular a folha de pagemnto:
            /*
                Nesta classe utiliza-se o construtor parametrizado, com valores públicos, de forma
                que temos as funções de calculo do vale transporte, de calculo do inss, e do imposto 
                de renda retido na fonte.
            */
            class calculadoraFolha
            {
                public $valor1;
                public $valor2;
                public $valor3;
                public $valor4;

                function __construct($vl1, $vl2, $vl3, $vl4)
                {
                    $this -> valor1 = $vl1;
                    $this -> valor2 = $vl2;
                    $this -> valor3 = $vl3;
                    $this -> valor4 = $vl4;
                }
                    
                public function valeTransporte()
                {
                    $vt = $this -> valor2 * 0.06;
                    if($vt > 220.00) {
                        return 220.00;
                    } else {
                        return $vt;
                    }
                }
                public function inss()
                {   
                    if($this -> valor2 > 6433.57){
                        return 900.70;
                    } else if ($this -> valor2 > 3305.23){
                        return $this -> valor2 * 0.14;
                    } else if ($this -> valor2 > 2203.49){
                        return $this -> valor2 * 0.12;
                    } else if ($this -> valor2  > 1100.01){
                        return $this -> valor2 * 0.09;
                    } else {
                        return $this -> valor2 * 0.075;
                    }
                }
                public function irrf()
                {   
                    // Base de calculo levando em conta o Salário base, deduzido do cálculo do inss e valor dos dependentes (cada dependentes equivale a R$ 69,00)
                    $baseCalc = $this -> valor2 - $this -> valor4 - ($this -> valor3 * 189.59);

                    // Valor de dedução levando em conta a tabela de dedução do imposto de renda retido na fonte
                    if ($baseCalc > 4664.68) {
                        return ($baseCalc * 0.275) - 869.36;
                    } else if ($baseCalc > 3751.06) {
                        return ($baseCalc * 0.225) - 636.13;
                    } else if ($baseCalc > 2826.66) {
                        return ($baseCalc * 0.15) - 354.08;
                    } else if ($baseCalc > 1903.98) {
                        return ($baseCalc * 0.075) - 142.08;
                    } else {
                        return 0.00;
                    }

                }

            }
            $vl1 = $dias;
            $vl2 = $salBase;
            $vl3 = $dep;
            $vl4 = 0;
            $calcular = new calculadoraFolha($vl1, $vl2, $vl3, $vl4);
            $vl4 = $calcular->inss();
            $calcular = new calculadoraFolha($vl1, $vl2, $vl3, $vl4);

            $valeTransp = $calcular->valeTransporte();            
            $inss = $calcular->inss();
            $irrf = $calcular->irrf();
            $salLiq = $salBase - $valeTransp - $inss - $irrf;

            # Adicionar a base de dados
            require_once 'config.php';
            $gestor = new PDO(
                "mysql:host=".MYSQL_HOST.";".
                "dbname=".MYSQL_DATABASE.";charset=utf8",
                MYSQL_USER,
                MYSQL_PASS
            );

            /*
                A seguir temos a inserção dos dados coletados, em uma variável, 
                de forma que mediante o comando execute inserimos no banco de dados
            */
            $sql = "INSERT INTO funcionarios VALUES(:codigo, :nome, :email, :senha, :salBase, :dias, :dep, :valeTransp, :irrf, :inss, :salLiq)";
            $stmt = $gestor->prepare($sql);
            $stmt -> execute(['codigo'=>$cod, 'nome'=>$nome, 'email'=>$email, 'senha'=>$senha, 'salBase'=>$salBase, 'dias'=>$dias, 'dep'=>$dep, 'valeTransp'=>$valeTransp, 'irrf'=>$irrf, 'inss'=>$inss, 'salLiq'=>$salLiq]);

            echo '<div class="container mt-5>"';
            echo '<div class="row">';
            echo '<div class="alert alert-primary d-flex align-items-center mt-5" role="alert">';
            echo '<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-exclamation-triangle-fill flex-shrink-0 me-2" viewBox="0 0 16 16" role="img" aria-label="Warning:">';
            echo '<path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>';
            echo '</svg>';
            echo '<div>';
            echo 'Cadastro realizado com sucesso<br>';
            echo "<a href='cadastroFunc.php'>Cadastrar novo funcionário</a><br>";
            echo "<a href='index.php'>Sair</a>";
            echo '</div>';
            echo '</div>';
            echo '</div>';
            echo '</div>';
        ?>
    </body>
</html>