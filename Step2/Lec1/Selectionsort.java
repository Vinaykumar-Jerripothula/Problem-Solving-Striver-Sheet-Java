
import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for(int i = 0 ; i < arr.length-2 ; i++) {
            int min = i;
            for(int j = i ; j <= arr.length-1 ; j++) {
                if(arr[j] < arr[min] ) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.print("Sorted Array using Selection Sort : ");
        for(int i = 0 ;i < arr.length; i++ ) {
            System.out.print(arr[i] + " " );
        }
    }
    public static void main( String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No.of Elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + size + " Elements : ");
        for(int i = 0  ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        sc.close();
    }
}
