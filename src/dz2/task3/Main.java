package dz2.task3;

// Мінімальне з N чисел (використовувати LinkedList):
//1. Введіть із клавіатури число N.
//2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
//3. Знайти мінімальне число серед елементів списку – метод getMinimum.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        List<Integer> integerList = new LinkedList<>();
        System.out.print("Введіть кількість елементів: ");
        N = in.nextInt();
        getIntegerList(integerList, N, in);
        System.out.println("Найменше число в колекції: " + getMinimum(integerList));
    }

    public static void getIntegerList(List<Integer> list, int count, Scanner in) {
        for (int i = 0; i < count; i++) {
            System.out.print("Введіть ціле число:");
            list.add(in.nextInt());
        }
    }

    public static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }
}
