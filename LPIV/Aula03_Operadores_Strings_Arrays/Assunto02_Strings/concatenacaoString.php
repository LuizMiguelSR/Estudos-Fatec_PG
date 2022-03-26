<?PHP 
/*Concatenção de Strings*/
//=====================

/* É um processo de junção de "strings" por meio do código. Temos
dois operadores para realizar a Concatenção:

.	Concatenção de uma "string" entre vairáveis.
.=	Concatenção de uma "string" com outra já existente em uma variável.

Exemplo com "." */

$a = 'Luiz ' . 'Miguel ' . "Santos";
echo $a;
echo "<br> <br>";

$b = ' Rodrigues';
$x = $a .= $b;
echo $x;

?>