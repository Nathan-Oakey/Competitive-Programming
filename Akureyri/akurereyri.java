import java.util.HashMap;
import java.util.Scanner;

public class akurereyri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String place = sc.nextLine();

            if (hm.containsKey(place)) {
                int value = hm.get(place);
                value++;
                hm.replace(place, value);
            } else {
                hm.put(place, 1);
            }
        }

        for (String key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}