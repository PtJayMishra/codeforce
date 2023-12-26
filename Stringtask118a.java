import java.util.Scanner;

public class Stringtask118a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
          s = s.replaceAll("a , e ,i, o ,u", "");
        for (int i = 0; i <s.length() ; i++) {
             char j = s.charAt(i);
        }  s  = s.toLowerCase();

        System.out.println(s);

    }
}
