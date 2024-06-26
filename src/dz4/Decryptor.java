package dz4;

// Напишіть жартівливу програму «Дешифратор»,
// яка в текстовому файлі могла б замінити всі прийменники слово «Java».

// За кілька годин почнеться вистава. (за)
// На моєму подвір'ї ростуть квіти. (на)
// Біля площі люди зібрались на мітинг. (біля, на)
// Від моєї подружки ніколи не дочекаєшся ніжності. (від)
// Мій однокласник запросив мене у кіно. (у)
// З третьої до четвертої години у цій установі перерва. (з, до, у)
// Після уроків ми збираємось погуляти з друзями. (після, з)
// Через річку розкинувся місточок. (через)
// Без ниток я не зможу зашити свою сукню. (без)
// Я дуже часто думала про нашу Батьківшину. (про)

public class Decryptor {
    public static void main(String[] args) {
        String[] strings = {"За кілька годин почнеться вистава",
                "На моєму подвір'ї ростуть квіти.",
                "Біля площі люди зібрались на мітинг.",
                "Від моєї подружки ніколи не дочекаєшся ніжності.",
                "Мій однокласник запросив мене у кіно.",
                "З третьої до четвертої години у цій установі перерва.",
                "Після уроків ми збираємось погуляти з друзями.",
                "Через річку розкинувся місточок.",
                "Без ниток я не зможу зашити свою сукню.",
                "Я дуже часто думала про нашу Батьківшину."
        };

        for (var s : strings)
            System.out.println(decrypt(s));
    }

    public static String decrypt(String s) {
        return s.replaceAll("Біля | На | За | Від | у | З | до | після | Через | Без | про", " Java ");
    }
}
