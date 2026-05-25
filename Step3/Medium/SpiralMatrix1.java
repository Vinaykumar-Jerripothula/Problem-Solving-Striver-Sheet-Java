package step3.medium;

import java.util.ArrayList;

public class SpiralMatrix1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0,bottom = matrix.length-1;
        
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right;i++) {
                al.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                al.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i=right;i >=left;i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom;i>=top;i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        } 
        
        System.out.print("Spiral Order : " );
        for(int i : al) {
            System.out.print(i + " ");
        }
    }    
}
