import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Heimilisverk {
    public static void main(String[] args) throws java.io.IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (hs.add(s)) {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}

