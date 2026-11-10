// Nathan Oakey

import java.util.*;

public class WhichNumberIsIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String string = "";
            int n = sc.nextInt();
            if (n % 2 == 1) {
                string += "O";
            } 
            if (Math.sqrt(n) == (int)(n/Math.sqrt(n))) {
                string += "S";
            }
            if (string.equals("")) {
                string += "EMPTY";
            }
            System.out.println(string);
        }
    }
}
