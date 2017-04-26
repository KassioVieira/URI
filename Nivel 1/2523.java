import java.util.Scanner;

public class Main {
 
 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		

		while (in.hasNext()) {
			
			String mensagem, decifrada = "";
			int quantLetras;
			
			mensagem = in.next();

			quantLetras = in.nextInt();

			int[] indice = new int[quantLetras];

			for (int i = 0; i < indice.length; i++) {
				indice[i] = in.nextInt();
			}

			for (int j = 0; j < indice.length; j++) {
				decifrada += mensagem.charAt(indice[j] - 1);
			}

			System.out.println(decifrada);
		}
	}
 
}
