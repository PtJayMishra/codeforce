import java.util.Scanner;

public class vasyathe581a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println(b);
            System.out.println((a-b)/2);
        }else if (b>a){
            System.out.println(a);
            System.out.println((b-a)/2);
        }else {
            System.out.println(b);
            System.out.println("0");
        }
    }
}
