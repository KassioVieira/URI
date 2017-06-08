import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MaiorPalindromo{
    
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);

      while(in.hasNext()){
         int n = in.nextInt();
         
         while(n != 0){
           int isPalidromo = 0;
           List<String> palavras = new ArrayList<>();
           List<String> palidromo = new ArrayList<>();
           List<Integer> tamanhos = new ArrayList<>();

           for(int i = 0; i < n; i++){
               palavras.add(in.next());
           }           

           String aux="";
           for(int j = 0; j < n; j++){
             String p = palavras.get(j); //pega a palavra
             //System.out.println("Palavra = "+p);
             
             for(int k = 0; k < palavras.get(j).length(); k++){
    
                 //pega o caracter inicial da palavra , e depois os outros
                 //System.out.println("C = "+c);
                 String verificar="";
                 char c = palavras.get(j).charAt(k);
                 String subFisrt = p.substring(k,palavras.get(j).length());
                 //System.out.println("First: "+subFisrt);
                 subFisrt = subFisrt.substring (1, subFisrt.length());
                 //System.out.println("C = "+c);
                 int posicao = subFisrt.indexOf(c);

                 subFisrt = subFisrt.substring(0,posicao+1);
                 verificar = c + subFisrt;
                 //System.out.println("\nV :"+verificar);
                 //System.out.println("Sec: "+subFisrt);
                 
    
                 isPalidromo = ehPalidromo(verificar);

                  if(isPalidromo == 1){            
                      
                          int t = verificar.length();
                          palidromo.add(verificar);
                          tamanhos.add(t);
                   }
                   

                   isPalidromo = 0;
                   verificar = "";
             }

           }
           
          List<Integer> ls = new ArrayList<>();
          for(int m = 0; m < tamanhos.size(); m++){

                String teste = palidromo.get(m);
                int freqS = Collections.frequency(palidromo, teste);

                int testeN = tamanhos.get(m);
                 //System.out.println("M = "+m+" Palavra = "+teste+" Tamanho = "+testeN);
                int freq = Collections.frequency(tamanhos, testeN);
                 //System.out.println("Frequencia Palavra = "+freqS+" Frequencia Tamanho = "+freq);
                if(freq >= n && freqS == n){
                        if(!ls.contains(testeN)){
                             ls.add(testeN);
                        }
                }
               // System.out.println(palidromo);
                palidromo.remove(m);
                tamanhos.remove(m);
                
                 //System.out.println(palidromo);
                 //System.out.println(tamanhos);
                // System.out.println();
          }
          System.out.println(Collections.max(ls));

           //System.out.println(palidromo);
           //System.out.println(tamanhos);
           n--;
         }

      }

    }


    public static int ehPalidromo(String original){
        int verdadeiro = 0;
        String invertida = new StringBuffer(original).reverse().toString(); 
        //System.out.println("Original = "+ original);
        //System.out.println("Invertida = "+ invertida);
        if(original.equals(invertida)){
            verdadeiro = 1;
        }
        return verdadeiro;  
    }
}
