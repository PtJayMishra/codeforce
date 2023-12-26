import java.util.Scanner;

public class Bit282a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            String operator= in.next();
            if(operator.contains("++")){
                x += 1;
            }else if(operator.contains("--")){
                x-= 1;
            }


        }
        System.out.println(x);
    }
}
