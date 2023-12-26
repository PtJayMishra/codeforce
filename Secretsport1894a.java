import java.util.Scanner;

public class Secretsport1894a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i <t ; i++) {
            int n = in.nextInt();
            String s = in.next();
            if(s.charAt(i) == 'A' || s.charAt(i+1) == 'A'){
                a++;
            }else if (s.charAt(i) == 'B' || s.charAt(i+1) == 'A'){
                b++;
            }
        }if(a > b){
            System.out.println("A");
        } else if (b > a){
            System.out.println("B");
        }

    }
}
