//Дан массив целых чисел. Найти сумму элементов,
//у которых последняя и предпоследняя цифры равны.

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            if ((mass[i] % 10) == ((mass[i] / 10) % 10)) {
                sum += mass[i];
            }
        }
        System.out.println(sum);
    }
}
