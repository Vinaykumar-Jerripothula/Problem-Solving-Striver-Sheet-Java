import java.util.Scanner;

class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int cnt=1;
        int left = 0 , right = matrix[0].length-1;
        int top = 0 , bottom = matrix.length-1;

        while(top <= bottom && left <= right) {
            
            // Print Left to right
            for(int i=left;i<=right;i++) {
                matrix[top][i] = cnt++;
            }
            top++;

            // Print top to bottom
            for(int i=top;i<=bottom;i++) {
                matrix[i][right] = cnt++;
            }
            right--;
            
            // Print Right to left
            if(top <= bottom) {
                for(int i=right ; i >= left ; i--) {
                    matrix[bottom][i] = cnt++;
                }
                bottom--;
            }

            // Print bottom to Top
            if(left <= right) {
                for(int i=bottom; i>=top;i--) {
                    matrix[i][left] = cnt++;
                }
                left++;
            }

        }

        for(int[] arr : matrix) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}