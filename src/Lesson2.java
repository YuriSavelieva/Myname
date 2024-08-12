/**
 * Task 1
 * Напишите программу, которая будет принимать на вход число из консоли и на выход
 * будет выводить сообщение четное число или нет. Для определения четности числа
 * используйте операцию получения остатка от деления (операция выглядит так: '% 2')
 */

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        int b = 0;
        if (a % 2 == b) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
        scanner.close();

    }
}




