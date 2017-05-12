import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, q;

		while (in.hasNext()) {
			n = in.nextInt();
			q = in.nextInt();

			List<Integer> notas = new ArrayList<>();

			// adiciona as notas
			for (int i = 0; i < n; i++) {
				notas.add(in.nextInt());
			}

			Collections.sort(notas);// ordena os valores em ordem crescente
			Collections.reverse(notas); // reverte a ordem

			// faz a busca;
			for (int i = 0; i < q; i++) {
				int aux = in.nextInt();
				System.out.println(notas.get(aux - 1));
			}
			notas.clear();
		}

	}

}
