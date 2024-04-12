package dz3.task3;

// Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
// Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.

public class Main {
    public static void main(String[] args) {
        String s = "Sed luctus consequat felis at blandit. Praesent at orci eget velit porta varius.";
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
