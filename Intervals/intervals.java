import java.util.Scanner;

public class intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[] loginTimes = new int[n];
        int[] logoutTimes = new int[n];
        int online = 0;
        int numHours = 0;

        for (int i = 0; i < n; i++) {
            loginTimes[i] = sc.nextInt();
            logoutTimes[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < n; j++) {
                if (loginTimes[j] == i) {
                    online++;
                }
                if (logoutTimes[j] == i) {
                    online--;
                }
            }
            if (online >= k) {
                    numHours++;
                }
        }
        System.out.println(numHours);
    }
}
