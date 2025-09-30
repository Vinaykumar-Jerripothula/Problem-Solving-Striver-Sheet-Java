package Step3.Easy;
import java.util.Scanner;

public class SecondLargest {
    
    public static void secondLargestInArray(int[] a , int n ) {
        int max = Integer.MIN_VALUE , secMax = Integer.MIN_VALUE;
        for(int i = 0 ; i  < n ; i++) {
            if(a[i] > max) {
                secMax = max;
                max = a[i];
            } else if(a[i] > secMax && a[i] != max ) {
                secMax = a[i];
            }
           
        }
         System.out.print(" Second Largest is : " + secMax);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        System.out.print("Enter Elements : ");
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        secondLargestInArray(a,n);
        sc.close();
    }
}
