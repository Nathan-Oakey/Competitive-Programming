import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        String[][] arr2d = new String[x][y];

        for (int i = 0; i < y; i++) {
            String[] arr = sc.nextLine().split("");
            for (int j = 0; j < x; j++) {
                arr2d[j][i] = arr[j];
            }
        }

        int counter1 = 0;
        int counter2 = 0;
        String secretWord = "";
        while (counter1 < x || counter2 < y) {
            boolean isLetterX = false; 
            boolean isLetterY = false;
            if (!arr2d[counter1][counter2].equals(".")) {
                secretWord += arr2d[counter1][counter2];
                
                
            }

        }
        
        System.out.println(secretWord);
    }
    
    
}