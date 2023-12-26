import java.util.Arrays;
import java.util.Scanner;

public class LineTrip1901a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int x = in.nextInt();

            int [] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
              //  System.out.println(Arrays.toString(arr));
        //       System.out.println(arr[n]);
                if(arr[arr.length-1] == x){
                    System.out.println(x);
                } else if (arr[arr.length - 1] > x) {
                    System.out.println(x);
                } else if ((arr[arr.length - 1 ] - arr[arr.length-2]) > (x - arr[arr.length-1])){
                        System.out.println(2 * (arr[arr.length - 1] - arr[arr.length - 2]));

                } else if ((arr[arr.length - 1 ] - arr[arr.length-2]) < (x - arr[arr.length-1])) {
                    System.out.println(2* (x - arr[arr.length-1]));

                }

            }
            }
    }
}
