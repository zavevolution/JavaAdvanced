package dz2.task4;

// Програма визначає, яка сім'я (прізвище) живе у місті:
//Приклад введення:
//· Москва
//· Іванови
//· Київ
//· Петрови
//· Лондон
//· Абрамовичі

//Приклад введення:
//· Лондон
//Приклад виведення:
//· Абрамовичі

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Заповніть базу даних іменами і містами:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Введіть місто: ");
            String key = in.next();
            System.out.print("Введіть прізвище: ");
            String value = in.next();
            hashMap.put(key, value);
        }
        System.out.print("Щоб взнати прізвище, введіть місто проживання: ");
        String key = in.next();
        System.out.println(hashMap.get(key));
    }
}
