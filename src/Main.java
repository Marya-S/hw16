import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Задание 1 *****");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer element : nums) {
            if (element % 2 > 0) {
                System.out.println(element);
            }
        }

        System.out.println("***** Задание 2 *****");
        List<Integer> numsTwo = new ArrayList<>(List.of(1, 1, 2, 3, 8, 4, 4, 5, 5, 6, 7));
        SortedSet<Integer> numberSet = new TreeSet<>(numsTwo);
        System.out.println(numberSet);

        System.out.println("***** Задание 3 *****");
        List<String> stringList = new ArrayList<>(List.of("Персик", "Ананс", "Арбуз", "Клубника", "Персик", "Вишня", "Арбуз", "Персик"));
        Set<String> fruitsList = new HashSet<>(stringList);
        System.out.println(fruitsList);

        System.out.println("***** Задание 4 *****");
        List<String> fruitList = new ArrayList<>(List.of("Персик", "Ананс", "Арбуз", "Клубника", "Персик", "Вишня", "Арбуз", "Персик"));
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String fruit : fruitList) {
            if (frequencyMap.containsKey(fruit)) {
                frequencyMap.put(fruit, frequencyMap.get(fruit) + 1);
            } else {
                frequencyMap.put(fruit, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}