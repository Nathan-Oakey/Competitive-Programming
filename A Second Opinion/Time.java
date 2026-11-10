// Nathan Oakey

import java.util.Scanner ;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int hrs = s / 3600;
        s = s % 3600;
        int min = s / 60;
        s = s % 60;
        System.out.println(hrs + " : " + min + " : " + s);

    }
}