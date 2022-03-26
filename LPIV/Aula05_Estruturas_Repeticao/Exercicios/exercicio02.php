<?PHP

echo "<h3><b>Escolha o tipo de combustivel</b></h3>";
echo "<b>A = Alcool, G = Gasolina, D= Diesel, GNV = GNV</b><br><br>";

$litro = 20;
$tipoCombustível = "G";

switch ($tipoCombustível) {
	case 'A':
	echo "<b>O tipo de combustivel foi:</b> Alcool <br>";
	echo "<b>A quantidade em litros foi:</b> $litro <br>";
	if ($litro <= 20){
		$subtotal = ($litro * 5.799) * 0.03;
		$total = ($litro * 5.799) - $subtotal;
		echo '<b>Valor total com desconto de 3%:</b> R$ '.$total;
	}else{
		$subtotal = ($litro * 5.799) * 0.05;
		$total = ($litro * 5.799) - $subtotal;
		echo '<b>Valor total com desconto de 5%:</b> R$ '.$total;
	}
	break;

	case 'G':
	echo "<b>O tipo de combustivel foi:</b> Gasolina<br>";
	echo "<b>A quantidade em litros foi:</b> $litro <br>";
	if($litro <= 20){
		$subtotal = ($litro * 7.699) * 0.04;
		$total = ($litro *7.699) - $subtotal;
		echo '<b>Valor total com desconto de 4%:</b> R$ '.$total;
	}else{
		$subtotal = ($litro * 7.699) * 0.06;
		$total = ($litro * 7.699) - $subtotal;
		echo '<b>Valor total com desconto de 6%:</b> R$ '.$total;
	}
	break;

	case 'D':
	echo "<b>O tipo de combustivel foi:</b> Diesel <br>";
	echo "<b>A quantidade em litros foi:</b> $litro <br>";
	echo '<b>Valor total:</b> R$ '.$litro * 3.699;
	break;

	case 'GNV':
	echo "<b>O tipo de combustivel foi:</b> GNV <br>";
	echo '<b>Valor total:</b> R$ '.$litro * 4.49;;
	break;

	default:
	echo '<b style="color:red">Erro ao ler o tipo de combustivel</b><br>';
	break;
}

?>