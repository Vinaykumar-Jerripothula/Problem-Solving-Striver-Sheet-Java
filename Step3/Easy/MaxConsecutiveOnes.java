import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void maxConsecutiveOnes(int[] a , int n) {
        int count = 0 , maxCount= 0 ;
        for(int i = 0 ; i < n ; i++) {
            if(a[i] == 1) { 
                count++;
                maxCount = maxCount < count ? count : maxCount;
            }
            else count=0;
        }
        System.out.print("Max Consecutive Ones : " + maxCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0 ;i < n ; i++) a[i] = sc.nextInt();
        maxConsecutiveOnes(a,n);
        sc.close();

    }
}
