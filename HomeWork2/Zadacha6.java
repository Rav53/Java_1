//Дан массив целых чисел. Заменить отрицательные элементы
//на сумму индексов двузначных элементов массива.

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        int sum = 0, n, countDouble = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if (((mass[i] / 100) == 0) && (((mass[i] >= 10) && (mass[i] <= 99)) || ((mass[i] <= -10) && (mass[i] >= -99)))) {
                countDouble += i;
                System.out.println(countDouble);
            }
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = countDouble;
            }
            System.out.println(mass[i]);
        }
    }
}