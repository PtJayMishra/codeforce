import java.util.Scanner;

public class softdrink {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();
        int a = (Math.min( (k*l)/nl,Math.min(c*d , p/np) ))/n;
        System.out.println(a);

}
}
