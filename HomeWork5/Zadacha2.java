//Подсчитать количество искомого слова,
//через map (наполнением значение,
//где искомое слово будет являться ключом)
import java.util.HashMap;
import java.util.Map;

public class Zadacha2 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss";
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i),0);
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        for (var entry : map.entrySet()) {
            System.out.println("буква - "+entry.getKey()+" , встретилась: "+entry.getValue());
        }
    }
}
    