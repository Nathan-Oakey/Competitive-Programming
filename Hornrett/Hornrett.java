// Nathan Oakey

import java.util.Scanner;

public class Hornrett {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        if ((a*a + b*b) == c*c) {
            System.out.println((a*b)/2);
        } else {
            System.out.println(-1);
        }

    }
}