// Nathan Oakey

import java.util.Scanner;

public class catinthebox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[4];

        for (int i = 0; i < list.length; i++){

            list[i] = sc.nextInt();
        } 

        if (list[0] * list[1] * list[2] < list[3]) {
            System.out.println("TOO TIGHT");
        } else if (list[0] * list[1] * list[2] == list[3]){
            System.out.println("COZY");
        } else {
            System.out.println("SO MUCH SPACE");
        }
    }
}