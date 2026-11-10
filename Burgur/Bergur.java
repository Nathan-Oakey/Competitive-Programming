// Nathan Oakey

import java.util.Scanner;

public class Bergur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String hours = sc.nextLine();
        String[] hrs = hours.split(" ");
        int[] inthrs = new int[n];
        for (int i = 0; i < n; i++) {
            inthrs[i] = Integer.parseInt(hrs[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            if (inthrs[i] > inthrs[i + 1]) {
                inthrs[i] = inthrs[i + 1];
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += inthrs[i];
        }
        System.out.println(total);
    }
}