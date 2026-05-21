
package Step3.Medium;

import java.util.Arrays;

class QuickSort {
    public static int findPivot(int[] arr , int low , int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(arr[i] <= pivot && i<= high-1){
                i++;
            } 
            while(arr[j] > pivot && j >= low+1) {
                j--;
            } 
            if(i < j ) swap(arr , i , j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickSort(int[] arr , int low , int high) {
        if(low < high) {
            int pivotIndex = findPivot(arr , low , high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}