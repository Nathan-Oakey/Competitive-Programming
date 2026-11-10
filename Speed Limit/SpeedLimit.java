import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        while (num != -1) {
            
            int time = 0;
            int sum = 0;
            for (int i = 0; i < num; i++){
                int speed = sc.nextInt();
                int newtime = sc.nextInt();
                sum += (newtime - time) * speed;
                time = newtime;
            }

            System.out.println(sum + " miles");

            num = sc.nextInt();
        }
        

    }
}
