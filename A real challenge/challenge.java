import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new BigDecimal(sc.nextLong()).sqrt(new MathContext(10)).multiply(new BigDecimal(4)).stripTrailingZeros());
    }
}
