package techniques.prefixAndSuffix;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int  n = arr.length-1;
        int[] preFixSum = new int[n];
        for(int i = 1 ; i < 6; i++) {
            preFixSum[i] = preFixSum[i-1] + arr[i];
        }
        for(int temp : preFixSum) {
            System.out.print(temp);
        }
    }
}
