package step1.lec3;
import java.util.HashMap;
import java.util.Set;
public class HashMapClass {

    public static void main(String[] args) {
        
        // Declare a HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        
        /* 
            Methods : 
                  put(k , v) ,  get(key) , getOrDefault(key,default)
                  size() , containsKey(key) , containsValue(value)
                  keySet() , values() , entrySet() 
                  remove() , clear() , 
                  putIfAbsent() , replace()

                */


        // Add (Key,Value) to the Hashmap
        map.put(10,10 );
        // Get Value for a key from the HashMap
        System.out.println("value is : " + map.get(10));
        // get default value if key doesnot exist in HashMap
        System.out.println(map.getOrDefault(10,0));
        // Size of the HashMap
        System.out.println("Size : " + map.size());
        // Check key is in HashMap or not
        map.containsKey(10);
        // Check Value is in HashMap or not
        map.containsValue(10);
        // Get All Keys as a Set
        Set<Integer> set = map.keySet();
        for(int i : set) {
            System.out.print(i + " ");
        }
        // Get All Values 
        for(int i : map.values()) {
            System.out.print(i + " ");
        }
        // Get keys & Values 
        map.entrySet();
        // Remove Element from a HashMap
        map.remove(10);
        map.remove(10, 10);
        // Clear all Elements From a HashMap
        //map.clear();



    }
}
