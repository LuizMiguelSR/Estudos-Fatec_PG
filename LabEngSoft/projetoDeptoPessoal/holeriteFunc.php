<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <title>Consulta ao Holerite</title>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

    <div class="container-fluid m-auto text-center">
        <div class="row">
            <nav class="navbar fixed-top navbar-expand-lg">
                <div class="container-fluid">
                    <img src="img/holerite.svg" alt="logo"class="logo2">
                    <p class="mt-2 titulo">Falida Ltda</p>
                    <a href="index.php"><img class="logout" src="img/logout.png" alt="logout"></a>
                </div>
            </nav>
        </div>
        <div class="row">
            <div class="person">
                <div class="container">
                    <div class="container-inner">
                        <img class="circle"/>
                        <img class="img img1" src="img/holerite.svg"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <h1 class="h3 mb-2 fw-normal">BEM VINDO, XXXX. ESTE É SEU HOLERITE</h1>
        </div>
        <div class="row mx-5 mt-5">
            <table class="table table-hover table-bordered border-primary">
                <thead>
                    <tr>
                        <th scope="col">Pagamentos</th>
                        <th scope="col">Descontos</th>
                        <th scope="col">Líquido</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>R$ 11.083,76</td>
                        <td>R$ 6.884,14</td>
                        <td>R$ 4.199,22</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="row mx-5 mt-2">
            <table class="table table-hover table-bordered border-primary">
                <thead>
                    <tr>
                        <th scope="col">Sal. Base</th>
                        <th scope="col">Sal. Contrib. INSS</th>
                        <th scope="col">Base FGTS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>R$ 3.781,00</td>
                        <td>R$ 5.564,60</td>
                        <td>R$ 11.083,76</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="row mx-5 mt-2">
            <table class="table table-hover table-bordered border-primary">
                <thead>
                    <tr>
                        <th scope="col">FGTS do mês</th>
                        <th scope="col">Base Cálculo IRPF</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>R$ 886,66</td>
                        <td>R$ 4.928,04</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="row">
            <a href="painelFunc.php"><img class="mt-3 voltar" src="img/voltar.png" alt="voltar"></a>
        </div>
        <div class="row">
            <p>VOLTAR</p>
        </div>
        <div class="row">
            <p class="mt-3 mb-3 text-muted">&copy; Falida 2022</p>
        </div>
    </div>      
</body>
</html>