import java.util.Scanner;

public class JAGGEDSWAPS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
            }
            if (arr[0] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}