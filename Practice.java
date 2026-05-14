
    public class Practice {
        
       
        public static void main(String[] args) {
            int[] arr = {10,5,2,7,1,9};
            int k=15,i=0,sum=0,largeSum=0;
            for(int j=0;j<arr.length;j++) {
                sum += arr[j];
                while(sum > k) {
                    sum -= arr[i];
                    i++;
                }
                largeSum = Math.max(largeSum,sum);
            }
            
            System.out.println("LargeSum : " + largeSum);
            /* System.out.print("Elements : ");
            for (int i : arr) {
                System.out.print(i + " ");
            } */
        }
    }
