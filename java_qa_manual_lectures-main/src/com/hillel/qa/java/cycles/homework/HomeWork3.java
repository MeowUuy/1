package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
        int a = 0, sum = 0;
        while (a <= 100) {
            if ((a % 3) > 0)
                sum += a;
            a++;
            continue;
        }
        System.out.println(sum);
    }
}