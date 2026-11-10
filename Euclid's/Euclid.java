// Nathan Oakey

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        long max = Math.max(x, y);
        long min = Math.min(x, y);

        long temp;
        while (max%min != 0) {
            temp = min;
            min = max%min;
            max = temp;
        }
        System.out.println(min);
    }
}
