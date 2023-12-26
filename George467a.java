import java.util.Scanner;

public class George467a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int q = in.nextInt();

            if (q - p > 1) {
                c = 1 + c;
            }


        }
        System.out.println(c);
    }
}