import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dA, dD, dL, gA, gD, gL, bonus, instancias;
		int golpeD, golpeG;

		instancias = in.nextInt();
		while (instancias != 0) {
			bonus = in.nextInt();

			/* Dabriel */

			dA = in.nextInt();
			dD = in.nextInt();
			dL = in.nextInt();

			golpeD = ((dA + dD) / 2);
			if (dL % 2 == 0) {
				golpeD += bonus;
			}

			/* Guarte */

			gA = in.nextInt();
			gD = in.nextInt();
			gL = in.nextInt();

			golpeG = ((gA + gD) / 2);
			if (gL % 2 == 0) {
				golpeG += bonus;
			}

			if (golpeD > golpeG) {
				System.out.println("Dabriel");
			} else if (golpeG > golpeD) {
				System.out.println("Guarte");
			} else {
				System.out.println("Empate");
			}

			instancias--;
		}
	}
}
