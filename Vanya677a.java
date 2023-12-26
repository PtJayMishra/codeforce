import java.util.Scanner;

public class Vanya677a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (h > a) {
                int c = h / 2;
                System.out.println(c + i++);
            }
        }
    }
}
//while (condition){


