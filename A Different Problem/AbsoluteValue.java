import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (sc.hasNextLong()) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = x - y;
            System.out.println(Math.abs(z));
        }
    }
}
