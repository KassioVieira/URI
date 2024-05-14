import java.util.Scanner;

public class Main {

    public static boolean isConsanant(char c){
      String consonants = "bcdfghjklmnpqrstvwxyz";
      return consonants.contains(String.valueOf(c));
    }
  
    private static boolean isThereConsonantSequence(String name){
      boolean test = false;
      for (int i = 1; i < name.length(); i++) {
        if(i != name.length() -1) {
            if (
              isConsanant(name.charAt(i))
              && isConsanant(name.charAt(i-1))
              && isConsanant(name.charAt(i+1))) 
            {
              return true;
            }
        }
      }
      return test;
    }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        while (qtd > 0) {
            String name = scanner.next();

            boolean isHard = isThereConsonantSequence(name.toLowerCase());

            if (isHard) {
              System.out.println(name+" "+ "nao eh facil");
            }else {
              System.out.println(name+" "+ "eh facil");
            }
          
            qtd--;
        }
        
        scanner.close();
    }
}
