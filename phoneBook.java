import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class phoneBook {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    
    public static void print(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phone = new HashMap<>();
        addNumber("Васильев", 700001, phone);
        addNumber("Иванов", 700002, phone);
        addNumber("Гаврилов", 700003, phone);
        addNumber("Сидоров", 700004, phone);
        addNumber("Иванов", 700005, phone);
        addNumber("Васильев", 700006, phone);
        addNumber("Гаврилов", 700007, phone);
        addNumber("Сидоров", 700008, phone);
        print(phone);
    }
}