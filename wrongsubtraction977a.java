
import java.util.Scanner;

public class wrongsubtraction977a {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n = n - 1;

            } else {
                n = n / 10;

            }
        }
        System.out.println(n);
    }
}
//        if(n%10==0){
//            for (int i = 0; i <k ; i++) {
//
//                System.out.println(n / 10);
//            }
//        }else{
//            for (int i = 0; i < k; i++) {
//            System.out.println(n-1);
//        }
//import java.util.Scanner;
//public class Subtraction
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n,k;
//        n=sc.nextInt();
//        k=sc.nextInt();
//        for(int i=0;i<k;i++)
//        {
//            if(n%10==0)
//                n=n/10;
//            else
//                n=n-1;
//        }
//        System.out.println(n);
//    }
//}

