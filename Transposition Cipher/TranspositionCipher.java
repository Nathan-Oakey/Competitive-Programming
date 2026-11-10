// Nathan Oakey

import java.util.Scanner;

public class TranspositionCipher {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String key = sc.nextLine();
        while (!key.equals("0")){
            int n = Integer.parseInt(key);
            String line = sc.nextLine();
            line = line.toUpperCase(); line = line.replace(" ", "");
            char[] message = new char[line.length()];
            int pos = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < line.length(); j += n) {
                    message[j] = line.charAt(pos++);
                }
            }
            sb.append(new String(message)).append("\n");
            key = sc.nextLine();
        }
        System.out.println(sb.toString());
    }
}