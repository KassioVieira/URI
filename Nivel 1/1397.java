import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		while (n != 0) {
			int pontosA = 0, pontosB = 0;
			int a = 0;
			int b = 0;

			for (int i = 0; i < n; i++) {
				a = in.nextInt();
				b = in.nextInt();
				
				if (a > b) {
					pontosA++;
				} else if (a < b) {
					pontosB++;
				}
			}

			

			System.out.println(pontosA + " " + pontosB);
			n = in.nextInt();
		}

	}

}
