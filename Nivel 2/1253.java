import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		while(n != 0){
			String cifrada = in.next();
			int casas = in.nextInt();
			
			char letra;
			String decifra ="";
			
			for(int i = 0; i < cifrada.length(); i++){	
				int aux;
				letra = cifrada.charAt(i);
				aux = letra;
				if(aux == 65){
					aux = 89;
					aux = aux - (casas - 2);
					
				}else{
					aux -=casas;
				}
				
				char novaletra = (char) aux;
				decifra += novaletra;
			}
			
			System.out.println(decifra);
			
			
			n--;
		}

	}

}
