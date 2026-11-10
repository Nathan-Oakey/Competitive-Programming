import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int countS = 0;
        int countM = 0;
        int countL = 0;

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            if (arr[0].equals("S")) {
                countS += Integer.parseInt(arr[1]);
            } else if (arr[0].equals("M")) {
                countM += Integer.parseInt(arr[1]);
            } else {
                countL += Integer.parseInt(arr[1]);
            }
        }

        countS = (countS + 5) / 6; 
        countM = (countM + 7) / 8; 
        countL = (countL + 11) / 12;
        System.out.println(countS + countM + countL);
    }
}