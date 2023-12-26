import java.util.Scanner;

public class amusingjoke {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String m = in.next();
        String l = in.next();
        int a = 0;
        int n = 0;
        for (char i = 0; i < l.length(); i++) {
            if (l.charAt(i) == s.charAt(i)) {
                a++;
            } else {
                for (int j = 0; j < l.length(); j++) {
                    if (l.charAt(j) == s.charAt(i)) {
                        a++;
                    }
                    if (l.charAt(i) == m.charAt(i)) {
                        n++;
                    } else if (l.charAt(j) == l.charAt(i)) {
                        {
                            n++;
                        }
                    }

                }
            }

        } if (a++ == s.length() && n++ == m.length()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
