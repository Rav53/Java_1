//1) Подсчитать количество вхождения каждого слова
//Пример:Россия идет вперед всей планеты. Планета — это не Россия.
//toLoverCase().
import java.util.HashMap;
import java.util.Map;

public class Zadacha1 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета, это не Россия.";
        String[] new_str = str.toLowerCase().split("[. ]",  0);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String words : new_str) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } 
            else {
                map.put(words,1);
            }
        }
        System.out.println(map);
    }
}