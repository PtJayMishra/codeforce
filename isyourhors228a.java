 import java.util.Scanner;
public class isyourhors228a{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        int s4 = in.nextInt();
        int a = 0;
        if(s1 == s2 && s2 == s3&&s3 == s4 && s1==s4) {
            System.out.println("3");
        }else if (s1 == s2 && s2 == s3  &&s3 == s4 && s1!=s4){
            System.out.println("2");
        } else if (s1 == s2 && s2 == s3 && s3 != s4 || s1!=s4) {
            System.out.println("1");
        } else if (s1 == s2 && s2 != s3 && s3 != s4 && s1!=s4) {
            System.out.println("1");
        }else if( s1 == s2){
            System.out.println(a);
        }

    }
}
