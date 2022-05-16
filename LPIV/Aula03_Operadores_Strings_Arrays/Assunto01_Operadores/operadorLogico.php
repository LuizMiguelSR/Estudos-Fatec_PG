<?PHP
 
/*Operadores*/
//=====================

/*O operadores Lógicos 
São frequentemente utilizados com os operadores de comparacao
Permitem fazer concatencações de comparações, 
gerando proposições

AND e OR
&&    ||*/

$a = 100;
$b = 200;

# Os valores armazenados em x são do tipo booleano
$x  = ($a < $b) && ($a < 1000); # AND -> e o resultado é True
$x  = ($a > $b) || ($a > 1000); # OR -> e o resultado é False

$x  = ($a < 150) && ($b > 300); # AND -> e o resultado é False
$x  = ($a == 10) || ($b > 500); # OR -> e o resultado é True

$x = ($a == 100) && ($b < $a); # AND -> e o resultado é False

$x = (True && True); # AND -> e o resultado é True
$x = (False || False); # AND -> e o resultado é False

?>