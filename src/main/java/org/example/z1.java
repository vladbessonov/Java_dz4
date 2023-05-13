package org.example;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример: 1 -> 2->3->4
 * Вывод: 4->3->2->1
 */
public class z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Исходный список ");
        Deque<Integer> ourDeque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            ourDeque.add(i);
        }
        System.out.println(ourDeque);

        System.out.println("Перевернутый список");
        while (ourDeque.size() > 0) {
            System.out.print(ourDeque.pollLast() + " ");
        }
    }
}
