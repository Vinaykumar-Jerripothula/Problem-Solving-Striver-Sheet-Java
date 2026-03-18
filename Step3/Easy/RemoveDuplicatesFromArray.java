import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void removeDuplicatesFromArrayTwoPointerApproach(int[] a , int n) {
        
        
    }
 
    public static void removeDuplicatesFromArrayUsingHashSet(int[] a , int n ) {
        Set<Integer> set  = new HashSet<>();
        for(int ele : a) set.add(ele);
        for(var i : set) System.out.print( i + " ");
    } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        // removeDuplicatesFromArrayUsingHashSet(a , n);
        removeDuplicatesFromArrayTwoPointerApproach(a, n);
        sc.close();
    }
}
