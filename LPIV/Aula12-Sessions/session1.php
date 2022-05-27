<?php
    // Sessões
    // Para utilizar sessões em php inicialmente usamos a função "start()"
    session_start();

    // Criamos as variáveis globais
    $_SESSION['nome'] = "Mari";
    $_SESSION['idade'] = 23;

    // As sessões são utéis para compartilhar um conteúdo (variávies de sessões) entre
    // páginas diferentes.

    // São variáveis do lado do servidor mantidas em um arquivo de controle do próprio servidor
    // na pasta tmp

    // echo $_SESSION['nome'];
?>