import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class BooDidIScareYou {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        } 
        for (int i = 0; i < m; i++) {
            Boolean allowed = true;
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                if (!hs.contains(br.readLine())) {
                allowed = false;
                }
            }
            if (allowed) {
                System.out.println("apply");
            } else {
                System.out.println("why bother?");
            }
        }
    }
}
