import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class echo {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(r.readLine());
            } else {
                r.readLine();
            }
        }
    }
}