package dz3.task2;

// Створіть файл, запишіть у нього довільні дані та закрийте файл.
// Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        try (FileWriter fw = new FileWriter(file)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.write("Hello Java IO.\n");
            pw.write("Good bay.\n");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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
