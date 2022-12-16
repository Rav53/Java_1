// Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Zadacha3 {
    public static void main(String[] args) {
        out.println(findPrimeNumbers(30));
    }

    private static List findPrimeNumbers(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        int sum = 0;
        for (int i = 2; i * i < n; i++) {

            if (primes[i]) {
                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
            sum = primeNumbers.stream().mapToInt(Integer::intValue).sum();
        }
        System.out.println("Сумма простых чисел = " + sum);
        System.out.println("Список простых чисел: ");
        return primeNumbers;

    }

}