import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MiddleMan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ids);
        if (n % 2 == 1) {
            int m = n/2;
            System.out.println(ids[m]);
        } else {
            int m1 = n/2 - 1;
            int m2 = n/2;
            double m = (ids[m1] + ids[m2]) / 2.0;
            System.out.println(m);
        }
    }
}
