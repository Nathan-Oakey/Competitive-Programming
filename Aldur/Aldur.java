import java.util.Scanner;

public class Aldur {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}