
import java.util.ArrayList;

public class CountInversions {
    public static void merge(int[] arr , int low , int mid , int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            }
            else {
                al.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while(right <= high) {
            al.add(arr[right]);
            right++;
        }
        for(int i = 0 ; i < al.size() ; i++) {
            arr[low + i] = al.get(i);
        }
    }
    public static int countInversions(int[] arr , int low , int mid , int high) {
        int cnt = 0 ;
        int left = low;
        int right = mid+1;
        for(int i = left; i<=mid;i++) {
            while(right <= high && arr[i] > arr[right]) {
                right++;
            }
            cnt += (right - (mid+1));
        }
        return cnt;
    }
    public static int mergeSort(int[] arr ,int low , int high ){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = low + (high - low)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr,mid + 1, high);
        cnt += countInversions(arr , low , mid , high);
        merge(arr , low , mid , high);
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,3};
        int cnt = mergeSort(arr , 0 , arr.length-1);
        System.out.print(cnt);
    }
}
