
package step3.hard;

public class MissingAndRepeating {
    
    public static void usingCount(int[] arr) {
        // use counting
        int cnt = 0;
        int missing = -1 , repeating = -1;
        for(int i = 1;i <=arr.length;i++) {
            for(int j = 0; j <arr.length ; j++) {
                if(i == arr[j]) cnt++;
            }
            if(cnt == 0) missing = i;
            else if(cnt == 2 ) repeating = i;
            cnt = 0;
            if(missing != -1 && repeating != -1) break;
        }
        System.out.println("Missing Number : " + missing); 
        System.out.println("Repeating Number : " + repeating);
    }
    public static void usingHashing(int[] arr) {
        // use Array for Hashing
        int missing = 0 ,repeating = 0;
        int[] hash = new int[arr.length+1];
        for(int i : arr) {
            hash[i]++;
        }
        for(int i = 1 ; i < hash.length; i++) {
            if(hash[i] == 0) missing = i;
            else if(hash[i] == 2) repeating = i;
        }
        System.out.println("Missing Number : " + missing); 
        System.out.println("Repeating Number : " + repeating);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,6};
        
        // Brute 
        //usingCount(arr);
        
        // Better 
        usingHashing(arr);

        // Optimal 1 using Math (Easy)
        

        // Optimal 2 using XOR (Tricky)


    }
}