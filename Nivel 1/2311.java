import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		int n;

		n = in.nextInt();

		String[] competidores = new String[n];
		List<Double> notas = new ArrayList<>();
		double[] resultado = new double[n];
		

		for (int i = 0; i < competidores.length; i++) {
			double grau, totalNotas = 0, aux;
			
			competidores[i] = in.next();
			grau = in.nextDouble();
			
			for (int j = 0; j < 7; j++) {

				aux = in.nextDouble();
				notas.add(aux);

			}
			
			Collections.sort(notas);
			notas.remove(notas.get(0));
			notas.remove(notas.get(5));
			

			for (int k = 0; k < notas.size(); k++) {
				totalNotas += notas.get(k);
			}
			
			resultado[i] = totalNotas * grau;
			
			notas.clear();

		}

		for (int i = 0; i < competidores.length; i++) {
			String result = String.format("%.2f", resultado[i]);
			System.out.println(competidores[i] +" "+result.replaceAll(",", "."));
		}
	}

}
