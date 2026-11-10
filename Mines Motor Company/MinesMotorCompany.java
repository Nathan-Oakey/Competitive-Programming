import java.util.Scanner;

public class MinesMotorCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        char[] arr1 = sc.nextLine().toCharArray();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            char[] arr2 = sc.nextLine().toCharArray();
            sum += Math.abs(arr2[0] - arr1[0]) + Math.abs(arr2[1] - arr1[1]);
            arr1 = arr2;
        }
        System.out.println(sum);
    }
}
