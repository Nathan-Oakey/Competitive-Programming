import java.util.Scanner;

public class Tajna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int strLen = str.length();

        int R = 1; int C = strLen;
        for (int i = 1; i <= Math.sqrt(strLen); i++) {
            if (strLen % i == 0) {
                int r = i;
                int c = strLen / i ;
                if (r <= c) {
                    R = r;
                    C = c;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                sb.append(str.charAt(col * R + row));
            }
        }
        System.out.println(sb.toString());

    }
}
