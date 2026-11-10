import java.util.HashSet;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashSet<String> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            String name = sc.nextLine();
            char f = name.charAt(0);
            name = name.substring(2);
            if (f == '+') {
                hs.add(name);
            } else if(f == '-') {
                hs.remove(name);
            } else {
                if (hs.contains(name)) {
                    sb.append("Jebb").append("\n");
                } else {
                    sb.append("Neibb").append("\n");
                }
            }


        }

        System.out.println(sb.toString());
    }
}
