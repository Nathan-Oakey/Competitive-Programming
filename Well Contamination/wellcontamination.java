import java.util.Scanner;

public class wellcontamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        sc.nextLine(); 

        char[][] town = new char[r][c];
        
        
        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < c; j++) {
                town[i][j] = line.charAt(j);
            }
        }

        int[] icoords = {-1, 1, 0, 0};
        int[] jcoords = {0, 0, -1, 1};
        int cont = 0;
        boolean contaminated;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (town[i][j] == 'W') {
                    contaminated = false;
                    for (int k = 0; k < 4; k++) {
                        int ii = i + icoords[k];
                        int jj = j + jcoords[k];

                        if (ii >= 0 && ii < r && jj >= 0 && jj < c && town[ii][jj] == 'O') {contaminated = true;}
                    }
                if (contaminated == true) {cont++;}
                }
            }
        }
        System.out.println(cont);    
    }
}