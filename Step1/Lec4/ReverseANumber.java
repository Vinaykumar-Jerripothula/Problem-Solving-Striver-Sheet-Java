import java.util.Scanner;
public class ReverseANumber {
    public static int reverseANumber(int number)
    {
       
        int ld , reversednum = 0 ;
        while(number > 0)
        {
            ld = number % 10;
            reversednum = (reversednum*10) + ld;
            number = number / 10;
        }
        return reversednum;
       
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number to Reverse : ");
        int number = sc.nextInt();
        int reversednum = reverseANumber(number);
        System.out.println("The Reverse of" + number +  "is : " + reversednum);
         sc.close();
    }   
}
