import java.util.ArrayList;
import java.util.Scanner;

public class SecretKey {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numkeys = Integer.parseInt(sc.nextLine());
        ArrayList<String> keys = new ArrayList<String>();

        for (int i = 0; i < numkeys; i++) {
            keys.add(sc.nextLine());
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numkeys; i++) {
            char c = keys.get(i).charAt(i);
            if (c == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        
        System.out.println(sb.toString());
    }
}
