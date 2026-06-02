

    /*  Strivers ,  Two Pointers Playlist  */

    /* ============================================================= */

    /* Types of Problems In Two Pointers */

    // 1. Constant Window

    // 2. Longest SubArray/Substring where < Condition >
    
    // 3. Number of SubArrays/Substrings Where < Condition > 
    
    // 4. Shortest/Minimum Window Where < Condition >

    /* ============================================================= */

    /* 1. Maximum Points You can get From K Cards */
    
    /* class TwoPointersPlayList {

        public static void maxPointsYouCanGetFromKCards() {
            int[] arr = {6,2,3,4,7,2,1,7,1};
            int k = 4;
            int maxSum = Integer.MIN_VALUE , sum = 0;
            for(int i =0;i<k;i++) {
                sum += arr[i];
            }
            maxSum = sum;
            int rsum = 0;
            int r = arr.length - 1;
            for(int i = k-1; i >=0 ; i--) {
                rsum += arr[r];
                r--;
                sum -= arr[i];
                maxSum = Math.max(maxSum , rsum + sum);
            }
            System.out.println("Max Sum : " + maxSum);
        }
        
        public static void longestSubstringWithoutRepeatingCharacters() {

        }

        public static void main(String[] args) {

            maxPointsYouCanGetFromKCards();

        }

    } */

    /* ============================================================= */

    /* 2.Longest Substring Without Repeating Character  */
    
    // import java.util.Arrays;

    // public class TwoPointersPlayList {
    //     public static void longestSubstringWithoutRepeatingCharacters() {
    //         String str = "cabdzabcd";
    //         int[] hash = new int[256];
    //         Arrays.fill(hash , -1);
    //         int l=0,r=0;
    //         int maxLen = 0;
    //         int n = str.length();
    //         while(r < n) {
    //             if(hash[str.charAt((r))] != -1) {
    //                 if(hash[str.charAt(r)] >= l) {
    //                     l = hash[str.charAt(r)] + 1;
    //                 }
    //             }
    //             maxLen = Math.max(maxLen, r-l+1);
    //             hash[str.charAt(r)] = r;
    //             r++;
    //         }
    //         System.out.println("Max Length is : " + maxLen);
    //     }
    //     public static void main(String[] args) {
    //         longestSubstringWithoutRepeatingCharacters();
    //     }
    // }

    /*
        Time Complexity : 
        Space Complexity :  
     */


    /* ============================================================= */

    /* 3 . Max Consecutive Ones's 3 */

    // class TwoPointersPlayList {
    //     public static void bruteForceSolution() {
    //         int[] a = {1,1,1,0,0,0,1,1,1,1,0};
    //         int k=2;
    //         int cnt=0;
    //         int maxOnes=0;
    //         for(int i=0;i<a.length;i++) {
    //             for(int j=i;j<a.length;j++) {
    //                 for(int m=i;m<=j;m++) {
    //                     if(a[m] == 0) cnt++;
    //                 }
    //                 if(cnt <= k) maxOnes = Math.max(maxOnes , j-i+1);
    //                 cnt=0;
    //             }
    //         }
    //         System.out.print("MaxOnes are : " + maxOnes);

    //         /*
    //             Time Complexity : 

    //             Space Complexity :  

    //         */
        
    //     }

    //     public static void betterSolution() {
    //         int[] a = {1,1,1,0,0,0,1,1,1,1,0};
    //         int k=2;
    //         int l=0;
    //         int r=0;
    //         int cnt=0;
    //         int maxOnes=0;
    //         while(r < a.length) {
    //             if(a[r] == 0) cnt++;
    //             while(cnt > k) {
    //                 if(a[l] == 0) cnt--;
    //                 l++;
    //             }
    //             if(cnt <= k) maxOnes = Math.max(maxOnes ,r-l+1);
    //             r++;
    //         }
    //         System.out.print("MaxOne's : " + maxOnes);
    //     }

    //     public static void optimalSolution() {
    //         int[] a = {1,1,1,0,0,0,1,1,1,1,0};
    //         int k=2;
    //         int l=0,r=0;
    //         int cnt=0;
    //         int maxOnes=0;
    //         while(r<a.length) {
    //             if(a[r] == 0) cnt++;
    //             if(cnt > k) {
    //                 if(a[l] == 0 ) cnt--;
    //                 l++;
    //             } 
    //             if(cnt <= k) maxOnes = Math.max(maxOnes , r-l+1);
    //             r++;
    //         }
    //         System.out.print("MaxOne's : " + maxOnes);

    //         /*
    //             Time Complexity : 

    //             Space Complexity :  
                
    //         */
    //     }
    //     public static void main(String[] args){

    //         // Brute Force Approach
    //         // bruteForceSolution();

    //         // Better Apporach 
    //         betterSolution();

    //         // Optimal Approach
    //         // optimalSolution(); 
    //     }
    // }


    /*
        Time Complexity : 
        Space Complexity :  
    */


    /* ============================================================= */