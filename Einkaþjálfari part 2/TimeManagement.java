import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class TimeManagement {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int q = Integer.parseInt(br.readLine());
        ArrayList<Query> queries = new ArrayList<Query>(); // List to store queries
        TreeSet<Integer> coordinates =  new TreeSet<Integer>(); // TreeSet to keep query times in order (to make mapping possible)

        for (int i = 0; i < q; i++) {
            String arr[] = br.readLine().split(" ");
            String type = arr[0];
            int h1 = Integer.parseInt(arr[1]);
            int h2 = -1; // Only used for F type queries
            if (arr[0].contains("F")) { // Check for query of type F 
                h2 = Integer.parseInt(arr[2]); // Change h2 from default value to actual value
            }
            // Add queries and coordinates to their respective data structure
            queries.add(new Query(type, h1, h2));
            coordinates.add(h1);
            if (h2 != -1) {
                coordinates.add(h2);
            } 
        }

        ArrayList<Integer> sorted = new ArrayList<>(coordinates);
        HashMap<Integer, Integer> hm  = new HashMap<>();
        int n = sorted.size();
        for (int i = 0; i < n; i++) {
            hm.put(sorted.get(i), i + 1); // Store the sorted times in a HashMap
        }

        FT ft = new FT(n);
        boolean[] present = new boolean[n + 1];

        StringBuilder sb = new StringBuilder();

        for (Query query : queries) {
            int h1 = hm.get(query.h1);
            if (query.type.equals("A")) { 
                if (!present[h1]) {
                    present[h1] = true;
                    ft.update(h1, 1); // Mark time as busy in fenwick tree
                }
            } else if (query.type.equals("D")) {
                if (present[h1]) {
                    present[h1] = false; 
                    ft.update(h1, -1); // Mark time as no longer busy in fenwick tree
                }
            } else { // F type query
                int h2 = hm.get(query.h2);
                sb.append(query.h2 - query.h1 + 1 - ft.rangeQuery(h1, h2)).append("\n"); // Number of free hours in interval [h1, h2] = total interval length - number of busy times.
            }
        }
        System.out.print(sb.toString());
    }   
}

// Class that stores query types and the hours that come with them. F type queries will be the only queries with an h2.
class Query { 
    String type;
    int h1, h2;
    Query(String type, int h1, int h2) {
    this.type = type;
    this.h1 = h1;
    this.h2 = h2;
    }
}

    class FT {
    long[] ft;
    FT(int n) {ft = new long[n + 2];}

    // Updates the value and all affected values by a given delta
    public void update(int i, long delta) {
        while (i < ft.length) {
            ft[i] += delta; // Change the value at i by delta
            i += i & -i; // Set i to be parent of i
        }
    }

    // Returns the sum of all the values from 0 to i
    public long query(int i) {
        long sum = 0;
        while (i > 0) {
            sum += ft[i]; 
            i -= i & -i;
        }
        return sum;
    }

    // Returns the difference between two queries. (l must be less than r)
    public long rangeQuery(int l, int r) {
        return query(r) - query(l - 1); 
    }
}
