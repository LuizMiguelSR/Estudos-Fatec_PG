<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Soma</title>
</head>
<body>

	<!-- NavBar -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="calculadora.php">Soma</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                    <a class="nav-link" href="#">Soma</a>
                    </li>
                    <li class="nav-item">
                    <a class="nav-link" href="#">Subtração</a>
                    </li>
                    <li class="nav-item">
                    <a class="nav-link" href="#">Divisão</a>
                    </li>
                    <li class="nav-item">
                    <a class="nav-link" href="#">Multiplicação</a>
                    </li>
                </ul>
                </div>
            </div>
        </nav>
        <br>
        <br>
        <!-- Formulário de Soma -->
        <form style="margin: 65px;" method="post">
            <div class="mb-3">
                <label class="form-label">Valor 01</label>
                <input name="valor1" type="text" class="form-control">
            </div>
            <div class="mb-3">
                <label class="form-label">Valor 02</label>
                <input name="valor2" type="text" class="form-control">
            </div>
            <input type="submit" value="Calcular">
        </form>
        <!-- Resultado da Soma -->
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
                
                public function soma()
                {
                    return $this -> valor1 + $this -> valor2;
                }

            }
            $vl1 = $_POST["valor1"];
            $vl2 = $_POST["valor2"];
            $calcular = new calculadora($vl1, $vl2);
            echo $calcular->soma();
        ?>
</body>
</html>

