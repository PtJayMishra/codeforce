import java.util.Scanner;

public class nextround {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int j = 0;
         int[] a = new int[n];
        for (int i = 0; i < n; i++) {
             a[i] = in.nextInt();

        }int x=a[k-1];
        for(int i=0;i<n;i++){
            if(a[i]>0&&a[i]>=x)
                j++;
        }
        System.out.println(j++);

    }
}
