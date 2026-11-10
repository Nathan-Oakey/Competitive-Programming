import java.util.Scanner;
import java.util.Locale;

public class dog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xg = sc.nextDouble();
        double yg = sc.nextDouble();
        double xd = sc.nextDouble();
        double yd = sc.nextDouble();
        double xh = -10001, yh = -10001;

        boolean canEscape = false;

        while (sc.hasNextDouble()) {
            xh = sc.nextDouble();
            yh = sc.nextDouble();

            double gDist = Math.hypot(xg - xh, yg - yh);
            double dDist = Math.hypot(xd - xh, yd - yh);

            if (2.0 * gDist <= dDist) {
                canEscape = true;
                break;
            }
        }

        if (canEscape) {
            System.out.printf(Locale.US, "The gopher can escape through the hole at (%.3f,%.3f).%n", xh, yh);
        } else {
            System.out.println("The gopher cannot escape.");
        }

        sc.close();
    }
}
