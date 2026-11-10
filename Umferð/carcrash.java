import java.util.Scanner;

public class carcrash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        int num = 0;

        for (int i = 0; i < l; i++) {
            String[] lane = sc.nextLine().split("");
            for (int j = 0; j < lane.length; j++) {
                if (lane[j].equals(".")) {
                    num++;
                }
            }
        }
        float p = (float) num / (m * l);
        System.out.println(p);
    }
}
