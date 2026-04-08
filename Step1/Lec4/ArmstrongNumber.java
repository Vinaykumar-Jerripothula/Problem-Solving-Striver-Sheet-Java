package Step1.Lec4;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void armstrongNumberOrNot(int n )
    {

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
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number to check its Armstrong Number or not : ");
        int number  = sc.nextInt();
        armstrongNumberOrNot(number);
        sc.close();

    }
}
