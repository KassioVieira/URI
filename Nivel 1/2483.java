import java.io.IOException;
import java.util.Scanner;
import java.lang.StringBuffer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Feliz natal!");
        int indice,i;

        indice = in.nextInt();
        indice--;
        while(indice != 0){
            i = 9;
            sb.insert(i,'a');
            i++;
            indice--;
         }

        System.out.println(sb);
    }

}
