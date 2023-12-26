import java.util.Scanner;
public class nearlyluckynumber110a{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
         String s = in.next();

        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i)== '4' || s.charAt(i) == '7'){
                 c++;
            }}
            if (c ==7 || c==4) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }

    }


