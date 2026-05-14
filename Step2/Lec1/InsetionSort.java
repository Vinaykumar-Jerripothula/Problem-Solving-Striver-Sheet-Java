

import java.util.Scanner;

public class InsetionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2,1,4,3,5};
        int j=0,temp=0;
        for(int i=1;i<arr.length;i++) {
            j=i;
            while(j>0 && arr[j-1] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.print("Elements After Insertion Sort : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
