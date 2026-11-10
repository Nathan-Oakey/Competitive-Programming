// Nathan Oakey

import java.util.Scanner;

public class Veikur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.contains("COV")) {
            System.out.println("Veikur!");
        }
        else {System.out.println("Ekki veikur!");}
    }
}