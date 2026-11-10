// Nathan Oakey

import java.util.Scanner;

public class Hugo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numHugos = sc.nextInt();

        int current1; int current2; int current3;

        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:\n");

        for (int i = 0; i < numHugos; i++) {
            current1 = sc.nextInt();
            current2 = sc.nextInt();
            current3 = sc.nextInt();

            if ((current1 < current2) && (current2 < current3)) {
                sb.append("Ordered\n");
            } else if ((current1 > current2) && (current2 > current3)) {
                sb.append("Ordered\n");
            } else {
                sb.append("Unordered\n");
            }
        }

        System.out.println(sb.toString());


    }
}
