import java.util.Scanner;

public class Main {
	
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int n,m, a,b;
		String resposta = "";

		while(t != 0){
			
			n = in.nextInt();
			m = in.nextInt();
			
			int aux = m;

			int [][] grafo = new int[n][m];

			while(aux != 0){
				a = in.nextInt();
				b = in.nextInt();

				grafo[b-1][a-1] = 1;
				aux--;
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					System.out.print(grafo[i][j]+" ");
				}
				System.out.println();
			}

			boolean  x;
			for(int i = 0; i < n-1; i++){
	             boolean [] visited = new boolean[n];
	            
	            x =  dfs(i, grafo, visited);
	            if(x == true){
	            	resposta = "SIM";
	            	break;
	            }else{
	            	resposta = "NAO";
	            }
	        }
			
			if(resposta.equals("SIM")){
				System.out.println(resposta);
			}else{
				System.out.println(resposta);
			}
			
	        

			t--;
		}

	}
	
    public static boolean  dfs(int i, int[][] mat, boolean [] visited){
        visited[i] = true; 

        for ( int j = 0; j < visited.length; j++ ){

            if ( mat[i][j] ==1  && !visited[j] ){
                dfs(j, mat, visited);
            }else{
            	flag = true;
            }

        }
        return flag;
    }

}
