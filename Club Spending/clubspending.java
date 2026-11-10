import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class clubspending {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        LinkedHashMap<String, Double> hm = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" \\$");
            String key = split[0];
            double value = Double.parseDouble(split[1]);
            hm.put(key, hm.getOrDefault(key, 0d) + value);
            System.out.println(key + " $" + String.format("%.2f", hm.get(key)));
        }
    }
}