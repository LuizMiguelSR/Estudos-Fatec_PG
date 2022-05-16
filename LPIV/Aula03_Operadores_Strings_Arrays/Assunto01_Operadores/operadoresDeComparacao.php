<?PHP 
/*Operadores*/
//=====================

/*Operador de atribuição que permittem executar operações matemáticas 
ou operações lógica ou comparativas

Operador de comparação
Permite a comparacao entre valores
Verifica igualdade, diferença, maior, menor ou de mesmo tipo
O resultado da comparação é sempre um "Boleano" False ou True 

Observe a diferença entre o operador de:
"atribuição" e de "comparação"*/ 

echo "Exemplo 01 --> ";
$a = (2 == 3); #False
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

echo "Exemplo 02  --> ";
$a = (100 == 100); #True
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

echo "Exemplo 03 --> ";
$a = (50 == '50'); #True
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

#Neste exemplo ocorre uma comparação entre valores 
#Sem a verificação do tipo dos valores envolvidos na comparacao

echo "Exemplo 04 --> ";
$a = (50 === '50'); #False
if($a){
	echo "True";
} else {
	echo "False";
}
echo "<br>";

#Já neste exemplo ocorre uma comparação entre valores 
#com a verificação do tipo dos valores envolvidos na comparacao

// Atenção
#Não conseguimos visualizar o resultado da (False ou true) da comparação. Mas podemos verificar a sua existencia.

echo "Teste --> ";
$a = (2 == 3); #False
echo $a;

#Então temos que expressar a sua existencia.
if($a){
	echo "True";
} else {
	echo "False";
}

?>