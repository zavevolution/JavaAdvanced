package dz2.task5;

// Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
//1. Створити перелік рядків.
//2. Ввести рядки з клавіатури та додати їх до списку.
//3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
//4. Вивести рядки на екран, кожен з нового рядка.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = "";

        while (true) {
            System.out.print("Введіть новий рядок, 'end' щоб вийти: ");
            str = in.nextLine();
            if (str.equals("end")) break;
            list.add(str);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
