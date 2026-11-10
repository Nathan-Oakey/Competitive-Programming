import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boardwalks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String[] params = br.readLine().split(" ");

        int n = Integer.parseInt(params[0]);
        int s = Integer.parseInt(params[1]);
        int b = Integer.parseInt(params[2]);

        int[][] edges = new int[s + b][3];

        for (int i = 0; i < (s + b); i++) {
            String[] edge = br.readLine().split(" ");
            edges[i][0] = Integer.parseInt(edge[0]);
            edges[i][1] = Integer.parseInt(edge[1]);
            if (i < s) {
                edges[i][2] = 0;
            } else {
                edges[i][2] = Integer.parseInt(edge[2]);
            }
        }

        // Union Find
        Arrays.sort(edges, Comparator.comparing(e -> e[2]));

        UnionFind uf = new UnionFind(n);
        int hours = 0, count = 0, components = n;

        for (int[] edge : edges) {
            int b1 = edge[0], b2 = edge[1], t = edge[2];

            if (uf.find(b1) != uf.find(b2)) {
                uf.union(b1, b2);
                hours += t;
                components--;
                if (++count == n - 1) {break;}
            }
        }

        if (components == 1) {System.out.println(hours);}
        else {System.out.println("more boardwalks needed!");}
    }
}

class UnionFind {
    private final int[] parent;
    private final int[] rank;
    private int count; // Tracks the number of disjoint components

    // Initializes Union-Find structure with 'n' elements (0 to n-1)
    public UnionFind(int n) {
        if (n <= 0) throw new IllegalArgumentException("Size must be greater than 0");
        
        parent = new int[n + 1];
        rank = new int[n + 1];
        count = n;
        
        for (int i = 1; i < n; i++) {
            parent[i] = i; // Each element is initially its own root
            rank[i] = 1;   // Initial rank/depth of 1
        }
    }

    // Finds the representative root of element 'i' with Path Compression
    public int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        // Path Compression: points current node directly to the actual root
        return parent[i] = find(parent[i]); 
    }

    // Unites the sets containing elements 'i' and 'j' using Union by Rank
    public boolean union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);

        // Elements are already in the same set
        if (rootI == rootJ) {
            return false; 
        }

        // Union by Rank: attach the smaller depth tree under the larger depth tree
        if (rank[rootI] < rank[rootJ]) {
            parent[rootI] = rootJ;
        } else if (rank[rootI] > rank[rootJ]) {
            parent[rootJ] = rootI;
        } else {
            parent[rootJ] = rootI;
            rank[rootI]++; // Increment rank if trees have equal depth
        }

        count--; // One less independent component
        return true;
    }

    // Checks if two elements belong to the same set
    public boolean connected(int i, int j) {
        return find(i) == find(j);
    }

    // Returns the total number of disjoint sets left
    public int getCount() {
        return count;
    }
}
