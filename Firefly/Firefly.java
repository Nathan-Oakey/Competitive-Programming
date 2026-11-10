// Nathan Oakey

// Ideas: use two arrays to represent the rocks, calculate it once
// n is length, h is height 

import java.util.Scanner;

public class Firefly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] stlg = new int[h]; // bottom
        int[] stlc = new int[h]; // top

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                stlg[sc.nextInt() - 1]++;
            }
            else {
                stlc[h - sc.nextInt()]++;
            }
        }
        
        int topCount = 0;
        int botCount = 0;
        int obs[] = new int[h];
        for (int i = 0; i < h; i++) {
            botCount += stlg[h - i - 1];
            topCount += stlc[i];
            obs[i] += topCount;
            obs[h - i - 1] += botCount;
        }

        int min = n;
        int minOccur = 0;
        for (int i = 0; i < h; i++ ) {
            if (obs[i] < min) {
                min = obs[i];
                minOccur = 1;
            }
            else if (obs[i] == min) {
                minOccur++;
            }
        }

        System.out.println(min + " " + minOccur);

        
    }   
}
