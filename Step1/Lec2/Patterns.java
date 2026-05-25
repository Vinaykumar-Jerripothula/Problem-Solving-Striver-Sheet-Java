package step1.lec2;


import java.util.Scanner;

public class Patterns {

    static void pattern1()
    {

        /*  This method is to print the below Pattern   */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number to Print N*N Square Pattern : ");
        int range = sc.nextInt();
        System.out.println("");
        System.out.println("Square Pattern ..");
        System.out.println("");
        for(int i = 1 ; i <= range ; i++)
        {   
            for(int j = 1 ; j <= range ; j++)
            {
                System.out.print(" *");
            }  
            System.out.println("");
        }
        System.out.println("");
        sc.close();
    }
    static void pattern2()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Range to Print The Pattern : ");
        int range = sc.nextInt();
        System.out.println("");
        System.out.println("Ladder Pattern ..");
        System.out.println("");
        for(int i = 1 ; i <= range ; i++)
        {
            for(int j = 1 ; j <= i ; j ++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");

        sc.close();
    }
    static void pattern3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range to Print Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Ladder Pattern ..");
        System.out.println();
        for(int i = 1; i <= range ; i++)
        {
            for(int j = 1 ; j <=i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
        System.out.println();
    }
    static void pattern4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 1 ; i <= range; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
        System.out.println();
    }
    static void pattern5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 1 ; i <= range; i++)
        {
            for(int j = 1 ; j <= ( range - i + 1) ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        System.out.println();
    }
    static void pattern6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 1 ; i <= range; i++)
        {
            for(int j = 1 ; j <= ( range - i + 1) ; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        sc.close();
        System.out.println();
    }
    static void pattern7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 0 ; i < range; i++)
        {
            //space
            for(int j = 0 ; j < (range-i-1) ; j ++)
            {
                System.out.print(" ");
            } 
            //star
             for(int j = 0 ; j < ( 2*i + 1) ; j ++)
            {
                System.out.print("*");
            } 
            //space
             for(int j = 0 ; j < (range-i-1) ; j ++)
            {
             System.out.print(" ");   
            } 
            System.out.println("");
        }
        sc.close();
        System.out.println();
    }
     
    static void pattern8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 0 ; i < range; i++)
        {
            //space
            for(int j = 0 ; j < i ; j ++)
            {
                System.out.print(" ");
            } 
            //star
            int breakpoint = (2*range - 1);
             for(int j = 0 ; j < breakpoint ; j ++)
            {
                System.out.print("*");
            } 
            //space
             for(int j = 0 ; j < i ; j ++)
            {
             System.out.print(" ");   
            } 

            breakpoint -= 2;
            System.out.println("");
        }
        sc.close();
        System.out.println();
    }
    public static void pattern9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to Print the Pattern : ");
        int range = sc.nextInt();
        System.out.println();
        System.out.println("Number Pattern 2 ..");
        System.out.println();

        for(int i = 0 ; i < range ; i++)
        {
             // space 
            for(int j = 0 ; j < range - i ; j++ )
            {
                System.out.print(" ");
            }             
            // number
            int count = 1;
            for(int j = 0 ; j < (2*i+1) ; j++)
            {
                System.out.print(count);
                count++;
            }
            count = 1 ;
            // space
             for(int j = 0 ; j < range - i ; j++ )
            {
                System.out.print(" ");
            }  
            System.out.println("");

        }

    }
    
    public static void pattern10() {

        int inis = 4+2;//2n-1
        for(int i = 1 ; i <= 4 ; i++)
        {

            //number 
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(j);
            }
              
            //space
           
             for(int j = 0 ; j < inis ; j++) {
                System.out.print(" ");
            }

            //number
             for(int j = i ; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println("");
            inis-=2;

        }
    }

    public static void main(String[] args) 
    {

        /* 
          Pattern 1           
          
          n * n Square with "*"
          
          * * * * *    
          * * * * * 
          * * * * *
          * * * * * 
          etc ..      
          pattern1(); 
        */
      

        /* 
            Pattern 2           
          
            n * n  Ladder with "*"

            *
            * * 
            * * * 
            * * * * 
            etc ..
            pattern2();
        */

         /* 
            Pattern 3           
          
            Number Ladder

            1
            1 2  
            1 2 3 
            1 2 3 4 
            etc ..
            pattern3();
        */

         /* 
            Pattern 4           
          
            Number Ladder 2

            1
            2 2
            3 3 3 
            4 4 4 4  
            etc ..
            pattern4();
        */

        /* 
            Pattern 5           
          
            Reverse Ladder with "*"
            
            * * * * *
            * * * * 
            * * *
            * * 
            *
           
            pattern5();
        */

         /* 
            Pattern 6           
          
            Reverse Ladder with "*"
            
            1 2 3 4 5 
            1 2 3 4
            1 2 3 
            1 2
            1
            
            pattern6();
        */

        /* 
            * 
           ***
          *****
         *******
          pattern7();
         */

         /* 
           *********
            *******
             *****
              *** 
               *
               *   pattern8();
          */
        
          /* 
              1 
            1 2 3
           1 2 3 4 5
        `1 2 3 4 5 6 7
            pattern9();
       */
     

       /* 
         1      1
         12    21
         123  321
         12344321 


        */
       pattern10();
        
    }

    
}