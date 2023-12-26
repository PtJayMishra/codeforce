import java.util.Scanner;

public class luckydivision122a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  s = in.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i <s.length() ; i++) {


            if(s.charAt(i) == '4' && s.charAt(i+1) == '7'){
                c++;
            }else if (s.charAt(i) =='4' && s.charAt(i+1)== '4' ) {
                a++;

            }else if (s.charAt(i) == '7' && s.charAt(i+1) == '7'){
                b++;
            }

        }if(c++ > 1){
            System.out.println("YES");
        } else if (a++ > 1) {
            System.out.println("YES");
        } else if (b++ > 1) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
