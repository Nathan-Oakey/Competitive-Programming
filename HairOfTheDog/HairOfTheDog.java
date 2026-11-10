// Nathan Oakey

import java.util.*;

public class HairOfTheDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hangovers = 0;

        String current = sc.nextLine();
        for (int i = 0; i < n-1; i++) {
            String next = sc.nextLine();
            if (!current.equals(next) && (next.equals("drunk"))){
                hangovers++;
            }
            current = next;
        }
        System.out.println(hangovers);
    }
}
    