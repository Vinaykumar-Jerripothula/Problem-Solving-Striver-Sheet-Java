public class ReverseAnArray {

    public static int[] reverseAnArray(int[] arr,int s,int e) {
            
        if(s>=e) return arr; 
         int temp = arr[e];
         arr[e] = arr[s];
         arr[s] = temp;
        return reverseAnArray(arr, s+1, e-1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = reverseAnArray(arr,0,arr.length-1);
        for(int i : arr) {
            System.out.print( i + " ");
        }
    }
}
