<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Multiplicação</title>
</head>
<body>

	<!-- NavBar -->
    <div class="conteiner">
        <div class="row">
            <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Multiplicação</a>
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
    </div>

    <!-- Título -->
    <div class="container mt-5">
        <div class="row">
            <h3 class="mt-5 text-center">MULTIPLICANDO NÚMEROS</h3>
        </div>
    </div>

    <!-- Resultado da Soma utilizando classe e construtor -->
    <?PHP 
        class calculadora
        {
            public $valor1;
            public $valor2;

            function __construct($vl1, $vl2)
            {
                $this -> valor1 = $vl1;
                $this -> valor2 = $vl2;
            }
                
            public function multiplica()
            {
                return $this -> valor1 * $this -> valor2;
            }

        }
        $vl1 = $_POST["valor1"];
        $vl2 = $_POST["valor2"];
        $calcular = new calculadora($vl1, $vl2);
        echo "<p style='margin-left: 65px; margin-right: 65px; margin-top: 35px; text-align: center;'>Resultado da multiplicação entre ".$vl1." e ".$vl2." é igual a ".$calcular->multiplica()."</p>";
    ?>

    <!-- Voltar -->
    <div class="conteirner">
        <div class="row">
            <p class="mt-3 text-center"><a href="calculadora.php">VOLTAR</a></p>
        </div>
    </div>
</body>
</html>