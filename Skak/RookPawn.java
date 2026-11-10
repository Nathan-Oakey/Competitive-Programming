import java.util.Scanner;

public class RookPawn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        if (r1 != p1 && r2 != p2) {
            System.out.println("2");
        }
        else {
            System.out.println("1");
        }
    }
}
