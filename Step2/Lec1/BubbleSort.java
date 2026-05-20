



public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1;  i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Array Elements are : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        
        bubbleSort(new int[]{1,4,2,5,3});
       
    }

}
