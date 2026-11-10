import java.util.Scanner;

public class CatToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int num = (t + k - 1) / k;
        System.out.println(num);
    }
}