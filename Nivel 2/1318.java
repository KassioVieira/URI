
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;

		n = in.nextInt();
		m = in.nextInt();
		List<Integer> res = new ArrayList<Integer>();

		while (n != 0 && m != 0) {
			List<Integer> bilhetes = new ArrayList<Integer>();
			int cont = 0;

			// adiciona os elementos na lista
			for (int i = 0; i < m; i++) {
				bilhetes.add(in.nextInt());
			}

			Collections.sort(bilhetes); //Ordena a lista
			
			//verifica o número de repetições do numero e remove da lista
			for (int i = 0; i < bilhetes.size(); i++) {
				if (!res.contains(bilhetes.get(i))) {
					res.add(bilhetes.get(i));
					int verifica = Collections.frequency(bilhetes, bilhetes.get(i));
					if (verifica > 1) {
						cont ++;
						bilhetes.remove(bilhetes.get(i));
					}

				}

			}

			System.out.println(cont);
			bilhetes.clear();
			res.clear();
			n = in.nextInt();
			m = in.nextInt();

		}

	}

}
