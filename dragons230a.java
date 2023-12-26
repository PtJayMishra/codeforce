//import java.util.Scanner;
//
//public class dragons230a {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int s = in.nextInt();
//        int n = in.nextInt();
//        while(n-->0){
//            int x= in.nextInt();
//            int y = in.nextInt();
//            if(s>=x){
//                int h = x+y;
//
//                System.out.println("YES");
//
//                break;
//            }else {
//                System.out.println("NO");
//            }
//        }
//    }
//}
import java.util.Scanner;
        import java.util.Arrays;
        import java.util.Comparator;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}

class ArrayOfPairsSorter {
    static void sort(Pair[] arr) {
        Comparator<Pair> comparator = new Comparator<>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.x - p2.x;
            }
        };
        Arrays.sort(arr, comparator);
    }
}

public class dragons230a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean t = true;
        int s = in.nextInt();
        int n = in.nextInt();
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i] = new Pair(x, y);
        }

        ArrayOfPairsSorter.sort(arr);

        for (int i = 0; i < n; i++) {
            if (s >= arr[i].x) {
                s += arr[i].y;
            } else {
                t = false;
                break;
            }
        }

        if (t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}