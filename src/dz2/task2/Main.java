package dz2.task2;

// Використовуючи колекцію, підвійте слово:
//1. Введіть із клавіатури 5 слів до списку рядків.
//2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
//3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть 5 слів у базу даних.");
        for (int i = 1; i < 6; i++) {
            System.out.print("Введіть слово №" + i + ": ");
            stringList.add(in.next());
        }

        doubleValues(stringList);

        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public static void doubleValues(List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) list.add(i, list.get(i));
            else list.add(i + i, list.get(i + i));
        }
    }
}
