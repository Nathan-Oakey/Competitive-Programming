// Nathan Oakey

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RaggedRights {

    public static void main(String[] args) throws java.io.IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int size;
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            size = line.length();
            arr.add(size);
            if (size > max) {
                max = size;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = sum + ((max - arr.get(i)) * (max - arr.get(i)));
        }
        
        System.out.println(sum);

        br.close();
    }
}
