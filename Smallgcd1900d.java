import java.util.Arrays;
import java.util.Scanner;

public class Smallgcd1900d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {


            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a%2==b%2&& a%2==c%2&& b%2==c%2){
                System.out.println( "1 1 1");
            }else if (a%2==b%2){
                System.out.println("0"+ "0"+ "1");
            }else if(a%2==c%2){
                System.out.println("0"+ "1"+ "0");
            }else if ( b%2==c%2){
                System.out.println("1"+ "0"+ "0");
            }else {
                System.out.println("0"+ "0"+ "0");
            }



            }




        }
    }

//                if(a[0]%2==0 &&a[1]%2==0&&a[2]%2==0){
//                    System.out.println("1"+"" +"1"+ "1");
//                }else if (a[0]%2==0 && a[1]%2==0){
//                    System.out.println("0"+ "0"+ "1");
//                }else if(a[0]%2==0&&a[2]%2==0){
//                    System.out.println("0"+ "1"+ "0");
//                }else if (a[1]%2==0&&a[2]%2==0){
//                    System.out.println("1"+ "0"+ "0");
//                }else {
//                    System.out.println("0"+ "0"+ "0");
//                }