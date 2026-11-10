// Nathan Oakey

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double max = Math.floor(Math.sqrt((double)(w*w + h*h)));
        max = (int)max;
        int current = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (current <= max) {
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }
            if (i != n - 1) {
                current = sc.nextInt();
            }
        }
    }
}