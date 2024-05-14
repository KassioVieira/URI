import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double L = scanner.nextDouble();
        int nextPeople = 0;
        double rest = L;


        double Q = scanner.nextDouble();

        scanner.nextLine();
        String[] nomes = scanner.nextLine().split(" ");

        while(rest > Q) {
          if(nextPeople == nomes.length -1) {
            nextPeople = 0;
          } else {
            nextPeople += 1;
          }

          rest = rest - Q;
        }
      
        System.out.printf("%s %.1f\n", nomes[nextPeople], rest);
    }
}
