package step1.lec3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {

        // Declaring a ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        /* => Methods : add(), get(), remove(), clear(),
                        addFirst(), addLast(), contains(),
                        removeFirst(), removeLast(), 
                        getFirst(), getLast(), size(),
                        Collections.reverse() .
            */ 

        
        // Add Element to ArrayList
        al.add(10);
        // Add Element to ArrayList Using Index
        al.add(1, 20);
        // Get Element using Index
        System.out.print(al.get(1) + " ");
        // Remove Element
        al.remove(1);
        System.out.println(al);
        // Add an Element at starting Position 
        al.addFirst(50);
        // Add an Element at Ending Position
        al.addLast(100);
        // Check Element Found in ArrayList or Not
        al.contains(10);
        // Size of an ArrayList
        al.size();
        // To Reverse a ArrayList
        Collections.reverse(al);
        System.out.println(al);
        // Clear ArrayList
        al.clear();
        
            
    }
}
