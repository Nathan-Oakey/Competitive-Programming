import java.util.Scanner;
import java.util.Stack;

public class Tautology {
    public static boolean eval(String str, boolean p, boolean q, boolean r, boolean s, boolean t) {
    Stack<Boolean> st = new Stack<>();
    for (int i = str.length() - 1; i >= 0; i--) {
        char c = str.charAt(i);
        boolean w; boolean x;

        switch (c) {
            case 'p': st.push(p); break;   
            case 'q': st.push(q); break;             
            case 'r': st.push(r); break;
            case 's': st.push(s); break;
            case 't': st.push(t); break;

            case 'N': 
                st.push(!st.pop()); break; 

            case 'K':
                w = st.pop();
                x = st.pop();
                st.push(w && x); break;

            case 'A':
                w = st.pop();
                x = st.pop();
                st.push(w || x); break;

            case 'C':
                w = st.pop();
                x = st.pop();
                st.push(!w || x); break;

            case 'E':
                w = st.pop();
                x = st.pop();
                st.push(w == x); break;
            }
        }
        return st.pop();
    }

    public static boolean isTautology(String str) {
        boolean[] arr = new boolean[5];

        for (int i = 0; i < 32; i ++) {
            arr[0] = (i & 1) != 0;
            arr[1] = (i & 2) != 0; 
            arr[2] = (i & 4) != 0;
            arr[3] = (i & 8) != 0;
            arr[4] = (i & 16) != 0;

            if (!eval(str, arr[0], arr[1], arr[2], arr[3], arr[4])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equals("0")) {
            if(isTautology(str)) {
                System.out.println("tautology");
            } else {
                System.out.println("not");
            }
            str = sc.nextLine();
        }
    }
}

