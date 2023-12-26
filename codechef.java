import java.math.BigInteger;
import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int c = 0;
        int h = 0;
        int o= 0;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            for (int j = 0; j <n; j++) {
                String a = in.next();
                String b = in.next();
                for (int k = 0; k <n ; k++) {
                    if(a.charAt(k) == 'R' && b.charAt(k) == 'S'){
                        c = c+1;

                    }else if (a.charAt(k) == 'S' && b.charAt(k) == 'P'){
                        c++;
                    } else if (a.charAt(k) == 'P' && b.charAt(k) == 'R') {
                        c++;

                    }else if (a.compareTo(b) == 1){

                        o++;

                    }else {

                        h++;
                    }
                    if (o==t){
                        System.out.println("1");
                    }else if(c-c<0){
                        System.out.println("0");
                    }else {
                        int g =(c-c)/2 + 1;
                        System.out.println( g);
                    }



                }

            }
        }
    }}








