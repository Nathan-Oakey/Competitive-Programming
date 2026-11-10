// Nathan Oakey

import java.util.Scanner;

public class Trapizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double r = d/2;

        double circle = Math.PI * r * r;
        
        double trapezoid = (a + b)/2 * h;
        if (circle < trapezoid) {
            System.out.println("Trapizza!");
        }
        else if (circle > trapezoid) {
            System.out.println("Mahjong!");
        }
        else {
            System.out.println("Jafn storar!");
        }
    }
}