<?php
    // Sessões
    // Utilizamos as variáveis globais de sessão

    session_start();

    // Para apresentar um outro texto de concatenação é necessáiro utilizar as chaves


    echo "Nome: {$_SESSION['nome']}";
?>