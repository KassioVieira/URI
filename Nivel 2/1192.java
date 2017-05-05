import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		while (n != 0) {
			String caracter = in.next();
			String v1 = String.valueOf(caracter.charAt(0));
			String v2 = String.valueOf(caracter.charAt(2));

			int a = Integer.parseInt(v1);
			int b = Integer.parseInt(v2);
			String letra = Character.toString(caracter.charAt(1));

			if (a == b) {
				System.out.println(a * b);
			} else if (maisculoMinusculo(letra) == true) {
              System.out.println(b - a);
			}else if(maisculoMinusculo(letra) == false){
				 System.out.println(b + a);
			}

			n--;
		}

	}

	public static boolean maisculoMinusculo(String letra) {
		boolean isMaisculo = false;
		String aux = letra;

		if (letra.equals(aux.toUpperCase())) {
			isMaisculo = true;
		}

		return isMaisculo;
	}
 
}