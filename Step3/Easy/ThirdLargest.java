import java.util.Scanner;

public class ThirdLargest {

    public static void thirdLargest(int[] a , int n ) {
        int max = a[0] , secMax = Integer.MIN_VALUE , thirdMax = Integer.MIN_VALUE;
        for(int i = 0;i < n ; i++) {
            if(a[i] > max) {
                    thirdMax = secMax;
                    secMax = max;
                    max = a[i];
            }
            else if(a[i] > secMax && a[i] != max) {
                thirdMax = secMax;
                secMax = a[i];
            }
            else if(a[i] > thirdMax && a[i] != secMax) {
                thirdMax = a[i];
            } 
        }
        System.out.println(" Third Max in Array : " + thirdMax);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        thirdLargest(a,n);
        sc.close();
    }    
}
