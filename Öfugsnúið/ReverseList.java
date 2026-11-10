import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] reversed = new int[n];
        
        for (int i = 0; i < n; i++) {
           reversed[n - i - 1] = sc.nextInt();

        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println(reversed[i]);
        }

        System.out.println(reversed[n - 1]);
        
    }
}