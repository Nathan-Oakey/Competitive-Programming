import java.util.HashMap;
import java.util.Scanner;

public class NotEnoughFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> hm = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            hm.put(arr[0], Integer.parseInt(arr[1]));
        }

        String toReturn = "";
        int max = 0;
        for (String key : hm.keySet()) {
            if (hm.get(key) > max) {
                max = hm.get(key);
                toReturn = key;
            }
        }

        System.out.println(toReturn);
        
    }
}