import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {System.out.println("YES"); continue;}
            
            long square = (long) num * num;
            int count = 0;
            while (square != 0) {
                count++;
                square /= 10;
            }

            square = (long) num * num;
            boolean flag = false;

            for (int j = 1; j < count; j++) {
                long parts = (long) Math.pow(10, j);
                if (parts != num) {
                    long sum = square/parts + square % parts;
                    if (sum == num) {
                        System.out.println("YES");
                        flag = true;
                    }
                }
            }
            if (!flag) {System.out.println("NO");} 
        }
    }
}
