<?php
									  // Variaveis //
// ---------------------------------------------------------------------------------------------------//
# Utilizadas para armazenar dados: numeros, textos, valores logicos etc
# Podemos apresentar � modificar os valores contidos em seu interios ao longo do codigo (programa).

# S�o definidas com o simbolo dolar $ � o nome da variavel como identificador
# Exemplo: 
$Variavel01;
# No exemplo, foi criado um espa�o de memoria sem conteudo (Variavel n�o inicializada).

# Exemplo de variavel inicializada:
$Variavel02 = 100;
# Foi criado um espa�o de memoria nomeado com uma inicializa��o n�merica.

$Variavel02 = "Texto";
# O conteudo da variavel foi alterado com outro tipo de dado.
# Observamos que a variavel n�o � tipificada.

# Apresentando o conteudo da variavel.
echo $Variavel02;
echo "<br>";

# As variaveis s�o "Case Sensitive".
$Variavel03 = 150;
$variavel03 = -150;
# Neste caso s�o duas variaveis diferentes.

# Formas inadequadas de inicializar uma variavel
/*
$1var = 0;
$!var = 0;
$var(1) = 0;
$var um = 0;
$var-um = 0;
*/

# Formas adequadas de inicializar uma variavel
/*
$var1 = 0;
$var_um = 0;
$varUm = 0;
$_1 = 0;
*/

# N�o h� uma defini��o da forma mais correta de nomear uma variavel. Por�m, � recomendado um mesmo padr�o. Ou, verificar se o cliente tem ou deseja seguir algum padr�o.

# Camel Case - � um padr�o muito utilizado.
# Exemplo de Camel Case:
$umaVariavel;

# Snake Case
#Exemplo de Snake Case:
$uma_variavel;

?>