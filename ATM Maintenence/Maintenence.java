import java.util.Scanner;

public class Maintenence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            if (w <= k) {
                sb.append("1");
                k -= w;
            } else {
                sb.append("0");
            }
        }
        System.out.println(sb.toString());
    }
}