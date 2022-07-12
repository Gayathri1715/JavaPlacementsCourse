import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    

    public static void main(String[] args) {
        // Map<String, Integer> numbers = new HashMap<>();
        Map<String ,Integer> numbers = new TreeMap<>();// In tree map the keys are arranged in alphabetical order
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        // if(!numbers.containsKey("two")){
        //     numbers.put("two", 23);
        // }

        // numbers.putIfAbsent("two", 23);
        System.out.println(numbers);
        //Iteration a hashMap
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key:numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value:numbers.values()){
            System.out.println(value);
        }
        System.out.println(numbers.containsKey("one"));
        System.out.println();
    }
}