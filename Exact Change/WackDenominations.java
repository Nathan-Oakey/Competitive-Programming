import java.util.Scanner;

public class WackDenominations {
    public static void main(String[] args) {
        int ones = 0;
        int fives = 0;
        int fifteens = 0;
        int thirties = 0;
        int onefifties = 0;

        Scanner sc = new Scanner(System.in);

        int riches = Integer.parseInt(sc.nextLine());

        onefifties = riches / 150;
        riches %= 150;

        thirties = riches / 30;
        riches %= 30;

        fifteens = riches / 15;
        riches %= 15;

        fives = riches / 5;
        riches %= 5;

        ones = riches / 1;

        StringBuilder sb = new StringBuilder();
        sb.append(ones).append(" ")
            .append(fives).append(" ")
            .append(fifteens).append(" ")
            .append(thirties).append(" ")
            .append(onefifties);

        System.out.println(sb.toString());
    }
}
