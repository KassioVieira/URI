import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotasPerdidas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> numeracao = new ArrayList<>();
		List<String> pes = new ArrayList<>();

		while (in.hasNext()) {

			int n = in.nextInt();
			int contador = 0;

			for (int i = 0; i < n; i++) {
				int aux = in.nextInt();
				numeracao.add(aux);

				String pe = in.next();
				pes.add(pe);
			}

			for (int j = 0; j < numeracao.size(); j++) {

				int numero = numeracao.get(j);
				String lado = pes.get(j);

				numeracao.remove(j);
				pes.remove(j);

				for (int k = 0; k < numeracao.size(); k++) {
					if (numero == numeracao.get(k) && lado.equals(pes.get(k)) == false) {
						contador++;
						numeracao.remove(numeracao.get(k));
						pes.remove(pes.get(k));
					}
				}

			}

			numeracao.clear();
			pes.clear();

			System.out.println(contador);
		}

	}

}
