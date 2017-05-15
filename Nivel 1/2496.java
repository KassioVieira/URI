import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		while (n != 0) {
			int quantidade = in.nextInt();
			int trocas = 0;

			List<Character> alfabeto = new ArrayList<>();
			alfabeto.addAll(preenche());

			List<Character> digitadas = new ArrayList<>();
			String aux = in.next();
			for (int i = 0; i < quantidade; i++) {
				digitadas.add(aux.charAt(i));
			}
			// verifica os dados
			for (int i = 0; i < digitadas.size(); i++) {
				if (digitadas.get(i) != alfabeto.get(i)) {
					trocas++;
				}
			}

			if (trocas > 2) {
				System.out.println("There aren't the chance.");
			} else {
				System.out.println("There are the chance."); 
			}

			n--;
		}
	}

	//cria a lista com as letras do alfabeto
	public static List<Character> preenche() {

		List<Character> alfabeto = new ArrayList<>();
		int aux = 'A';
		int a = 0;
		for (int i = 1; i < 27; i++) {
			a = aux++;
			char letra = (char) a;
			alfabeto.add(letra);
		}
		
		return alfabeto;
	}
	
}
