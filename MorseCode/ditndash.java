import java.util.Scanner;

public class ditndash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        char[] message = sc.nextLine().toCharArray();
        int time = 0;

        for (int i = 0; i < message.length; i++) {
            if (message[i] == '0') {time += 19;}
            if (message[i] == '1') {time += 17;}
            if (message[i] == '2') {time += 15;}
            if (message[i] == '3') {time += 13;}
            if (message[i] == '4') {time += 11;}
            if (message[i] == '5') {time += 9;}
            if (message[i] == '6') {time += 11;}
            if (message[i] == '7') {time += 13;}
            if (message[i] == '8') {time += 15;}
            if (message[i] == '9') {time += 17;}
            if (message[i] == ' ') {time += 7;}
            else if (i < message.length - 1 && message[i + 1] != ' ') {time += 3;}
        }
        System.out.println(time);
    }
}