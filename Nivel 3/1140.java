import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String frase = in.nextLine();
		boolean tautogramas = false;

		while (!frase.equals("*")) {

			String[] arrayString = frase.split(" ");	
			
			for (int i = 0; i < arrayString.length; i++) {
				String aux = arrayString[i];
				String primeira = Character.toString(aux.charAt(0));
				if (primeira.equalsIgnoreCase(Character.toString(frase.charAt(0)))) {
					tautogramas = true;
				}else{
					tautogramas = false;
					break;
				}
				
			}
			if (tautogramas == true)
				System.out.println("Y");
			else
				System.out.println("N");

			frase = in.nextLine();
		}

	}
}
