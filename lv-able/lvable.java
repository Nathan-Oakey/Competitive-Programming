import java.util.Scanner;

public class lvable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = sc.nextLine().toLowerCase();

        if (line.contains("lv")) {
            System.out.println("0");
        } 
        else if (line.contains("l") || line.contains("v")) {
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
    }
}
