

public class MaximumSubArraySum {

    public static void brute(int[] arr) {
        int sum=0,largeSum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                for(int k=i;k<=j;k++) {
                    sum += arr[k];
                   // System.out.print(arr[k] + " ");
                }
                largeSum = Math.max(largeSum,sum);
                sum=0;
                
            }
        }
        System.out.print("LargeSum : " + largeSum);

    }
    public static void better(int[] arr) {
        int largeSum=0,sum=0;
        for(int i=0;i<arr.length;i++) {
            
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                largeSum = Math.max(largeSum, sum);
            }
            
            sum=0;
        }
    }
    public static void optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            if(sum > 0) {
                max = Math.max(max,sum);
            }
            if(sum < 0) sum=0;
        }
        System.out.print("Sum is : " + max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        brute(arr);
        //better(arr);
        //optimal(arr);
    }
}