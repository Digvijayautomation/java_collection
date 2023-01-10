package Map;

import java.util.HashMap;

public class HashMapDemo {
// HashMap will not accept the duplicate values for key but it can accept for value
// HashSet will accept null for values
// Insertion order is not Preserved in HashSet
// It will accept the Heterogeneous values (string, int, null together)

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Digvijay");
        map.put(2,"Tukaram");
        map.put(1,"Tikka"); // old value will replace with new value
        map.put(3,"Tukaram");// duplicate values are allowed
        map.put(4,"1992");

        System.out.println(map);

        map.remove(4);

        System.out.println("After removing the key-pair at 4th index- " +map);

        String index3= map.get(3);
        System.out.println("Values at index 3- " +index3);

        System.out.println("Total pairs in map are- "+map.size());

        System.out.println("Checking hashmap is empty or not- "+map.isEmpty());
        System.out.println("Total entries of Hashmap "+ map.entrySet());
            map.clear(); // will delete all the values

        System.out.println("Checking hashmap is empty or not after all the data is cleared- " +map.isEmpty());


    }
}
