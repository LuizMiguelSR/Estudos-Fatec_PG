package Aula13_TratamentoDeExcecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo04_MultiCatch {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://fatecpg.edu.br/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = reader.readLine();
			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
			Date date = format.parse(line);
		} catch (IOException | ParseException e) {
			System.out.println("Ocorreu um erro");
		}
	}
}
