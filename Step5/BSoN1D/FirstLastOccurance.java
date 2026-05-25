package step5.bSoN1D;

public class FirstLastOccurance {

    public static int firstOccurance(int[] arr, int key) {
        int l = 0, h = arr.length - 1;
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                ans = mid;
                h = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurance(int[] arr, int key) {
        int l = 0, h = arr.length - 1;
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5 };
        int key = 4;
        System.out.println("First Occurance : " + firstOccurance(arr, key));
        System.out.println("Last Occurance : " + lastOccurance(arr, key));

        /*
         * System.out.print("Elements : ");
         * for (int i : arr) {
         * System.out.print(i + " ");
         * }
         */
    }
}
