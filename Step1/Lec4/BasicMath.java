
    import java.util.Scanner;

    /* =================================================================== */
    
    class BasicMath {

        public static void armstrongNumberOrNot() {
            Scanner sc =  new Scanner(System.in);
            System.out.print("Enter Number to check its Armstrong Number or not : ");
            int n  = sc.nextInt();
            int lastdigit = 0  , original = n  , sum = 0 ;
            int dc = (int )Math.log10(n)+1;
            while(n > 0) {
                lastdigit = n % 10;
                sum += (int) Math.pow(lastdigit, dc);
                n = n /10;
            }
            if(original == sum) {
                System.out.println("The given Number is a Armstrong Number . " + sum);
            }
            else {
                System.out.println("Not an Armstrong Number .." + sum );
            }
            sc.close();

        }
        public static void isPrime() {
            boolean ok = false;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            
            if(n==0||n==1) ok = false;;
            for(int i = 2 ; i*i<n ; i++) {
                if(n%i == 0) ok = false;
            }
            ok= true;
            if(ok) System.out.print(n + " is Prime.");
            else System.out.print(n+" Not a Prime.") ;
            sc.close();
        }

        public static void palindromeNumberOrNot() {
            Scanner sc =  new Scanner(System.in);
            System.out.print("Enter Number to check its Palindrome or not : ");
            int n  = sc.nextInt();
            int lastdigit = 0 , reversedNum = 0 , original = n ;
            while(n > 0) {
                lastdigit = n % 10;
                reversedNum = (reversedNum*10) + lastdigit ;
                n = n /10;
            }
            if(original == reversedNum) {
                System.out.println("The given Number is a Palindrome . ");
            }
            else {
                System.out.println("Not a Palindrome .." + reversedNum);
            }
            sc.close();

        }
        public static void main(String[] args) {
            
            /* ================== Basic Maths ========================*/

            /* 1. Armstron Number Or Not  */
            // armstrongNumberOrNot();

            /* 2. Prime Number */
            // isPrime();

            /* 3. Palindrome Number  */
            // palindromeNumberOrNot() 

            /* 4.  */
            // 
        }
    }

    /* =================================================================== */
