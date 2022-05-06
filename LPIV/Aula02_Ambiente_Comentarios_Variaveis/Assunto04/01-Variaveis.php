<?php
									  // Variaveis //
// ---------------------------------------------------------------------------------------------------//
# Utilizadas para armazenar dados: numeros, textos, valores logicos etc
# Podemos apresentar й modificar os valores contidos em seu interios ao longo do codigo (programa).

# Sгo definidas com o simbolo dolar $ й o nome da variavel como identificador
# Exemplo: 
$Variavel01;
# No exemplo, foi criado um espaзo de memoria sem conteudo (Variavel nгo inicializada).

# Exemplo de variavel inicializada:
$Variavel02 = 100;
# Foi criado um espaзo de memoria nomeado com uma inicializaзгo nъmerica.

$Variavel02 = "Texto";
# O conteudo da variavel foi alterado com outro tipo de dado.
# Observamos que a variavel nгo й tipificada.

# Apresentando o conteudo da variavel.
echo $Variavel02;
echo "<br>";

# As variaveis sгo "Case Sensitive".
$Variavel03 = 150;
$variavel03 = -150;
# Neste caso sгo duas variaveis diferentes.

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

# Nгo hб uma definiзгo da forma mais correta de nomear uma variavel. Porйm, й recomendado um mesmo padrгo. Ou, verificar se o cliente tem ou deseja seguir algum padrгo.

# Camel Case - Й um padrгo muito utilizado.
# Exemplo de Camel Case:
$umaVariavel;

# Snake Case
#Exemplo de Snake Case:
$uma_variavel;

?>