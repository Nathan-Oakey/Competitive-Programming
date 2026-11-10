// Nathan Oakey

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int grade = sc.nextInt();
                arr[j] = grade;
                sum = sum + grade;
            }

            float average = (float) sum / n;

            int above = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > average) {
                    above++;
                }
            }

            float aboveAverage = (float) above / n * 100;

            System.out.printf("%.3f%%\n", aboveAverage);

        }

    }
}