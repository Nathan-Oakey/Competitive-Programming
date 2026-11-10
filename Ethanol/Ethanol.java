// Nathan Oakey

import java.util.Scanner;

public class Ethanol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String str1 = " ";
        String str2 = " ";
        String str3 = "H";
        String str4 = " ";
        String str5 = " ";

        for (int i = 0; i < num; i++) {
            str1 = str1 + " H";
            str2 = str2 + " |";
            str3 = str3 + "-C";
            str4 = str4 + " |";
            str5 = str5 + " H";
        }
     
        str3 = str3 + "-OH";

        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5);
    }    

}
