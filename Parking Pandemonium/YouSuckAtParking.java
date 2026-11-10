import java.util.Scanner;

public class YouSuckAtParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ttc = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        int numc = Integer.parseInt(sc.nextLine());

        System.out.println(ttc * numc);
    }
}
