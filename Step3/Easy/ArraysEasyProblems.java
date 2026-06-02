


    //import java.util.Scanner;

    /* =================================================================== */


    /* 1. Largest Element  */

    /* class ArraysEasyProblems {

        public static void largestEleInArray()  {
            int[] a = {1,2,3,4,4,5,6,17,7};
            int max = a[0];
            for(int i = 1 ; i < a.length ; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            }
            System.out.print("Maximum in Array : " + max);
        }
        public static void main(String[] args) {
            largestEleInArray();
        }
    } */


     /*
        Time Complexity : 

        Space Complexity : 

     */

    /* ============================================================= */
    
    /* 2. Second Largest */

    // class ArraysEasyProblems {
    //     public static void main(String[] args) {
    //         int[] a = {10,2,3,4,5,6,7,8};
    //         int max = 0;
    //         int secMax = 0;
    //         for(int i : a) {
    //             if(i > max) {
    //                 secMax = max;
    //                 max = i;
    //             }
    //             else if(i < max && i > secMax) secMax = i;
    //         }
    //         System.out.print("Max is : " + max + " , " + "Second Max is : " + secMax);
    //     }
    // }

     /*
        Time Complexity : O(n)

        Space Complexity : O(1)

     */

    /* ================================================================== */
    
    /* 3. Array Is Sorted Or Not */
    
    /* public class ArraysEasyProblems {
        public static boolean arraySortedOrNot(int[] a, int n) {

            int previous = a[0];
            for (int i = 1; i < n; i++) {
                if (previous <= a[i])
                    previous = a[i];
                else {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Array Size : ");
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (arraySortedOrNot(a, n))
                System.out.println("Array is Sorted .");
            else
                System.out.println("Array is Not Sorted .");
            sc.close();

        }
    } */

     /*
        Time Complexity : 

        Space Complexity : 

     */

    /* =================================================================== */

    /* 4. Remove Duplicates From Sorted Arrays */

    /* class ArraysEasyProblems {
        public static void main(String[] args) {
            int[] a = {0,0,1,1,1,2,2,3,3,4};
            int j=0;
            for(int i=1;i<a.length;i++) {
                if(a[i] != a[j]) {
                    a[j+1] = a[i];
                    j++;
                }
            }
            System.out.print("After Removing Duplicates : ");
            for(int i : a) System.out.print(i + " ");
        }
    } */

     /*
        Time Complexity : 

        Space Complexity : 

     */

    /* =================================================================== */

    /* 5. Left Rotate Array By One */

    // class ArraysEasyProblems {
    //     public static void main(String[] args) {
    //         int[] a = {1,2,3,4,5};
    //         int first  = a[0];
    //         for(int i=1;i<a.length;i++) {
    //             a[i-1] = a[i];
    //         }
    //         a[a.length-1] = first;
    //         System.out.print("After Rotating : ");
    //         for(int i : a) System.out.print(i + " ");
    //     }

    // }


    /*
        Time Complexity : O(n)

        Space Complexity : O(1)

    */

    /* =================================================================== */

    /* 6. Left Rotate Array by K Places */

    // class ArraysEasyProblems {
    //     public static void bruteForce() {
    //         int[] a = {1,2,3,4,5,6,7};
    //         int k = 3;

    //         // k = k % a.length;

    //         for(int i=0;i<k;i++) {
    //             int first = a[0];
    //             for(int j=1;j<a.length;j++) {
    //                 a[j-1] = a[j];
    //             }
    //             a[a.length-1] = first;
    //         }
    //         System.out.print("After Rotating K times : ");
    //         for(int i : a) System.out.print(i + " "); 
    //     }
    //     public static void reverse(int[] arr , int start , int end) {
    //         while(start < end) {
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start++;
    //             end--;
    //           }
    //     }
    //     public static void optimalSolution() {
    //         int[] a = {1,2,3,4,5,6,7};
    //         int k = 3;
            
    //         // reverse first k items
    //         reverse(a , 0 , k-1);
            
    //         // reverse k+1 to n
    //         reverse(a,k,a.length-1);
            
    //         // reverse entire array
    //         reverse(a , 0 , a.length-1);

    //         System.out.print("After Rotating K times : ");
    //         for(int i : a) System.out.print(i + " ");

    //     }
    //     public static void main(String[] args) {
            
    //         // Brute Force
    //         // bruteForce();

    //         // Optimal Approach 
    //         // optimalSolution();

    //     }
    // }


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 7. Move Zeroes to End */

    /* class ArraysEasyProblems {
        public static void main(String[] args) {
            int[] a = {1,0,2,0,0,3,4,0,5};
            int j=0;
            while(j < a.length && a[j] != 0) j++;

            for(int i=j+1;i<a.length;i++) {
                if(a[i] != 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }
                
            }
            System.out.print("Moves zeroes to End : ");
            for(int i : a) System.out.print(i + " ");
        }
    } */


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 8. Linear Search */

    /*  class ArraysEasyProblems {

    } */


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 9. Union of Two Sorted Arrays */


    // import java.util.ArrayList;

    // class ArraysEasyProblems {
    //     public static void main(String[] args) {
    //         int[] a = {1,1,2,3,4,5};
    //         int[] b = {2,3,4,4,5,6};
    //         ArrayList<Integer> al = new ArrayList<>();
    //         int i = 0 , j = 0;
    //         int n = a.length , m = b.length;
    //         while(i < n && j < m) {
    //             if(a[i] < b[j]) {
    //                 if(al.size() == 0) {
    //                     al.add(a[i++]);
    //                 }
    //                 else if(al.get(al.size()-1) != a[i]) {
    //                     al.add(a[i++]);
    //                 } else i++;
    //             }
    //             else if(a[i] > b[j]){
    //                 if(al.size() == 0) {
    //                     al.add(b[j++]);
    //                 }
    //                 else if(al.get(al.size()-1) != b[j]) {
    //                     al.add(b[j++]);
    //                 }
    //                 else j++;
    //             }
    //             else {
    //                 if(al.size() == 0 || al.get(al.size()-1) != a[i]) {
    //                     al.add(a[i++]);j++;
    //                 }
    //                 else {
    //                     i++;j++;
    //                 }
    //             }
    //         }
    //         while(i < n) {
    //             if(al.get(al.size()-1) != a[i]) {
    //                 al.add(a[i++]);
    //             } else i++;
    //         }
            
    //         while(j < m) {
    //             if(al.get(al.size()-1) != b[j]) {
    //                 al.add(b[j++]);
    //             }
    //             else j++;
    //         }

    //         System.out.print("Union Array : ");
    //         for(int k : al) System.out.print(k + " ");
    //     }
    // }

    /*
        Time Complexity : O(n + m)

        Space Complexity : O(n + m)

    */

    /* =================================================================== */

    /* 10. Find Missing Number */

    /*  class ArraysEasyProblems {

    } */


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 11.  Max Consecutive Ones */

    /* class ArraysEasyProblems {
        public static void maxConsecutiveOnes() {
            int[] a = {1,2,3,1,1,1,1,3,1,1,1,32,1,1,};
            int count = 0 , maxCount= 0 ;
            for(int i = 0 ; i < a.length; i++) {
                if(a[i] == 1) { 
                    count++;
                    maxCount = maxCount < count ? count : maxCount;
                }
                else count=0;
            }
            System.out.print("Max Consecutive Ones : " + maxCount);
        }
        public static void main(String[] args) {
            maxConsecutiveOnes();
        }
    } */


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 12. Find the Number that appears once While Others twice */

    /* class ArraysEasyProblems {
        public static void main(String[] args) {
            int[] a = {1,2,3,4,5,4,3,2,1};
            int single = 0;
            for(int i : a) single ^= i;
            System.out.print("Missing Number : " + single);
        }
    } */


    /*
        Time Complexity : O(N)

        Space Complexity : O(1)

    */

    /* =================================================================== */

    /* 13. Longest subArray with Sum k [ Positives & Zeroes] */

    //import java.lang.Math;
    
    /* class ArraysEasyProblems {
        public static void main(String[] args) {
            int[] a = {1,2,1,3,1,1,1,2};
            int k=5;
            int l=0,r=0;
            int sum=0,maxLen=0;
            while(r<a.length) {
                sum += a[r];
                while(sum > k) {
                    sum -= a[l];
                    l++;
                }
                if(sum == k) maxLen = Math.max(maxLen , r-l+1);
                r++;
            }
            System.out.print("Longest SubArray length : " + maxLen);
        }
    } */


    /*
        Time Complexity : 

        Space Complexity : 

    */

    /* =================================================================== */

    /* 14. Longest subArray with Sum k [ Positives & Negatives]  */

    // import java.util.HashMap;

    // class ArraysEasyProblems {
    //     public static void main(String[] args) {
    //         int[] a = {1,-1,5,-2,3,0,-3,3};
    //         int k = 3;
    //         int sum = 0;
    //         int maxLen=0;
    //         HashMap<Integer,Integer> map = new HashMap<>();
    //         map.put(0,-1);
    //         for(int i=0;i<a.length;i++) {
    //             sum += a[i];
                
    //             int rem = sum - k;
    //             if(map.containsKey(rem)) {
    //                 maxLen = Math.max(maxLen , i-map.get(rem));
    //             }
    //             if(!map.containsKey(sum)) {
    //                 map.put(sum , i);
    //             }
    //         }
    //         System.out.print("Longest SubArray Length : " + maxLen); 
    //     }
    // }


    /*
        Time Complexity :  O(n) [ one time Traversal ]

        Space Complexity : O(n) [ HashMap ]

    */

    /* =================================================================== */

    