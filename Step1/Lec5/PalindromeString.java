package step1.lec5;
import java.util.Scanner;

public class PalindromeString {

    public static boolean  isPalindrome(String str , int s, int e) {
        
        if(s >= e) return true;
        if(str.charAt(s) != str.charAt(e)) return false;

        return isPalindrome(str, s+1, e-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ok = false;
        ok =  isPalindrome(str,0,str.length()-1);
        if(ok) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
