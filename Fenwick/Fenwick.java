import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fenwick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] NandQ = br.readLine().split(" ");

        int N = Integer.parseInt(NandQ[0]); int Q = Integer.parseInt(NandQ[1]);

        FT ft = new FT(N);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) { // Loop through all operations
            String[] op = br.readLine().split(" ");
            if (op[0].equals("+")) { // + operation
                ft.update(Integer.parseInt(op[1]) + 1, Long.parseLong(op[2]));
            } else { // ? operation
                sb.append(ft.query(Integer.parseInt(op[1]))).append("\n");       
            }
            
        }
        System.out.print(sb.toString());
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