// Nathan Oakey

import java.util.Scanner;

public class Thanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine();
        int n = Integer.parseInt(x);

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (String name : arr) {
            System.out.println("Takk " + name);
        }
    }
}