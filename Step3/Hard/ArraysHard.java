


    /* ======================================================================== */

    /* 1 . Pascal Triangle - 1 & 2 */

    /* ======================================================================== */

    /* 2 . Majority Element - 2  */
    
    // class ArraysHard {
    //     public static void main(String[] args) {
    //         int[] a = {1,1,1,3,3,2,2,2};
    //         int[] ans = new int[2];
    //         int ansIdx = 0;
    //         int cnt1 = 0;
    //         int cnt2 = 0;
    //         int ele1 = 0;
    //         int ele2 = 0;
    //         for(int i=0;i<a.length;i++) {
    //             if(cnt1 == 0 && a[i] != ele2) {
    //                 cnt1 = 1;
    //                 ele1 = a[i];
    //             }
    //             else if(cnt2 == 0 && a[i] != ele1) {
    //                 cnt2 = 1;
    //                 ele2 = a[i];
    //             }
    //             else if(ele1 == a[i]) cnt1++;
    //             else if(ele2 == a[i]) cnt2++;
    //             else {
    //                 cnt1--;
    //                 cnt2--;
    //             }
    //         }
    //         int check1 = 0;
    //         int check2 = 0;
    //         for(int i : a) {
    //             if( i == ele1) check1++;
    //             else if( i == ele2) check2++;
    //         }
    //         if(check1 > (a.length/3)) {
    //             System.out.println("Element 1 : " + ele1);
    //         }
    //         if(check2 > (a.length/3)) {
    //             System.out.println("Element 2 : " + ele2);
    //         }

    //     }
    // }

    /* 
        Time Complexity : 
        Space Complexity : 
    */

    /* ======================================================================== */

    /* 3.  3Sum */

    // import java.util.*;
    
    // class ArraysHard {
    //     public static void bruteForce() {
    //         int[] a = {-1,0,1,2,-1,-4};
    //         HashSet<List<Integer>> set = new HashSet<>();
    //         for(int i=0;i<a.length;i++) {
    //             for(int j=i+1;j<a.length;j++) {
    //                 for(int k=j+1;k<a.length;k++) {
    //                     if(a[i] + a[j] + a[k] == 0) {
    //                         List<Integer> temp = Arrays.asList(a[i],a[j],a[k]);
    //                         Collections.sort(temp);
    //                         set.add(temp);
    //                     }
    //                 }
    //             }
    //         }
    //         System.out.print("Triplets are , ");
    //         for(List<Integer> li : set) {
    //             System.out.println(li);
    //         }
    //     }
    //     public static void betterSolution() {
    //         int[] a = {-1,0,1,2,-1,4};
    //         HashSet<List<Integer>> set = new HashSet<>();
    //         for(int i=0;i<a.length;i++) {
    //             HashSet<Integer> list = new HashSet<>();
    //             for(int j=i+1;j<a.length;j++) {
    //                 int third = -(a[i] + a[j]);
    //                 if(list.contains(third)) {
    //                     List<Integer> temp = Arrays.asList(a[i],a[j],third);
    //                     Collections.sort(temp);
    //                     set.add(temp);
    //                 }
    //                 list.add(a[j]);
    //             }
    //         }
    //         System.out.println("Triplets are , ");
    //         for(List<Integer> li : set) {
    //             System.out.println(li);
    //         }
    //     }
    //     public static void optimalSolution() {
    //         int[] a =  {-1,0,1,2,-1,4};
    //         Arrays.sort(a);
    //         List<List<Integer>> list = new ArrayList<>();
    //         for(int i=0;i<a.length;i++) {
    //             if(i>0 && a[i] == a[i-1]) continue;
    //             int j = i+1;
    //             int k = a.length-1;
    //             while(j < k) {
    //                 int sum = a[i] + a[j] + a[k];
    //                 if(sum == 0) {
    //                     List<Integer> li = Arrays.asList(a[i],a[j],a[k]);
    //                     list.add(li);
    //                     j++;
    //                     k--;
    //                     while(j < k && a[j] == a[j-1]) j++;
    //                     while(j < k && a[k] == a[k+1]) k--;
    //                 }
    //                 else if(sum < 0) {
    //                     j++;
    //                 }
    //                 else {
    //                     k--;
    //                 }
    //             }
    //         }
    //         System.out.println("Triplets are , ");
    //         for(List<Integer> ans : list) {
    //             System.out.println(ans);
    //         }
    //     }
    //     public static void main(String[] args) {
            
    //         // bruteForce();

    //         // betterSolution();

    //         optimalSolution();
    //     }
    // }

    /* 
        Time Complexity : 
        Space Complexity : 
    */

    /* ======================================================================== */

    /* 4.  3Sum */

    // import java.util.*;
    
    // class ArraysHard {
    //     public static void optimalSolution() {
    //         int[] a = {1,0,-1,0,-2,2};
    //         int target = 0;
    //         Arrays.sort(a);
    //         List<List<Integer>> al = new ArrayList<>();
    //         for(int i=0;i<a.length;i++) {
    //             if(i>0 && a[i] == a[i-1]) continue;
    //             for(int j=i+1;j<a.length;j++) {
    //                 if(j>i+1 && a[j] == a[j-1]) continue;
    //                 int k = j+1;
    //                 int l = a.length-1;
    //                 while(k < l) {
    //                     long sum = (long)a[i] + a[j] + a[k] + a[l];
    //                     if(sum == target) {
    //                        List<Integer> li = Arrays.asList(a[i] , a[j] , a[k] , a[l]);
    //                        al.add(li);
    //                        k++;
    //                        l--;
    //                        while(k<l && a[k] == a[k-1]) k++;
    //                        while(k<l && a[l] == a[l+1]) l--;
    //                     }
    //                     else if(sum > target) l--;
    //                     else k++;
    //                 } 
    //             }
    //         }
    //         System.out.println("All the 4sum's are : ");
    //         for(List<Integer> list : al) System.out.println(list);
    //     }
    //     public static void main(String[] args) {
            
    //         // bruteForce()

    //         // betterSolution

    //         optimalSolution();

    //     }
    // }

    /* 
        Time Complexity : 
        Space Complexity : 
    */

    /* ======================================================================== */

    /* 3 . Count Inversion's */

    // import java.util.ArrayList;

    // class ArraysHard {
        
    //     public static int merge(int[] a , int low , int mid , int high) {
    //         int left = low;
    //         int right = mid+1;
    //         int cnt=0;
    //         ArrayList<Integer> al = new ArrayList<>();
    //         while(left <= mid && right <= high) {
    //             if(a[left] <= a[right]) al.add(a[left++]);
    //             else {
    //                 cnt += (mid - left + 1);
    //                 al.add(a[right++]);
    //             }
    //         }
    //         while(left <= mid)  al.add(a[left++]);
    //         while(right <= high) al.add(a[right++]);

    //         for(int i=0;i<al.size();i++) a[low + i]= al.get(i);
    //         return cnt;
    //     }
    //     public static int mergeSort(int[] a , int low , int high) {
    //         int cnt=0;
    //         if(low >= high) return cnt;
    //         int mid = low + (high - low)/2;
    //         cnt += mergeSort(a , low , mid);
    //         cnt += mergeSort(a , mid+1 , high);
    //         cnt += merge(a , low , mid , high);
    //         return cnt;
    //     }
    //     public static void print(int[] a) {
    //         System.out.print("Sorted Array is : ");
    //         for(int i : a) System.out.print(i + " ");
    //     }
    //     public static void main(String[] args) {
    //         int[] a = {5,4,3,2,1};
    //         int cnt = mergeSort(a , 0 , a.length-1);
    //         print(a);
    //         System.out.print("Count Inversions : " + cnt);
    //     } 
    // }
    
    /*
        Time Complexity : 
        Space Complexity :  
     */

    /* ======================================================================== */

    /* 5 . Reverse Pairs */

    // import java.util.ArrayList;

    // class ArraysHard {
    //     public static void merge(int[] a ,int low , int mid , int high) {
    //         int left = low;
    //         int right = mid+1;
    //         ArrayList<Integer> al = new ArrayList<>();
    //         while(left <= mid && right <= high) {
    //             if(a[left] <= a[right]) al.add(a[left++]);
    //             else al.add(a[right++]);
    //         }
    //         while(left <= mid) al.add(a[left++]);
    //         while(right <= high) al.add(a[right++]);
    //         for(int i=0;i<al.size();i++) a[low + i] = al.get(i);
    //     }
    //     public static int countReversePairs(int[] a, int low , int mid , int high) {
    //         int cnt=0;
    //         int right =  mid+1;
    //         for(int i=low;i<=mid;i++) {
    //             while(right <= high && a[i] > 2L*a[right]) right++;
    //             cnt += (right - (mid+1));
    //         }
    //         return cnt;
    //     }
    //     public static int mergeSort(int[] a , int low , int high) {
    //         int cnt=0;
    //         if(low  >= high) return cnt;
    //         int mid = low + (high - low)/2;
    //         cnt += mergeSort(a , low , mid);
    //         cnt += mergeSort(a , mid+1 , high);
    //         cnt += countReversePairs(a , low , mid , high);
    //         merge(a , low , mid, high);
    //         return cnt;
    //     }
    //     public static void print(int[] a) {
    //         System.out.print("Sorted Array is : ");
    //         for(int i : a) System.out.print(i + " ");
    //     }
    //     public static void main(String[] args) {
    //         int[] a = {1,3,2,3,1};
    //         int cnt = mergeSort(a , 0 ,a.length-1);
    //         print(a);
    //         System.out.print("Reverse Pairs Count is : " + cnt);
    //     }
    // }

    /*
        Time Complexity : 
        Space Complexity :  
     */

    /* ======================================================================== */