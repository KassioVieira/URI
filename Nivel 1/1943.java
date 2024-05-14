import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String[] levels = {"Top 1", "Top 3", "Top 5", "Top 10", "Top 25", "Top 50", "Top 100"};
        int[] boundaries = {1, 3, 5, 10, 25, 50, 100};
        
        for (int i = 0; i < boundaries.length; i++) {
            if (k <= boundaries[i]) {
                System.out.println(levels[i]);
                break;
            }
        }
    }
}
