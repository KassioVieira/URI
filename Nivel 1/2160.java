import java.util.Scanner;

public class Main {
 
 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String texto;
		
		texto = in.nextLine();
		
		if(texto.length() <= 80){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
 
}
