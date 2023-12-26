import java.util.Scanner;

public class young69a{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b =  0;
        int c =  0;

        for (int i = 0; i < n; i++) {

            a += in.nextInt();
            b += in.nextInt();
            c += in.nextInt();


        }  if (a == 0 && b == 0 && c == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }}

