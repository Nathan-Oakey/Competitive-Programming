import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class kittenonatree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int branch = Integer.parseInt(sc.nextLine());

        String line = sc.nextLine();

        while (!line.equals("-1")) {
            String[] str = line.split(" ");
            int a = Integer.parseInt(str[0]);
            for (int i = 1; i < str.length; i++) {
                int child = Integer.parseInt(str[i]);
                hm.put(child, a);
            }

            line = sc.nextLine();
        }

        boolean atRoot = false;
        ArrayList<Integer> pathTaken = new ArrayList<Integer>();
        pathTaken.add(branch);

        while (hm.containsKey(branch)) {
            branch = hm.get(branch);
            pathTaken.add(branch);
        }
        
        for (int i = 0; i < pathTaken.size(); i++) {
            System.out.print(pathTaken.get(i) + " ");
        }
    }
}
