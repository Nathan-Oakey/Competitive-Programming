import java.util.HashSet;
import java.util.Scanner;

public class korok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            hs.add(sc.nextLine());
        }

        System.out.println(hs.size());
    }
}