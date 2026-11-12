import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < h * b; i++) {
            count++;
            String[] arr = br.readLine().split(" ");
            int t = Integer.parseInt(arr[arr.length - 1]);
            if (t <= 80) sb.append("K");
            else if (t <= 160) sb.append("k");
            else if (t <= 240) sb.append(".");
            else if (t <= 320) sb.append("h");
            else sb.append("H");
            if (count % b == 0 && count != h * b) sb.append("\n");            
        }
        System.out.println(sb.toString());

    }
}