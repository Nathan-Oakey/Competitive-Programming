import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
       
public class library {

    public static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getTitle(){
            return this.title;
        }
    }

    static void merge(Book arr[], int l, int m, int r){
        
        int n1 = m - l + 1;
        int n2 = r - m;

        Book L[] = new Book[n1];
        Book R[] = new Book[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getAuthor().compareTo(R[j].getAuthor()) < 0) {
                arr[k] = L[i];
                i++;
            }
            else if (L[i].getAuthor().compareTo(R[j].getAuthor()) > 0) {
                arr[k] = R[j];
                j++;
            } else {
                if (L[i].getTitle().compareTo(R[j].getTitle()) <= 0) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
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

    static void mergeSort(Book arr[], int l, int r){
        
        if (l < r) {

            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int numBook = Integer.parseInt(arr[0]);
        int numQ = Integer.parseInt(arr[1]);

        Book[] books = new Book[numBook];

        for (int i = 0; i < numBook; i++) {
            String[] arr2 = br.readLine().split(", ");
            books[i] = new Book(arr2[0], arr2[1]);
        }

        mergeSort(books, 0, books.length - 1);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numBook; i++) {
        map.put(books[i].getTitle(), i + 1);
        }

        for (int i = 0; i < numQ; i++) {
            String str = br.readLine();
            System.out.println(map.getOrDefault(str, -1));
        }   
    }
}
