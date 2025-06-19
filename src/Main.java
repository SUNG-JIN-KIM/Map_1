import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        // containsKey() & containsValue()
        System.out.println(fruitPrices.containsKey("배"));
        System.out.println(fruitPrices.containsValue(10320));

        System.out.println();

        //getOrDefault()
        System.out.println(fruitPrices.getOrDefault("사과", 500));
        System.out.println(fruitPrices.getOrDefault("포도", 500));

        System.out.println();

        //replace() & remove()
        fruitPrices.replace("사과", 2000);
        fruitPrices.remove("멜론");
        for(Map.Entry<String, Integer> fruitPrice : fruitPrices.entrySet()){
            System.out.println(fruitPrice);
        }
        System.out.println();
        fruitPrices.values();
       //keySet()
        for(String f : fruitPrices.keySet()){
            System.out.println(f);
        }
    }
}
