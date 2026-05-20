
package Step3.Hard;

class MaximumProductSubarray {
    public static int maximumProductSubarray(int[] arr) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= arr[i];
            suffix *= arr[(arr.length-1) - i];
            max = Math.max(max,Math.max(prefix , suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maximumProductSubarray(arr)); 
    }

}