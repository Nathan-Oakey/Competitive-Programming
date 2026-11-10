import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Graduation {

    public static class DSU {
        int[] parent;
        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {parent[i] = i;}
        }

        int find(int x) {
            if (parent[x] != x) {parent[x] = find(parent[x]);}
            return parent[x];
        }
        
        void union(int a, int b) {
            a = find(a);
            b = find(b);
            if (a != b) {parent[b] = a;}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int cols = sc.nextInt();
        int classes = sc.nextInt();
        sc.nextLine();

        int num = classes;

        char[][] arr2d = new char[lines][cols];
        for (int i = 0; i < lines; i++) {
            arr2d[i] = sc.nextLine().toCharArray();
        }

        DSU dsu = new DSU(cols);

        ArrayList<Integer>[] classCols = new ArrayList[classes];
        for (int c = 0; c < classes; c++) {
            classCols[c] = new ArrayList<>();
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                int cls = arr2d[i][j] - 'A';
                classCols[cls].add(j); 
            }
        }

        for (int cls = 0; cls < classes; cls++) {
            ArrayList<Integer> colsList = classCols[cls];
            if (colsList.size() > 1) {
                int first = colsList.get(0);
                for (int k = 1; k < colsList.size(); k++) {
                    dsu.union(first, colsList.get(k));
                }
            }
        }

        HashSet<Integer> unique = new HashSet<>();
        for (int col = 0; col < cols; col++) {
            unique.add(dsu.find(col));
        }

        System.out.println(unique.size());
    }
}
