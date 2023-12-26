import java.util.Scanner;

public class expression479a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int p = (a+b)*c;
        int q = (a+b) +c;

        int s = a *(b*c);
        int n = a*(b+c);


        if(p>q  && p>s && p>n){
            System.out.println(p);
        }else if(p<q   && q>s && q>n){
            System.out.println(q);


        } else if (s>q  && p<s && s>n) {
            System.out.println(s);

        }else if(n>p && n>q   && n>s) {
            System.out.println(n);
        }

    }
}
