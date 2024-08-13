import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap favouriteFruits = new HashMap<>();
        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 52);
        ages.put("Bob", 24);

        Integer aliceAge = ages.get("Alice");
        System.out.println(aliceAge.toString());

        favouriteFruits.put("key", "value");
        favouriteFruits.get("Alice");
        favouriteFruits.size();
        favouriteFruits.clear();
        favouriteFruits.containsKey("Alice");
        favouriteFruits.containsValue("50");
        favouriteFruits.remove(key)




    }
}
