import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Задача 2");
        Set<Integer> uniqueNumbers = new TreeSet<>(nums);
        for (Integer num : uniqueNumbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                Integer numbers = map.get(string);
                map.put(string, numbers + 1);
            }else {
                map.put(string, 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 1) {
                System.out.println(stringIntegerEntry.getKey());
            }
        }
        System.out.println("Задача 4");
        for (Integer value : map.values()) {
            System.out.println(value);

        }


    }
}