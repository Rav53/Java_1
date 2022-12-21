//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг,
// в которых простое количество страниц,
// фамилия автора содержит «А» и год издания не позднее 2010 г.

import java.util.*;

public class HMZadacha3 {
    public static void main(String[] args) {
        Zadacha3();
    }

    private static void Zadacha3() {

        Knigi kniga1 = new Knigi("Zazerkale", "Axmatova", 1050.00, 1975, 350);
        Knigi kniga2 = new Knigi("Harry Potter", "Azimov", 250.00, 1991, 211);
        Knigi kniga3 = new Knigi("Piter Pen", "Petrov", 450.00, 1980, 131);
        Knigi kniga4 = new Knigi("Zayac", "Chigikov", 865.00, 1995, 543);
        Knigi kniga5 = new Knigi("Funtik", "Averkin", 3000.00, 2005, 367);
        Knigi kniga6 = new Knigi("Avengers", "Zukov", 754.00, 1989, 813);

        List<Knigi> listKnigi = new ArrayList<>();

        listKnigi.add(kniga1);
        listKnigi.add(kniga2);
        listKnigi.add(kniga3);
        listKnigi.add(kniga4);
        listKnigi.add(kniga5);
        listKnigi.add(kniga6);

        int result;
        boolean bol = true;

        System.out.println("Книги в которых простое количество страниц,\n" +
        "фамилия автора содержит 'А' и дата выхода издания ранее 2010 г.: ");
        for (Knigi knigi : listKnigi) {
            result = knigi.getNumbers_of_pages();
            for (int i = 2; i < result; i++) {
                if (result % i == 0) {
                    bol = false;
                    break;
                } else {
                    bol = true;
                }
            }
            if ((knigi.getDate_of_publication() <= 2010) && (bol) && knigi.getAuthor().contains("A"))

                System.out.println(knigi.getKniga_name());
        }

    }

}