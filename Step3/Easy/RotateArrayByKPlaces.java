import java.util.Scanner;

public class RotateArrayByKPlaces {

    public static void rotateArrayBruteForceApproach(int[] a, int n, int d) {
        for (int k = 0; k < d; k++) {
            int first = a[0];
            for (int i = 1; i < n; i++) {
                a[i - 1] = a[i];
            }
            a[n - 1] = first;
        }
        System.out.print("After Array Rotation : ");
        for (var ele : a)
            System.out.print(ele + " ");
    }

    public static void reverseArray(int[] a , int start , int end) {
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayBetterApproach(int[] a , int n , int d) {

        int[] temp = new int[n];
        for(int i = 0 ; i < n-d; i++) {
            temp[i] = a[d+i];
        }
        for(int i = 0 ; i < d; i++) {
            temp[n-d+i] = a[i];
        }
        System.out.print( " Better , Rotated Array is : ");
        for(int i : temp) System.out.print(i + " ");
       
    }

    public static void rotateArrayByKPlacesOptimalApproach(int[] a, int n , int d) {
        reverseArray(a, 0, d-1);
        reverseArray(a, d, n-1);
        reverseArray(a, 0, n-1);
        System.out.print("Rotated Array is : ");
        for(int i : a) System.out.print(i + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter d value : ");
        int d = sc.nextInt();

        // Rotate Array Brute Force Approach

        //rotateArrayBruteForceApproach(a, n, d);

        // Rotate Array Better Approach

        // rotateArrayBetterApproach(a,n,d);

        // Rotate Array By K Places , Reversal Approach (Optimal)

        rotateArrayByKPlacesOptimalApproach(a , n , d);
        sc.close();
    }
}
