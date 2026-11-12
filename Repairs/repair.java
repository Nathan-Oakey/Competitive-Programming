import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
public class repair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(", ");
            for (int j = 0; j < m; j++) {
                String[] c = line[j].split(" ");
                if (c[1].equals("0")) {
                    if (hm.containsKey(c[0])) {
                        int v = hm.get(c[0]); hm.put(c[0], v + 1);
                    } else {
                        hm.put(c[0], 1);
                    }
                }
            }
        }
        if (hm.keySet().size() != m) System.out.println(0);
        else System.out.println(Collections.min(hm.values()));
    }
}