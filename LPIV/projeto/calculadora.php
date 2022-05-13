<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>Calculadora</title>
    </head>
    <body>
        <!-- NavBar -->
        <div class="container">
            <div class="row">
                <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="calculadora.php">Calculadora</a>
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
        <!-- Mensagem de escolha de cálculo -->
        <div class="container mt-5">
            <div class="row">
                <div class="alert alert-warning d-flex align-items-center mt-5" role="alert">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-exclamation-triangle-fill flex-shrink-0 me-2" viewBox="0 0 16 16" role="img" aria-label="Warning:">
                        <path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                    </svg>
                    <div>Digite os dois valores e escolha um dos cálculos no menu abaixo</div>
                </div>
            </div>
        </div>
        <!-- Título -->
        <div class="container">
            <div class="row">
                <h3 class="mt-2 text-center">CALCULADORA</h3>
            </div>
        </div>
        <!-- Formulário de entrada de valores -->
        <div class="container">
            <div class="row">
                <form action="recebeCalculo.php" method="post">
                    <div class="mb-3">
                        <label class="form-label">Valor 01</label>
                        <input name="valor1" type="text" class="form-control">
                    </div>
                    <select name="operador" class="form-select" aria-label="Default select example" style="margin-bottom: 10px">
                        <option selected>Escolha um operador na lista</option>
                        <option value="+">Soma</option>
                        <option value="-">Subtração</option>
                        <option value="*">Multiplicação</option>
                        <option value="/">Divisão</option>
                    </select>
                    <div class="mb-3">
                        <label class="form-label">Valor 02</label>
                        <input name="valor2" type="text" class="form-control">
                    </div>
                    <input style="margin-top: 0px;" class="btn btn-dark" type="submit" value="Calcular">
                </form>
            </div>
        </div>
    </body>
</html>