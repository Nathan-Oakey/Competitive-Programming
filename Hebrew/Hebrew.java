// Nathan Oakey

import java.util.Scanner;

public class Hebrew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String newStr = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            newStr += ch[i];
        }
        System.out.println(newStr);

    }
}