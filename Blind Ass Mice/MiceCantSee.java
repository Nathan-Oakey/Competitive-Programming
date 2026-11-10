import java.util.Scanner;

public class MiceCantSee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int wife = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            int mouse = sc.nextInt();
            double time = (double) D/(wife + mouse);
            sum += time * mouse * 2;
        }
        sum = Math.round(sum);
        System.out.println((int) sum);
    }
}