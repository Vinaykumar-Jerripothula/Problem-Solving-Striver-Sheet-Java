import java.util.Scanner;

public class ArrayIsSortedOrNot {
 
    public static boolean arraySortedOrNot(int[] a , int n ) {

        int previous = a[0];
        for(int i = 1 ; i  < n ;i++) {
            if(previous <= a[i]) previous = a[i];
            else {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        if(arraySortedOrNot(a , n)) System.out.println("Array is Sorted .");
        else System.out.println("Array is Not Sorted .");
        sc.close();

    }
}