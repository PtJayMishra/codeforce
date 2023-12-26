import java.util.Scanner;

public class rook {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
        for (int j = 0; j < t; j++) {
                String str=sc.next();
                for(int i=1;i<=8;i++){
                    if(i!=(str.charAt(1)-'0'))
                        System.out.println(str.charAt(0)+""+i);
                }
                for(char i='a';i<='h';i++){
                    if(i!=str.charAt(0))
                        System.out.println(i+""+str.charAt(1));
                }
            }
    }
}

