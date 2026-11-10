import java.util.Arrays;
import java.util.Scanner;

public class HotlineBling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);
        
        int Q = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < Q; i++) {
            String regex = sc.nextLine();
            String regexEnd = nextString(regex);

            int l = lowerBound(arr, regex);
            int r = lowerBound(arr, regexEnd);

            System.out.println(r - l);
        }
        
    }

    static int lowerBound(String[] arr, String regex) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + high >>> 1;
            if (arr[mid].compareTo(regex) < 0) {
                low = mid + 1;
            } 
            else {
                high = mid;
            }
        }
        return low;
    }

    static String nextString(String s) {
        return s + '{';
    }
}