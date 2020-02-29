package pacote;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HeartRates {
	String nome;
	String sobrenome;
	int diaNasc;
	int mesNasc;
	int anoNasc;
	
	public HeartRates(String nome, String sobrenome, int diaNasc, int mesNasc, int anoNasc) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
	}
	
	public int getIdade() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		LocalDate localDate = LocalDate.now();
		int anoAtual = Integer.parseInt(dtf.format(localDate));
		dtf = DateTimeFormatter.ofPattern("MM");
		int mesAtual = Integer.parseInt(dtf.format(localDate));
		dtf = DateTimeFormatter.ofPattern("dd");
		int diaAtual = Integer.parseInt(dtf.format(localDate));
		int idadeTotal = anoAtual - anoNasc;
		
		if (mesAtual >= mesNasc && diaAtual >= diaNasc) {
			idadeTotal++;
		}
		
		return idadeTotal;
	}
}
