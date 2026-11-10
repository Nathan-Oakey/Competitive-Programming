import java.util.Scanner;

public class superstition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 12) {
            System.out.println(x);
        } else {
            System.out.println(x + 1);
        }
    }
}