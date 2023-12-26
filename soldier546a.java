import java.util.Scanner;

public class soldier546a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k= in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

           int b = k*(w*(w+1)/2);
            int c = b-n;
        if (c>0) {

        System.out.println(c);

    }else {
            System.out.println("0");
        }
}}
