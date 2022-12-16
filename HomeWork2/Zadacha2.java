// Дана последовательность целых чисел,
// оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        int sum = 0, numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        System.out.println("Введите числа:");
        numA = scanner.nextInt();
        while ((numB = scanner.nextInt()) != 0) {
            if ((numA > 0) && (numB < 0)) {
                sum++;
            }
            numA = numB;
        }
        scanner.close();
        System.out.println(sum);
    }
}