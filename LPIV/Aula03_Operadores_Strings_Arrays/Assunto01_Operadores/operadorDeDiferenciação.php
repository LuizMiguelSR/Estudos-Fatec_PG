<?PHP 
/*Operadores*/
//=====================

/*Operador de atribuição que permittem executar operações matemáticas 
ou operações lógica ou comparativas

Operador de Diferença
Símbolos != ou <>*/

echo "Exemplo 01 --> ";
$a = (2 != 3); #True
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

echo "Exemplo 02  --> ";
$a = (100 <> 100); #False
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

echo "Exemplo 03 --> ";
$a = (50 != '50'); #False
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";
#Neste exemplo ocorre uma comparação entre valores 
#Sem a verificação do tipo dos valores envolvidos na comparacao

echo "Exemplo 04 --> ";
$a = (500 !== '50'); #True
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";
#Já neste exemplo ocorre uma comparação entre valores 
#com a verificação do tipo dos valores envolvidos na comparacao

// Então
# Os operadores com três símbolos comparam
# valor e o tipo dos atributos testados.

?>