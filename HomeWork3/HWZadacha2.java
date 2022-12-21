//2. Сведения о товаре состоят из наименования, страны-производителя,
// веса, цены, сорта. Получить наименования товаров заданного 
// сорта с наименьшей ценой.
import java.util.*;    
   
public class HWZadacha2 {

    public static void main(String[] args) {
        Zadacha2();   
    }
    public static void Zadacha2() {
        NewThings tovar1 = new NewThings("Часы", "Зимбабве", 125.0, 254.2, "Второй");
        NewThings tovar2 = new NewThings("Ручка", "Россия", 884.3, 255.5, "Первый");
        NewThings tovar3 = new NewThings("Кукла", "Казахстан", 366.1, 100.5, "Второй");
        NewThings tovar4 = new NewThings("Телефон", "Малазия", 500.0, 35.2, "Первый");
        NewThings tovar5 = new NewThings("Отвёртка", "Иран", 36.0, 36.4, "Первый");
        NewThings tovar6 = new NewThings("Газонокосилка", "Северный Полюс", 1.0, 2.0, "Первый");

        List<NewThings> listTovar = new ArrayList<>();
            listTovar.add(tovar1);
            listTovar.add(tovar2);
            listTovar.add(tovar3);
            listTovar.add(tovar4);
            listTovar.add(tovar5);
            listTovar.add(tovar6);

        String search = "Первый";

        double min = tovar1.getPrices();
        String SortName = null;
        String productName = null;
        for (NewThings tovar : listTovar) {
            if (tovar.getPrices() < min && tovar.getSort().equals(search)) {
                min = tovar.getPrices();
            }
            for (double i = 0.0; i <= tovar.getPrices(); i++)
                if (tovar.getPrices() == min && tovar.getSort().equals(search)) {
                    productName = tovar.getName();
                    SortName = tovar.getSort();
                }
        }
        System.out.println("Товар - " + productName +  ";  Сорт - " + SortName +
                ";\nФигня с самой низкой ценой, и вообще на него дисконт, бери не пожалеешь! = " + min);
    }
}