import java.util.Scanner;

public class Translation41a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();

      //  String j=   a.replace("s","t");
        String b = in.next();
            StringBuilder sb = new StringBuilder(a);
         String   c = sb.reverse().toString();
            if(b.equals(c)){
                System.out.println("YES");
            }else {
                System.out.println("NO");



}}}
