//Определить является ли список знакочередующимся? (без массивов)
import java.util.LinkedList;
import java.util.Scanner;


public class Zadacha2 {
    public static void main(String[] args) {

    LinkedList<Integer> integerLinkedList = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int numA;
            int numB;
            boolean condition = true;   
            System.out.println("введите размер списка:");
            int number = scanner.nextInt();
            System.out.println("введите значения каждого элемента списка:");
            numA = scanner.nextInt();
            integerLinkedList.add(numA);
            for (int i = 1; i <= number - 1; i++) {
            numB = scanner.nextInt();
            integerLinkedList.add(numB);
                if (((numA > 0) && ((numB * (-1)) < 0)) || ((numA < 0) && ((numB * (-1)) > 0))) {
                    condition = false;
                }
                numA = numB;
            }
            System.out.print("список знакочередующийся - " + condition);
        }
        
    }
}