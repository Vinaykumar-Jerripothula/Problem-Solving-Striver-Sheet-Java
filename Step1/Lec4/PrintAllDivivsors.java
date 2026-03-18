import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintAllDivivsors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i*i <n ; i++) {
            if(n%i == 0)  {
                al.add(i);
                al.add(n/i);
            }
        }
        Collections.sort(al);
        for(int i : al) System.out.print( i +" ");
        sc.close();
    }
    
}