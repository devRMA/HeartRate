package pacote;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		HeartRates pessoa1 = new HeartRates("Anderson", "Menezes", 25, 02, 2003);
		System.out.println(pessoa1.getIdade());
	}

}
