import java.util.Scanner;
import java.math.BigInteger;

public class ThisSeemsTooEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger e = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());

        BigInteger val = a.modPow(e, m);
        System.out.println(val);

        
    }
}