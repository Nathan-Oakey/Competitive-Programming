import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.nextLine();

        int s = Integer.parseInt(sc.nextLine());

        int[][] nums = new int[x][y];

        for (int i = 0; i < x; i++) {
            String str = sc.nextLine();
            String[] strings = str.split(" ");
            for (int j = 0; j < y; j++) {
                nums[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int count = 0;
        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                if (nums[i][j] == s) {
                    int num1 = nums[i - 1][j - 1];
                    int num2 = nums[i - 1][j + 1];
                    int num3 = nums[i + 1][j - 1];
                    int num4 = nums[i + 1][j + 1];
                    if ((num1 + num2 + num3 + num4) % s == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}