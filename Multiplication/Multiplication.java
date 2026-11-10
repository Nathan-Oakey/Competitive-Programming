import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long prod = 1;
        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine()) % 1000000007;
            if (num < 0) {
                num += 1000000007;
            }
            prod = (prod * num) % 1000000007;
        }
        System.out.println((int) prod);
    }
}