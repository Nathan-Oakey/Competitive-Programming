import java.util.Scanner;

public class goodbyeballoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double t = sc.nextDouble();

        double d = v * t + (a * Math.pow(t, 2)) / 2;
        String dstr = String.format("%.10g", d);

        System.out.println(dstr);
    }   
}
