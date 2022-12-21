import java.util.*;

//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
// название которых содержит «высший».
public class HWZadacha1 {

    public static void main(String[] args) {
        Zadacha1();
    }
    public static void Zadacha1() {
        Things tovar1 = new Things("Часы", 300.6, "первый");
        Things tovar2 = new Things("Высший Ручка", 200.8, "второй");
        Things tovar3 = new Things("Высший Кукла", 30.5, "первый");
        Things tovar4 = new Things("Телефон", 11.5, "второй");
        Things tovar5 = new Things("Высший Отвёртка", 25.5, "первый");
        Things tovar6 = new Things("Газонокосилка", 100.3, "второй");


        List<Things> listThings = new ArrayList<>();

        listThings.add(tovar1);
        listThings.add(tovar2);
        listThings.add(tovar3);
        listThings.add(tovar4);
        listThings.add(tovar5);
        listThings.add(tovar6);

        String search1 = "первый";
        String search2 = "второй";

        double max = 0.0;
        for (Things tovar : listThings) {
            if ((tovar.getName().contains("Высшый"))
            && tovar.getSort().equals(search1)
            || tovar.getSort().equals(search2))
                for (double i = 0; i < tovar.getPrice(); i++) {
                    if (tovar.getPrice() > max)
                        max = tovar.getPrice();
                }
        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта среди всех,\n" +
            "в названии которого содержится слово - Высший, составляет: " + max);
    }
}