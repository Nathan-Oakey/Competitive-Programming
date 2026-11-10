import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Democracy {
    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(strArr[0]);
        arr[1] = Integer.parseInt(strArr[1]);

        String[] cities = new String[arr[0]]; 
        int[] amount = new int[26];
        for (int i = 0; i < arr[0]; i++) {
            cities[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[1]; i++) {
            for (String city : cities) {
                amount[city.charAt(i) - 'a']++;
            }
            int max = 0;
            int maxIdx = 0;
            for (int j = 0; j < 26; j++) {
                if (amount[j] > max) {
                    max = amount[j];
                    maxIdx = j;
                }
            }
            amount = new int[26];
            char ch = (char) maxIdx;
            ch += 'a';
            
            sb.append(String.valueOf(ch));
        }
        System.out.println(sb.toString());
    }
}