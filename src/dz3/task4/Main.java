package dz3.task4;

// Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
// Виведіть на екран вміст файлу.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        fr.close();
        br.close();
    }
}
