import java.util.Scanner;

public class Printed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int printers = 1;
        int statues = 0;
        int num = 0;

        while (statues < n) {
            int remaining = n - statues;
            if (printers >= remaining) {
                statues += printers;
            } else {
                printers *= 2;
            }
            num++;

            if (statues + printers >= n && statues < n) {
                statues += remaining;
                num++;
            }
        } 
        System.out.println(num);


        
        
    }
}