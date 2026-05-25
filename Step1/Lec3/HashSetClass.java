package step1.lec3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {

        // Declaration of a HashSet
        HashSet<Integer> hset = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,3,4,5,6));
        /* 
        Methods :  .add() , .remove() , .contains()
                   .size() , .isEmpty() , .clear()
                   .addAll() , .removeAll() , .retainAll()
        */

        // Add an Element to the HashSet.
        hset.add(10);
        hset.add(20);
        // Remove an Element from the HashSet.
        hset.remove(10);
        // Check if an Element present int the HashSet or not.
        hset.contains(20);
        // Check the size of an HashSet
        hset.size();
        // Check if HashSet is Empty or not.
        hset.isEmpty();;
        // Remove all Elements from the HashSet
        hset.clear();
        // Add a Collection to the HashSet (UNION)
        hset.addAll(al);
        // Remove Common Elements from the two Collections (DIFFERENCE)
        hset.removeAll(al);
       // Keep Common Elemens between the Collections (INTERSECTION)
        hset.retainAll(al);

       // Iterate through the HashSet
       System.out.print("HashSet Contains : ");
       for(int i : hset) {
        System.out.print(i +  " ");
       }


    }
}
