import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game2048 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int[] arr1 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(str1[i]);
        }
        String[] str2 = br.readLine().split(" ");
        int[] arr2 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr2[i] = Integer.parseInt(str2[i]);
        }
        String[] str3 = br.readLine().split(" ");
        int[] arr3 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr3[i] = Integer.parseInt(str3[i]);
        }
        String[] str4 = br.readLine().split(" ");
        int[] arr4 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr4[i] = Integer.parseInt(str4[i]);
        }

        int x = Integer.parseInt(br.readLine());

        int[][] arr2d = {arr1, arr2, arr3, arr4};

        int[] temp;
        int[] newRC;
        int index;

        // Moving left
        if(x == 0) {
            for (int i = 0; i < 4; i++) {
                temp = new int[4];
                index = 0;
                for (int j = 0; j < 4; j++) {
                    if (arr2d[i][j] != 0) {
                        temp[index++] = arr2d[i][j];
                    }
                }

                for (int j = 0; j < 3; j++) {
                    if (temp[j] != 0 && temp[j] == temp[j + 1]) {
                        temp[j] *= 2;
                        temp[j + 1] = 0;
                    }
                }

                index = 0;
                newRC = new int[4];
                for (int j = 0; j < 4; j++) {
                    if (temp[j] != 0) {
                        newRC[index++] = temp[j];
                    }
                }

                arr2d[i] = newRC;
            }
        }

        // Moving up
        else if(x == 1) {
            for (int i = 0; i < 4; i++) {
                temp = new int[4];
                index = 0;
                for (int j = 0; j < 4; j++) {
                    if (arr2d[j][i] != 0) {
                        temp[index++] = arr2d[j][i];
                    }
                }

                for (int j = 0; j < 3; j++) {
                    if (temp[j] != 0 && temp[j] == temp[j + 1]) {
                        temp[j] *= 2;
                        temp[j + 1] = 0;
                    }
                }

                index = 0;
                newRC = new int[4];
                for (int j = 0; j < 4; j++) {
                    if (temp[j] != 0) {
                        newRC[index++] = temp[j];
                    }
                }

                for (int j = 0; j < 4; j++) {
                    arr2d[j][i] = newRC[j];
                }
            }
        }

        // Moving right
        else if(x == 2) {
            for (int i = 0; i < 4; i++) {
                temp = new int[4];
                index = 3;
                for (int j = 3; j >= 0; j--) {
                    if (arr2d[i][j] != 0) {
                        temp[index--] = arr2d[i][j];
                    }
                }

                for (int j = 3; j > 0; j--) {
                    if (temp[j] != 0 && temp[j] == temp[j - 1]) {
                        temp[j] *= 2;
                        temp[j - 1] = 0;
                    }
                }

                index = 3;
                newRC = new int[4];
                for (int j = 3; j >= 0; j--) {
                    if (temp[j] != 0) {
                        newRC[index--] = temp[j];
                    }
                }

                arr2d[i] = newRC;
            }
        }

        //Moving down
        else {
            for (int i = 0; i < 4; i++) {
                temp = new int[4];
                index = 3;
                for (int j = 3; j >= 0; j--) {
                    if (arr2d[j][i] != 0) {
                        temp[index--] = arr2d[j][i];
                    }
                }

                for (int j = 3; j > 0; j--) {
                    if (temp[j] != 0 && temp[j] == temp[j - 1]) {
                        temp[j] *= 2;
                        temp[j - 1] = 0;
                    }
                }

                index = 3;
                newRC = new int[4];
                for (int j = 3; j >= 0; j--) {
                    if (temp[j] != 0) {
                        newRC[index--] = temp[j];
                    }
                }

                for (int j = 0; j < 4; j++) {
                    arr2d[j][i] = newRC[j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sb.append(arr2d[i][j]).append(" ");

            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}