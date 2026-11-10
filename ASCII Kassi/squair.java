import java.util.Scanner;

public class squair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] c = new char[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                c[i][j] = ' ';
                if (i == 0 || i == n + 1) {
                    c[i][j] = '-';
                }
                if (j == 0 || j == n + 1) {
                    c[i][j] = '|';
                }
                if ((i == 0 && j == 0) || (i == 0 && j == n + 1) || (i == n + 1 && j == 0) || (i == n + 1 && j == n + 1)) {
                    c[i][j] = '+';
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(new String(c[i]));
        }
        
    }
}