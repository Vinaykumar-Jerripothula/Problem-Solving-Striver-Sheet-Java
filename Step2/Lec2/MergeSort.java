package Step2.Lec2;

import java.util.ArrayList;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=0;i<temp.size();i++) {
            arr[low + i] = temp.get(i);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 5, 3 ,9,3};

        mergeSort(arr, 0, arr.length - 1);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
