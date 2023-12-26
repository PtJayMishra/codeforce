//import java.util.Scanner;
//
//public class elephant617a {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();
//        {
//             {
//               int z = i / 5;
//               int k = i / 4;
//               int l = i / 3;
//               int m = i/2;
//               int n = i/1;
//               if (i%5 ==0) {
//                   System.out.println(z);
//               } else {
//                   if (i% 4 == 0) {
//                       System.out.println( z+ k);
//                   } else {
//                       if (i%3==0) {
//                           System.out.println(z+k+l);
//                       } else {
//                           if (i%2==0){
//                               System.out.println(z+k+l +m);
//                           } else{
//                               if(i%1==0){
//                                   System.out.println(z+l+k+m+n);
//                               }
//
//                           }
//                       }
//
//                   }
//               }
//
//           }
//
//       }
//    }
//}
import java.util.Scanner;

public class elephant617a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();


            if (i <5) {

                System.out.println(1);

            }else if(i > 5 && i%5 != 0)  {
                System.out.println(i/5+1);
                }else {
                System.out.println(i/5);


            }


        }
    }









