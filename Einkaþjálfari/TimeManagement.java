import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class TimeManagement {

    static class Fenwick {
        int[] bit;
        Fenwick(int n) { 
            bit = new int[n + 2]; 
        }

        void update(int i, int delta) {
            for (; i < bit.length; i += i & -i)
                bit[i] += delta;
        }

        int query(int i) {
            int sum = 0;
            for (; i > 0; i -= i & -i)
                sum += bit[i];
            return sum;
        }

        int rangeQuery(int l, int r) {
            return query(r) - query(l - 1);
        }
    }

    static class Query {
        String type;
        int x, y;
        Query(String type, int x, int y) { 
            this.type = type; 
            this.x = x; 
            this.y = y; 
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        List<Query> queries = new ArrayList<>();
        TreeSet<Integer> coords = new TreeSet<>();
    
        
        for (int i = 0; i < q; i++) {
            String[] arr = br.readLine().split(" ");
            String s = arr[0];
            int x = Integer.parseInt(arr[1]);
            int y = -1;
            if (arr[0].contains("F")) {
                y = Integer.parseInt(arr[2]);
            }
            queries.add(new Query(s, x, y));

            coords.add(x);
            if (y != -1) {
                coords.add(y);
            }
        }

        List<Integer> sorted = new ArrayList<>(coords);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sorted.size();
        for (int i = 0; i < n; i++) {
            hm.put(sorted.get(i), i + 1);
        }

        Fenwick bit = new Fenwick(n);
        boolean[] present = new boolean[n + 1];

        for (Query query : queries) {
            int x = hm.get(query.x);
            if (query.type.equals("A")) {
                if (!present[x]) {
                    present[x] = true;
                    bit.update(x, 1);
                }
            } else if (query.type.equals("D")) {
                if (present[x]) {
                    present[x] = false;
                    bit.update(x, -1);
                }
            } else {
                int y = hm.get(query.y);
                System.out.println((query.y - query.x + 1 - bit.rangeQuery(x, y)));
            }
        }
    }    
}
