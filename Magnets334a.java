import java.util.Scanner;

public class Magnets334a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=1;
        int w=sc.nextInt();
        while (n-->1){
            int q=sc.nextInt();
            if (q!=w) {
                c++;
                w=q;
            }
        }
        System.out.println(c);
    }
}
