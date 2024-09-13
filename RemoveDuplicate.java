import java.util.*;

public class RemoveDuplicate {

    public static List<String> filterUnique(List<String> datas) {
        Map<String, String> dataNotDuplicate = new LinkedHashMap<>();

        for (String current : datas) {
            String wordLowerCase = current.toLowerCase();
            
            dataNotDuplicate.putIfAbsent(wordLowerCase, current);
        }

        return new ArrayList<>(dataNotDuplicate.values());
    }

    public static void main(String[] args) {
        // Test cases with List<String>
        List<String> case1 = Arrays.asList("a", "B", "c", "A", "b", "C");
        List<String> case2 = Arrays.asList("apple", "banana", "Apple", "Banana", "APPLE", "BANANA");
        List<String> case3 = Arrays.asList("Car", "Bike", "car", "BIKE", "CAR", "bike");
        List<String> case4 = Arrays.asList("A", "B", "C", "a", "b", "c");
        List<String> case5 = Arrays.asList("apple", "banana", "carrot", "APPLE", "BANANA", "CARROT", "apple", "banana", "carrot");

        System.out.println(filterUnique(case1));  
        System.out.println(filterUnique(case2));  
        System.out.println(filterUnique(case3));  
        System.out.println(filterUnique(case4));  
        System.out.println(filterUnique(case5));  
    }
}
