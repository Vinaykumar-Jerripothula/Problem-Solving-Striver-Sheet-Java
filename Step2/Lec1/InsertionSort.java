package Step2.Lec1;
import java.util.*;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        // n-1 , till last element
        
        for(int i = 0 ; i < arr.length; i++) {
           
            int j = i ;
        // starts changing from j position to 0 
             while( j > 0 && arr[j-1] > arr[j]  ) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
             }
        }
        // Printing Soted Array Elements
        System.out.print("After Merge Sort  : ");
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print( arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.print("Enter the elements : ");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        sc.close();

    }

}
