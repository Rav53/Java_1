package Converter;

import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях: ");
        double temperature = scanner.nextInt();
        scanner.close();
        Converter kelvin = new kelvinConverter();
        Converter fahrenheit = new fahrenheitConverter();
        
        // System.out.println("Цельсий t  = " + new celsiusConverter().convertVolue(temperature));
        // System.out.println("Цельсий в Кельвин = " + new kelvinConverter().convertVolue(temperature));
        // System.out.println("Цельсий в Фарингейт = " + new fahrenheitConverter().convertVolue(temperature));
        System.out.println("Цельсий в Кельвин = " + kelvin.convertValue(temperature));
        System.out.println("Цельсий в Фарингейт = " + fahrenheit.convertValue(temperature));
    }
}