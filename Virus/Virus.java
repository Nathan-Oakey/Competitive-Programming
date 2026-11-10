import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() < s2.length()) {
            int i = 0;
            int j = 0;
            while (i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    i++;
                }
                j++;
            }
            if (i == s1.length()) {
                System.out.println("Ja");
            } else {
                System.out.println("Nej");
            }
        }
        else {
            System.out.println("Nej");
        }
    }
}