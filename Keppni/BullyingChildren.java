import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BullyingChildren {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> hm = new HashMap<>();

        String[] nandk = br.readLine().split(" ");

        int n = Integer.parseInt(nandk[0]);
        int k = Integer.parseInt(nandk[1]);

        String[] keys = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(keys[i]);

            if (hm.containsKey(key)) {
                int val = hm.get(key);
                val++;
                hm.replace(key, val);
            }
            else {
                hm.put(key, 1);
            }
        }

        int assignable = 0;
        for (int key : hm.keySet()) {
            int val = hm.get(key);
            if (val < k) {
                assignable += val;
            }
            else {
                assignable += k;
            }
        }

        System.out.println(assignable);
    }
}