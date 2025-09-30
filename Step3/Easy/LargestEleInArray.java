package Step3.Easy;
import java.util.Scanner;

public class LargestEleInArray {

    public static void largestEleInArray(int[] a , int n )  {
        int max = a[0];
        for(int i = 1 ; i < n ; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("Maximum in Array : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Elements : " );
        for(int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }        
        largestEleInArray(a , n);

        sc.close();
    }
}
