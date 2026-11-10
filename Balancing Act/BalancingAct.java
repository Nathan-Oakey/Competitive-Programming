import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancingAct {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int l = Integer.parseInt(br.readLine());
        String password = br.readLine();

        if (l % 2 == 1) {System.out.println("NO");}
        else {
            char[] tokens = password.toCharArray();
            int minOpen = 0;
            int maxOpen = 0;
            for (char token : tokens) {
                if (token == '(') {minOpen++; maxOpen++;}
                if (token == ')') {minOpen--; maxOpen--;}
                if (token == '*') {
                    minOpen--; maxOpen++;
                }

                if (maxOpen < 0) {
                System.out.println("NO");
                return;
                }

                minOpen = Math.max(0, minOpen);
            }
            
            if (minOpen == 0) {System.out.println("YES");} else {System.out.println("NO");}
        }
    }
}
