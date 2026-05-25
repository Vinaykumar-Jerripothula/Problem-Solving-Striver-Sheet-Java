package step2.lec1;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for(int i = 0 ; i < arr.length-1 ; i++) {
            int min = i;
            for(int j = i+1 ; j < arr.length ; j++) {
                
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
        
        selectionSort(new int[]{1,4,3,2,5});
        
    }
}
