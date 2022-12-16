//Дана последовательность N целых чисел. Найти количество положительных чисел,
// после которых следует отрицательное число.
import java.util.Scanner;

public class Zadacha1{
    public static void main(String[] args) {
        int sum = 0, n, numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        n = scanner.nextInt();
        System.out.println("Введите числа:");
        numA = scanner.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            numB = scanner.nextInt();
            if ((numA > 0) && (numB < 0)) {
                sum++;

            }
            numA = numB;
        }
        scanner.close();
        System.out.println(sum);
    }
}