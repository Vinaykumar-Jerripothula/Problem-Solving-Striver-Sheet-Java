

    /* ========================================================================= */

    /* 1.Two Sum */



    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 2.Sort Colors */



    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 3.Majority Element - 1 */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 4.Kadane's Algorithm */


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */
    
    /* 5.Print SubArray with Maximum SubArray Sum [Extended Version of the Kadane's Algorithm */


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



    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 8.Next Permutation */


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

    class ArraysMedium {
        
        public static void printMatrix(int[][] matrix) {
            for(int i=0;i<matrix.length;i++) {
                for(int j=0;j<matrix[0].length;j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void markRow(int[][] matrix , int i) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] != 0 ) matrix[i][j] = -1;
            }
        }
        public static void markCol(int[][] matrix , int j) {
            for(int i=0;i<matrix.length;i++) {
                if(matrix[i][j] != 0 ) matrix[i][j] = -1;
            }
        }
        public static void bruteForceSolution(int[][] matrix) {
            
            int n = matrix.length , m = matrix[0].length;
            for(int i = 0; i < n; i++) {
                for(int j = 0 ; j < m; j++) {
                    if(matrix[i][j] == 0) {
                        markRow(matrix , i);
                        markCol(matrix , j);
                    }
                }
            }
            for(int i = 0; i < n ; i++) {
                for(int j = 0;j < m ;j++) {
                    if(matrix[i][j] == -1) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Print Result Matrix 
            printMatrix(matrix);
            
            /*
                Time Complexity : 
                Spcae Complexity :  
            */
        }

        // Better Approach

        public static void betterSolution(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[] row = new int[n];
            int[] col = new int[m];
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(matrix[i][j] == 0) {
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }

            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) { 
                    if(row[i] == 1 || col[j] == 1) matrix[i][j] = 0;
                }
            }
            
            // Print Result Matrix 
            printMatrix(matrix);

            /*
                Time Complexity : 
                Spcae Complexity :  
            */
        } 

        // Optimal Approach
        public static void optimalSolution(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int col0 = 1;
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        if(j != 0) matrix[0][j] = 0;        
                        else col0 = 0;            
                    }
                }
            }

            for(int i=1;i<n;i++) {
                for(int j=1;j<m;j++) {
                    if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
                }
            }
            if(matrix[0][0] == 0 ) {
                for(int j=0;j<m;j++) matrix[0][j] = 0;
            }
            if(col0 == 0) {
                for(int i=0;i<n;i++) matrix[i][0] = 0;
            }

            // Print Result Matrix
            printMatrix(matrix);

            /*
                Time Complexity : 
                Spcae Complexity :  
            */
        }
        
        public static void main(String[] args) {
            
            int[][] matrix = {
                {1,1,1,1} , 
                {1,0,1,1} , 
                {1,1,0,1} , 
                {1,1,0,1}
            };

            // Brute Force 
            // bruteForceSolution(matrix);

            // Better Solution
            // betterSolution(matrix);

            // Optimal Solution
            optimalSolution(matrix);
        }
    }

    /* ========================================================================= */

    /* 12.Rotate Matrix By 90 Degrees*/


    /*
        Time Complexity : 
        Spcae Complexity :  
    */

    /* ========================================================================= */

    /* 13.Print the Matrix In Spiral Manner */


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
