import java.util.Scanner;

public class lol1912l {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ss = in.next();
        int m= 0;
        int l = 0;
        if (ss.charAt(0) == 'L'){
            if (ss.contains("L")){
                m++;
            }
        }else {
            if (ss.contains("O")){
                l++;
            }
        }
    }
}
