import java.util.Scanner;

public class AIArt {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); double y = sc.nextDouble();       
        
        double smallestEdge = Math.min(x,y);
        double area = (x * y) / 2;
        double r = smallestEdge / 2;
        double largestArea = (PI * r * r);

        if (area > largestArea) {
            if (area > smallestEdge * smallestEdge) {
                System.out.println("blank");
            } else {
                System.out.println("square");
            }
        } else {
            System.out.println("circle");
        }
    }
}
