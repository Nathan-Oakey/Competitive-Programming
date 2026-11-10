import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeSpeak {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] message = br.readLine().split(" ");
        StringBuilder encodedMessage = new StringBuilder();
        int count = 0;
        for (String word : message) {
            boolean last = false;
            for (char letter : word.toCharArray()) {
                boolean vowel = "aeiou".indexOf(letter) != -1;
                if (vowel && !last) {
                    encodedMessage.append("ib");
                }
                encodedMessage.append(letter);

                last = vowel;
            }
            count++;
            if (count != n) {encodedMessage.append(" ");}
        }
        System.out.println(encodedMessage);
    }
}
