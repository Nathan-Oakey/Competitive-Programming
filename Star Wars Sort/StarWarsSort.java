// Nathan Oakey

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StarWarsSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String m = br.readLine();
        int n = Integer.parseInt(m);
        String toSort = br.readLine();
        String[] toSortList = toSort.split(" ");

        int[] intList = new int[n];
        for (int i = 0; i < n; i++) {
            intList[i] = Integer.parseInt(toSortList[i]);
        }

        sort(intList, 0, intList.length - 1);

        for (int i = 0; i < n; i++) {
            if (i < n / 3) {
                System.out.print(intList[n / 3 + i] + " ");
            } else if (i < 2 * n / 3) {
                System.out.print(intList[i - n / 3] + " ");
            } else {
                System.out.print(intList[i] + " ");
            }
        }
    }

    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


