<?php
    // Sessões
    // Para fazer o logout da sessão criada no php utilizamos funções com esta
    // finalidade

    session_start();
    session_unset();
    session_destroy();
    // Neste ponto o "logout" está completo

    echo "<p> Logout </p>";
?>