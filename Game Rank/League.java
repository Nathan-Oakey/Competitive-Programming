import java.util.Scanner;

public class League {

    public static int numStars(int rank) {
        int numStars;
        if (rank <= 25 && rank > 20) {
            numStars = 2;
        } else if (rank <= 20 && rank > 15) {
            numStars = 3;
        } else if (rank <=15 && rank > 10) {
            numStars = 4;
        } else {
            numStars = 5;
        }

        return numStars;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stats = sc.nextLine();

        int rank = 25;
        int stars = 0;
        int streak = 0;

        for (char c : stats.toCharArray()) {
            if (c == 'W') {
                streak++;
                stars++;
                if (rank != 0) {
                    if (streak >= 3 && rank >= 6) {
                        stars++;
                    }
                    if (stars > numStars(rank)) {
                        stars -= numStars(rank);
                        rank--;
                    }           
                }
            }
            else {
                streak = 0;
                if (rank <= 20 && rank != 0) {
                    if (stars > 0) {
                        stars--;
                    } else if (rank < 20) {
                        rank++;
                        stars = numStars(rank) - 1;
                    }  
                    else {
                        stars = 0;
                    }
                }
            }            
        }
        if (rank == 0) {
             System.out.println("Legend");
        } else {
            System.out.println(rank);
        }
    }
}