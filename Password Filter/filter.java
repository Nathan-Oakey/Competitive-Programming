import java.util.Scanner;

public class filter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.matches(".*[a-zA-Z].*") && word.matches(".*\\d.*")) {
                StringBuilder temp = new StringBuilder();
                for (char ch : word.toCharArray()) {
                    temp.append("*");
                }
                word = temp.toString();
            }
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString());
    }
}