<?PHP
    // Funções 
    # São blocos de código identificados por um nome
    # e assinatura. Permite a reutilização deste código.
    #
    # Estes blocos de código são executado apenas 
    # quando são chamados.
    #
    # Uma função é definida com o uso da palavra "function"
    # seguida do nome, um conjunto de parênteses e um bloco de código.
    #
    # Exemplo de criação de função
    # Por convenção o bloco de código inicia-se com as chaves em outra linha e não ao final dos parênteses: 

    function nomeDaFuncao(){
        // Código da função
        echo 'Código dentro da função';
        echo '<br>';
    }

    # A função pode ser construída antes ou depois do código principal

    # Exemplo de chamada da função.
    nomeDaFuncao();

    // Notar que os nome das funções são "Case insensitive".
    # Ou seja, nomeDaFuncao() é igual a nomeDaFUNCAO()

    nomeDaFUNCAO();

    // Não há um padrão de nomenclatura.
    # "Camel Case" ou "Snake Case"
    # Porém, há por definição que se utilize uma mesma nomenclatura em todo o projeto de código.
    #
    // Exmeplo - Camel Case
    function camelCase() {

    }

    // Exemplo - Snake Case
    function snake_case() {
        
    }
?>