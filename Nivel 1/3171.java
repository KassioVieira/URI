import java.util.Scanner;

class UnionFind {
    private int[] parent;

    public UnionFind(int n) {
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
         System.out.println("x ===> "+ x);
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();

        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < l; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            uf.union(x, y);
        }

        boolean completo = true;
        int root = uf.find(1);
        for (int i = 2; i <= n; i++) {
            if (uf.find(i) != root) {
                completo = false;
                break;
            }
        }

        if (completo) {
            System.out.println("COMPLETO");
        } else {
            System.out.println("INCOMPLETO");
        }
    }
}
