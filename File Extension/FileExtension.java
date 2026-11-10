import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\.");
        System.out.println("." + arr[arr.length - 1]);
    }
}