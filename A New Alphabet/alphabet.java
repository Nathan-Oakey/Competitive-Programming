import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            if (ch == 'a') {
                sb.append("@");
            }
            else if (ch == 'b') {
                sb.append("8");
            }
            else if (ch == 'c') {
                sb.append("(");
            }
            else if (ch == 'd') {
                sb.append("|)");
            }
            else if (ch == 'e') {
                sb.append("3");
            }
            else if (ch == 'f') {
                sb.append("#");
            }
            else if (ch == 'g') {
                sb.append("6");
            }
            else if (ch == 'h') {
                sb.append("[-]");
            }
            else if (ch == 'i') {
                sb.append("|");
            }
            else if (ch == 'j') {
                sb.append("_|");
            }
            else if (ch == 'k') {
                sb.append("|<");
            }
            else if (ch == 'l') {
                sb.append("1");
            }
            else if (ch == 'm') {
                sb.append("[]\\/[]");
            }
            else if (ch == 'n') {
                sb.append("[]\\[]");
            }
            else if (ch == 'o') {
                sb.append("0");
            }
            else if (ch == 'p') {
                sb.append("|D");
            }
            else if (ch == 'q') {
                sb.append("(,)");
            }
            else if (ch == 'r') {
                sb.append("|Z");
            }
            else if (ch == 's') {
                sb.append("$");
            }
            else if (ch == 't') {
                sb.append("']['");
            }
            else if (ch == 'u') {
                sb.append("|_|");
            }
            else if (ch == 'v') {
                sb.append("\\/");
            }
            else if (ch == 'w') {
                sb.append("\\/\\/");
            }
            else if (ch == 'x') {
                sb.append("}{");
            }
            else if (ch == 'y') {
                sb.append("`/");
            }
            else if (ch == 'z') {
                sb.append("2");
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
        
        
}