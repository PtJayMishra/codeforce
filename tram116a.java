import java.util.Scanner;

public class tram116a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            b= b-a;
            if(b==0)
            System.out.println(b);

        }

    }
}
