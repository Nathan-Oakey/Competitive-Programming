// Nathan Oakey

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        
        String str1 = new StringBuilder(numbers[0]).reverse().toString();
        String str2 = new StringBuilder(numbers[1]).reverse().toString();

        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        if (num1 < num2) {
            System.out.println(num2);
        }
        else {
            System.out.println(num1);
        }
       
    }
}