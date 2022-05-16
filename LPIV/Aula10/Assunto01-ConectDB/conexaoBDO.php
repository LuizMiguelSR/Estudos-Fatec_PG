<?PHP
    // Para consultas pode se utilizar a documentação do PHP.NET
    // Com este site é possível consultar a documentação sobre conexões do PHP com DB

    // Objetivos
    // rapida conexão e leitura de dados de um BD
    // utilizando o "php_mysql"

    $gestor = new PDO("mysql:host=localhost;dbname=bancoteste;charset=utf8","root","");
    # $db = Data Source Name (Servidor MYSQL)
    # $password = null,
    # $options = null

    # Uma variável para conter os dados da tabela
    $dado = $gestor->query("Select * FROM fornecedores");

    // Um metodo FETCH de busca de todos os dados armazenados 
    // ASSOC é um formato de array associativo
    $fornecedores = $dado->fetchAll(PDO::FETCH_ASSOC);

    echo '<pre>';
    print_r($fornecedores);
?>