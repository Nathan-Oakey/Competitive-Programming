import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            if (str.startsWith("simon says")) {
                if (str.length() > 11) {
                    String newstr = str.substring(11);
                    System.out.println(newstr);
                } else {
                    System.out.println();
                }
            } else {
                System.out.println();
            }
        }
    }
}
