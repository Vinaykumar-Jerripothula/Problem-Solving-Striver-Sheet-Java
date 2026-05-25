
package step3.medium;
import java.util.Arrays;

public class NextPermutation {

    public static int[] nextPermutation(int[] arr) {
        int index = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            return reverse(arr , 0 , arr.length -1);
        }
        for(int i = n-1;i>index;i--) {
            if(arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        return reverse(arr , index + 1 , arr.length -1);


    }
    
    public static int[] reverse(int[] arr, int start , int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(nextPermutation(new int[]{1,2,3})));
    }
}
