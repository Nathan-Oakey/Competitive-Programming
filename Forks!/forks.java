// Nathan Oakey

import java.util.Scanner;

public class forks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numForks = sc.nextInt();

        int min = sc.nextInt();
        int min2 = sc.nextInt();

        if (min2 < min) {
            int temp = min;
            min = min2;
            min2 = temp;
        }

        for (int i = 0; i < numForks - 2; i++) {
            int current = sc.nextInt();
            if (current < min) {
                min2 = min;
                min = current;
            } else if (current < min2) {
                min2 = current;
            }
        }
        System.out.println(min + min2);
    }
}
