package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;
import java.util.stream.IntStream;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введіть числа1");
        int sum = 0;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            sum = sum + x;
        }
        System.out.println("сума ваших чисел дорівнює "+sum);
        boolean isExit = false;
            while (!isExit) {
                break;
            }
        }
    }
