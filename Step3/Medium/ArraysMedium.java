


    /* ========================================================================= */

    /* 1.Two Sum */

    // import java.util.HashMap;

    // class ArraysMedium {
    //     public static void main(String[] args) {
    //         int[] a = {2,7,11,15};
    //         int target = 9;
    //         HashMap<Integer,Integer> map = new HashMap<>();
    //         for(int i=0;i<a.length;i++) {
    //             if(map.containsKey(target - a[i])) {
    //                 System.out.print("The Two Indices are : " + map.get(target - a[i]) + "," +  i);
    //                 break;
    //             }
    //             map.put(a[i],i);
    //         }
    //     }
    // }

    /*
        Time Complexity : O(n)
        Spcae Complexity :  O(n)
    */

    /* ========================================================================= */

    /* 2.Sort Colors */

    // class ArraysMedium {
    //     public static void swap(int[] arr , int i , int j) {
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //     }
    //     public static void optimalSolution() {
    //         int[] a = {2,0,2,1,1,0};
    //         int low = 0;
    //         int mid = 0;
    //         int high = a.length-1;
    //         while(mid <= high) {
    //             if(a[mid] == 0) {
    //                 swap(a,low,mid);
    //                 low++;
    //                 mid++;
    //             }
    //             else if(a[mid] == 1) {
    //                 mid++;
    //             } 
    //             else {
    //                 swap(a,mid,high);
    //                 high--;
    //             }
    //         }
    //         System.out.print("After Sorting : ");
    //         for(int i : a) System.out.print(i + " ");
    //     }
    //     public static void betterSolution() {
    //         int[] a = {2,0,2,1,1,0};
    //         int cnt1=0;
    //         int cnt2=0;
    //         int cnt3=0;
    //         for(int i : a) {
    //             if(i == 0) cnt1++;
    //             else if(i == 1) cnt2++;
    //             else cnt3++;
    //         }
    //         for(int i=0;i<cnt1;i++) a[i] = 0;
    //         for(int i=cnt1;i<cnt1+cnt2;i++) a[i] = 1;
    //         for(int i=cnt1+cnt2;i<cnt1+cnt2+cnt3;i++) a[i] = 2;
    //         System.out.print("After Sorting : ");
    //         for(int i : a) System.out.print(i + " ");
    //     }
    //     public static void main(String[] args) {
            
    //         // Brute Force
    //         //bruteForceSolution();

    //         // Better Solution
    //         // betterSolution();

    //         // Optimal Solution
    //         // optimalSolution();
    //     }
    // }


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 3.Majority Element - 1 */

    // import java.util.HashMap;

    // class ArraysMedium {
        
    //     public static void bruteForceSolution() {
    //         int[] a = {2,2,1,1,1,2,2}; 
    //         int min = a.length/2;
    //         int cnt=0;
    //         for(int i=0;i<a.length;i++) {
    //             cnt=0;
    //             for(int j=0;j<a.length;j++) {
    //                 if(a[j] == a[i]) cnt++;
    //             }
    //             if(cnt > min) {
    //                 System.out.print("Majority Element : " + a[i]);
    //                 break;
    //             }
    //         }
    //     }
    //     public static void betterSolution() {
    //         int[] a = {2,2,1,1,1,2,2};
    //         int min = a.length/2;
    //         HashMap<Integer,Integer> map = new HashMap<>();
    //         for(int i : a) map.put(i , map.getOrDefault(i,0)+1);
    //         for(int i : a) {
    //             if(map.get(i) > min) {
    //                 System.out.print("Majority Element : " + i);
    //                 break;
    //             }
    //         }
    //     }
    //     public static void optimalSolution() {
    //         int[] a = {2,2,1,1,1,2,2};
    //         int cnt=0;
    //         int ele=0;
    //         for(int i=0;i<a.length;i++) {
    //             if(cnt == 0) {
    //                 cnt = 1;
    //                 ele = a[i];
    //             }
    //             else if(a[i] == ele) cnt++;
    //             else cnt--;
    //         }
            
    //         // For Confirmation Purpose we need to Check wether the
    //         // element appears >n/2 times or not

    //         int cnt1=0;
    //         for(int i : a) {
    //             if(i == ele) cnt1++;
    //         }
    //         if(cnt1 > a.length/2) System.out.print("Majority Element : " + ele);
    //     }
    //     public static void main(String[] args) {
            
    //         // bruteForceSolution();
            
    //         // betterSolution();

    //         // optimalSolution();
    //     }
    // }
    
    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 4.Kadane's Algorithm */

    // import java.lang.Math;

    // class ArraysMedium {
    //     public static void main(String[] args) {
    //         int[] a = {-2,1,-3,4,-1,2,1,-5,4};
    //         int sum = 0, max = Integer.MIN_VALUE;
    //         for(int i=0;i<a.length;i++) {
    //             sum += a[i];
    //             max = Math.max(max , sum);
    //             if(sum < 0) sum = 0;
    //         }
    //         System.out.print("Maximum Sum is : " + max);
    //     }
    // }

    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */
    
    /* 5.Print SubArray with Maximum SubArray Sum [Extended Version of the Kadane's Algorithm */

    // class ArraysMedium {
    //     public static void main(String[] args) {
    //         int[] a = {-2,1,-3,4,-1,2,1,-5,4};
    //         int start = 0 , tempStart=0;
    //         int end = 0;
    //         int sum =0 , max = Integer.MIN_VALUE;
    //         for(int i=0;i<a.length;i++) {
    //             if(sum == 0) tempStart = i;
    //             sum += a[i];
    //             if(sum > max) {
    //                 max = sum;
    //                 start = tempStart;
    //                 end = i;
    //             }
    //             if(sum < 0) sum = 0;
    //         }
    //         System.out.print("SubArray is : ");
    //         for(int i=start;i<=end;i++) {
    //             System.out.print(a[i] + " ");
    //         }
            
    //     }
    // }

    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 6.Stock Buy and Sell */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 7.Rearrange Array Elements by Sign */

    // class ArraysMedium {
    //     public static void bruteForceSolution() {
    //         int[] a = {3,1,-2,-5,2,-4};
    //         int pcnt = 0, ncnt = 0;
    //         for(int i : a) {
    //             if(i < 0) ncnt++;
    //             else pcnt++;
    //         }
    //         int[] pos = new int[pcnt];
    //         int[] neg = new int[ncnt];
    //         int pInd = 0;
    //         int nInd = 0;
    //         for(int i : a) {
    //             if(i > 0) {
    //                 pos[pInd++] = i;
    //             }
    //             else {
    //                 neg[nInd++] = i;   
    //             }
    //         }
    //         pInd = 0;
    //         nInd = 0;
    //         for(int i=0;i<a.length;i++) {
    //             if(i%2==0) a[i] = pos[pInd++];
    //             else {
    //                 a[i] = neg[nInd++];
    //             } 
    //         }
    //         System.out.print("Answer Array : ");
    //         for(int i : a) System.out.print(i  + " ");
    //     }
    //     public static void optimalSolution() {
    //         int[] a = {3,1,-2,-5,2,-4};
    //         int pcnt=0,ncnt=0;
    //         for(int i : a) {
    //             if(i < 0) ncnt++;
    //             else if(i > 0) pcnt++;
    //         }
    //         int[] ans = new int[pcnt + ncnt]; 
    //         int pInd = 0, nInd =1;
    //         for(int i=0;i<a.length;i++) {
    //             if(a[i] > 0) {
    //                 ans[pInd] = a[i];
    //                 pInd += 2;  
    //             } 
    //             else {
    //                 ans[nInd] = a[i];
    //                 nInd  += 2;
    //             }
    //         }
    //         System.out.print("Answer Array : ");
    //         for(int i : ans) System.out.print(i  + " ");
            
    //     }
    //     public static void main(String[] args) {
            
    //         // Brute Force
    //          bruteForceSolution();

    //         // Optimal Solution 
    //         // optimalSolution();

    //     }
    // }


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 8.Next Permutation */

    // import java.util.Arrays;

    // class ArraysMedium {

    //     public static int[] nextPermutation(int[] arr) {
    //         int index = -1;
    //         for(int i=arr.length-2;i>=0;i--) {
    //             if(arr[i] < arr[i+1]) {
    //                 index = i;
    //                 break;
    //             }
    //         }
    //         if(index == -1 ) {
    //             return  reverse(arr , 0 , arr.length-1);
    //         }
    //         for(int i=arr.length-1;i>index;i--) {
    //             if(arr[i] > arr[index]) {
    //                 int temp = arr[i];
    //                 arr[i]  = arr[index];
    //                 arr[index] = temp;
    //                 break;
    //             }
    //         }
    //         return reverse(arr, index + 1, arr.length-1);
    //     }
    //     public static int[] reverse(int[] arr , int start , int end) {
    //         while(start < end) {
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start++;
    //             end--;
    //         }
    //         return arr;
    //     }  
    //     public static void main(String[] args) {
    //         System.out.println(Arrays.toString(nextPermutation(new int[]{2,1,3})));
    //     }
    // }
    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 9.Leaders In an Array */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 10.Longest Consecutive Sequence In an Array */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 11. Set Matrix Zeroes  */

    // class ArraysMedium {
        
    //     public static void printMatrix(int[][] matrix) {
    //         for(int i=0;i<matrix.length;i++) {
    //             for(int j=0;j<matrix[0].length;j++) {
    //                 System.out.print(matrix[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     public static void markRow(int[][] matrix , int i) {
    //         for(int j=0;j<matrix[0].length;j++) {
    //             if(matrix[i][j] != 0 ) matrix[i][j] = -1;
    //         }
    //     }
    //     public static void markCol(int[][] matrix , int j) {
    //         for(int i=0;i<matrix.length;i++) {
    //             if(matrix[i][j] != 0 ) matrix[i][j] = -1;
    //         }
    //     }
    //     public static void bruteForceSolution(int[][] matrix) {
            
    //         int n = matrix.length , m = matrix[0].length;
    //         for(int i = 0; i < n; i++) {
    //             for(int j = 0 ; j < m; j++) {
    //                 if(matrix[i][j] == 0) {
    //                     markRow(matrix , i);
    //                     markCol(matrix , j);
    //                 }
    //             }
    //         }
    //         for(int i = 0; i < n ; i++) {
    //             for(int j = 0;j < m ;j++) {
    //                 if(matrix[i][j] == -1) {
    //                     matrix[i][j] = 0;
    //                 }
    //             }
    //         }

    //         // Print Result Matrix 
    //         printMatrix(matrix);
            
    //         /*
    //             Time Complexity : 
    //             Spcae Complexity :  
    //         */
    //     }

    //     // Better Approach

    //     public static void betterSolution(int[][] matrix) {
    //         int n = matrix.length;
    //         int m = matrix[0].length;
    //         int[] row = new int[n];
    //         int[] col = new int[m];
    //         for(int i=0;i<n;i++) {
    //             for(int j=0;j<m;j++) {
    //                 if(matrix[i][j] == 0) {
    //                     row[i] = 1;
    //                     col[j] = 1;
    //                 }
    //             }
    //         }

    //         for(int i=0;i<n;i++) {
    //             for(int j=0;j<m;j++) { 
    //                 if(row[i] == 1 || col[j] == 1) matrix[i][j] = 0;
    //             }
    //         }
            
    //         // Print Result Matrix 
    //         printMatrix(matrix);

    //         /*
    //             Time Complexity : 
    //             Spcae Complexity :  
    //         */
    //     } 

    //     // Optimal Approach
    //     public static void optimalSolution(int[][] matrix) {
    //         int n = matrix.length;
    //         int m = matrix[0].length;
    //         int col0 = 1;
    //         for(int i=0;i<n;i++) {
    //             for(int j=0;j<m;j++) {
    //                 if(matrix[i][j] == 0) {
    //                     matrix[i][0] = 0;
    //                     if(j != 0) matrix[0][j] = 0;        
    //                     else col0 = 0;            
    //                 }
    //             }
    //         }

    //         for(int i=1;i<n;i++) {
    //             for(int j=1;j<m;j++) {
    //                 if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
    //             }
    //         }
    //         if(matrix[0][0] == 0 ) {
    //             for(int j=0;j<m;j++) matrix[0][j] = 0;
    //         }
    //         if(col0 == 0) {
    //             for(int i=0;i<n;i++) matrix[i][0] = 0;
    //         }

    //         // Print Result Matrix
    //         printMatrix(matrix);

    //         /*
    //             Time Complexity : 
    //             Spcae Complexity :  
    //         */
    //     }
        
    //     public static void main(String[] args) {
            
    //         int[][] matrix = {
    //             {1,1,1,1} , 
    //             {1,0,1,1} , 
    //             {1,1,0,1} , 
    //             {1,1,0,1}
    //         };

    //         // Brute Force 
    //         // bruteForceSolution(matrix);

    //         // Better Solution
    //         // betterSolution(matrix);

    //         // Optimal Solution
    //         optimalSolution(matrix);
    //     }
    // }

    /* ========================================================================= */

    /* 12.Rotate Matrix By 90 Degrees*/

    // class ArraysMedium {

    //     public static void transpose(int[][] matrix) {
    //         for(int i=0;i<matrix.length;i++) {
    //             for(int j=i+1;j<matrix[0].length;j++) {
    //                 int temp = matrix[i][j];
    //                 matrix[i][j] = matrix[j][i];
    //                 matrix[j][i] = temp;
    //             }
    //         }
            
    //     }
    //     public static void print(int[][] matrix) {
    //         for(int i=0;i<matrix.length;i++) {
    //             for(int j=0;j<matrix[0].length;j++) {
    //                 System.out.print(matrix[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     public static void reverse(int[][] matrix)  {
    //         int low = 0;
    //         int high = matrix[0].length-1;
    //         for(int i=0;i<matrix.length;i++) {
    //             while(low < high) {
    //                 int temp = matrix[i][low];
    //                 matrix[i][low] = matrix[i][high];
    //                 matrix[i][high] = temp;
    //                 low++;
    //                 high--;
    //             }
    //             low = 0;
    //             high = matrix[0].length-1;
    //         }
    //     }
    //     public static void main(String[] args) {
    //         int[][] matrix = {
    //                 {1,2,3,4} ,
    //                 {5,6,7,8} ,
    //                 {9,10,11,12} ,
    //                 {13,14,15,16} 
    //         };
    //         transpose(matrix);
    //         print(matrix);
    //         reverse(matrix);
    //         print(matrix);
    //     }
    // }

    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 13.Print the Matrix In Spiral Manner */

    // class ArraysMedium {
    //     public static void main(String[] args) {
    //         int[][] matrix = {
    //             {1,2,3,4,5} , 
    //             {6,7,8,9,10} , 
    //             {11,12,13,14,15} ,
    //             {16,17,18,19,20} ,
    //             {21,22,23,24,25}
    //         };
    //         int left = 0;
    //         int right = matrix[0].length-1;
    //         int top = 0;
    //         int bottom = matrix.length-1;

    //         while(left <= right && top <= bottom) {

    //             // left -> right

    //             for(int i=left;i<=right;i++) {
    //                 System.out.print(matrix[top][i] + " ");
    //             }
    //             top++;                
                
    //             // top -> bottom
                
    //             for(int i=top;i<=bottom;i++) {
    //                 System.out.print(matrix[i][right] + " ");
    //             } 
    //             right--;

    //             // right -> left 

    //             if(left <= right) {
    //                 for(int i=right;i>=left;i--) {
    //                     System.out.print(matrix[bottom][i] + " ");
    //                 }
    //                 bottom--;
    //             }
               

    //             // left -> top

    //              if(top <= bottom) {
    //                 for(int i=bottom;i>=top;i--) {
    //                     System.out.print(matrix[i][left] + " ");
    //                 }
    //                 left++;
    //             }
    //         }
    //     }
    // }
    

    /*
        Time Complexity :  

        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 14.Count SubArrays with given Sum */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */
