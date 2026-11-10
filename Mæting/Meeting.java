import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();

        HashMap<Integer, Integer> hm = new HashMap<>();

        String[] nums = sc.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            hm.put(Integer.parseInt(nums[i]), 1);
        }

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(sc.next());
            if (hm.containsKey(key)) {
                int val = hm.get(key);
                val++;
                hm.replace(key, val);
            }
            else {
                hm.put(key, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int key : hm.keySet()) {
            if (hm.get(key) > 1) {
                list.add(key);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (list.contains(Integer.parseInt(nums[i]))) {
                sb.append(nums[i]).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}