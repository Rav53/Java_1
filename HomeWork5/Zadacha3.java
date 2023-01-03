//3) Найти пересечения слов в массивах и указать их общее количество.
//Пример:
//mas1= [“qwe”,”asd”,”qwe”,”x”]
//mas2=[“qwe”,”v”]
//Результат:
//qwe=3
import java.util.HashMap;
import java.util.Map;

public class Zadacha3 {
    public static void main(String[] args) {
        String[] mass1 = {"qwe", "asd", "qwe", "x"};
        String[] mass2 = {"qwe", "v"};
        Map<String, Integer> map = new HashMap<>();
        for (String elem1 : mass1) {
            map.put(elem1, 1);
            for (String elem2 : mass2) {
                if (map.containsKey(elem2)) {
                    map.put(elem2, (map.get(elem2) + 1));
                }
            }
            if (map.get(elem1) == 1) {
                map.remove(elem1);
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("Cлово '" + entry.getKey() + "', " + "встречается в массивах " + entry.getValue() + " раза");
        }
    }
}