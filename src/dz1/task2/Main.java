package dz1.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Виведення на екран елементів List:
// Створити список, заповнити його на 10 елементів та вивести на екран вміст, використовуючи iterator.

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
