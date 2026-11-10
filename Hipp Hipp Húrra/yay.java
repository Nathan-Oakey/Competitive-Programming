import java.util.Scanner;

public class yay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Hipp hipp hurra, " +  name + "!");
        }
    }
}