import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCartas;

		numCartas = in.nextInt();
		String[] descricoes = { "circulo", "circulos", "quadrado", "quadrados", "triangulo", "triangulos" };

		while (numCartas != 0) {

			String[] descCartas = new String[numCartas];
			String[] valorCartas = new String[numCartas];
			String valor = "";
			String descricao = "";
			for (int i = 0; i < descCartas.length; i++) {
				valorCartas[i] = in.next();
				descCartas[i] = in.next();
			}

			for (int i = 0; i < descCartas.length; i++) {
				// System.out.println(valorCartas[i]+" "+descCartas[i]);
				if (!valorCartas[i].equalsIgnoreCase(valor)) {
					valor = valorCartas[i];
				} else if (valorCartas[i].equalsIgnoreCase(valor)) {
                         if(descCartas[i].equalsIgnoreCase(descricao)){
                        	 
                         }
				}
			}

			// reinicia o ciclo
			numCartas = in.nextInt();
		}

	}

}
