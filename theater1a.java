import java.util.Scanner;

public class theater1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
        long c = 0;
        long d = 0;
        if(n%a ==0){
            c = n/a;
        }else {
            c = (n/a)+1;
        }if(m%a==0){
            d = m/a;
        }else {
            d =(m/a)+1;
        }
        System.out.println(c*d);
    }
}
