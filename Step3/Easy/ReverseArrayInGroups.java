import java.util.Scanner;

public class ReverseArrayInGroups {

    public static void reverseArrayInGroups(int[] a , int k) {
        int l = 0 , h = 0 ;
        for(int i = 0 ; i < a.length ; i+=k) {
            l = i ;
            h = i+k-1 < a.length-1 ? i+k-1 : a.length-1;
            while(l<h) {
                int temp = a[l];
                a[l] = a[h];
                a[h] = temp;
                l++;
                h--;
            }
        }
        System.out.print( "Rotated Array : ");
        for(int i : a) {
            System.out.print( i + " ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Array Size : ");
        int n = sc.nextInt();
        System.out.print( "Enter Array Elements : ");
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print( " Enter K value : ");
        int k = sc.nextInt();
        reverseArrayInGroups(a,k);
        sc.close();        
    }
}