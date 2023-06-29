package org.example;

public class VariablesTheme {
    public static void main(String[] args) {
        //Задание 1:
        byte numberOfCores = 4;
        short clockFrequency = 2100;
        int ramSize = 8;
        long hardDriveSize = 4096000000000L;
        float laptopScreenSizeIn = 15.6F;
        double laptopScreenSizeSm = 39.624;
        boolean isLaptop = true;
        char processorDesignation = 'H';
        System.out.println("Задание 1: Вывод характеристик компьютера (это название задачи).\n" + numberOfCores +
                " - количество ядер\n" + clockFrequency + " Гц - тактовая частота процессора\n" + ramSize
                + " - Гб ОЗУ\n" + hardDriveSize + " бит - объем жесткого диска\n" + laptopScreenSizeIn
                + " дюймов - диагональ экрана в дюймах\n" + laptopScreenSizeSm + " см - диагональ экрана в см\n" +
                isLaptop + " - это действительно ноутбук\n" + processorDesignation +
                " - обозначение процессора в линейке AMD\n");

        // Задание 2:
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        double totalWithoutDiscount = penPrice + bookPrice;
        double discountAmount = totalWithoutDiscount * discount;
        double totalWithDiscount = totalWithoutDiscount - discountAmount;
        System.out.println ("Задание 2: Расчет стоимости товара со скидкой\n" + totalWithoutDiscount +
                " у.е - общая стоимость товаров без скидки\n" + discountAmount + " у.е - сумма скидки\n" +
                totalWithDiscount + " у.е - общая стоимость товаров со скидкой\n");

        // Задание 3:
        System.out.println ("Задание 3: Вывод слова JAVA\n    J    a  v     v  a      \n    J   a a  v   v  a a     \n"
                + " J  J  aaaaa  V V  aaaaa     \n  JJ  a     a  V  a     a\n");

        // Задание 4:
        byte byteVar = Byte.MAX_VALUE;
        short shortVar = Short.MAX_VALUE;
        int intVar = Integer.MAX_VALUE;
        long longVar = Long.MAX_VALUE;
        System.out.println("Задание 4: Вывод min и max значений целых числовых типов\n" + "byte: " + (byteVar) + ", " +
                (++byteVar) + ", " + (--byteVar) + "\nshort: " + shortVar + ", " + (++shortVar) + ", " +
                (--shortVar) + "\nint: " + intVar + ", " + (++intVar) + ", " + (--intVar) + "\nlong: " + longVar + ", "
                + (++longVar) + ", " + (--longVar));

        // Задание 5:
        int x = 2;
        int y = 5;

        // С помощью третьей переменной
        int z = x;
        x = y;
        y = z;
        System.out.println("\nЗадание 5: Перестановка значений переменных.\n* Смена значений переменных с помощью" +
                " третьей переменной:\nИсходные значения: x = 2, y = 5\nНовые значения: x = " + x + ", y = " + y);

        // С помощью арифметических операций
        x += y; // 7
        y = x - y; // 5
        x -= y; // 2
        System.out.println("\n* Смена значений переменных с помощью арифметических операций:\nИсходные значения: " +
                "x = 5, y = 2\nНовые значения: x = " + x + ", y = " + y);

        // С помощью побитовой операции ^
        x ^= y; // 2=10, 5=101 | x = 111=7
        y = x ^ y; // y = 101=5
        x ^= y; // x = 10=2
        System.out.println("\n* Смена значений переменных с помощью побитовой операции ^: \nИсходные значения: x = 2, "
                + "y = 5\nНовые значения: x = " + x + ", y = " + y);

        // Задание 6: Вывод символов и их кодов.
        char charHash = '#';
        char charAmpersand = '&';
        char charAt = '@';
        char charCaret = '^';
        char charUnderscore  = '_';

        System.out.println("\nЗадание 6: Вывод символов и их кодов\n" + (int) charHash + "-" + charHash + "\n" +
                (int) charAmpersand + "-" + charAmpersand + "\n" + (int) charAt + "-" + charAt + "\n" + (int) charCaret
                + "-" + charCaret + "\n" + (int) charUnderscore + "-" + charUnderscore);

        // Задание 7
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char bracket = '(';
        char bracket2 = ')';

        System.out.println("\nЗадание 7: Вывод в консоль ASCII-арт Дюка:\n    " + slash + backslash + "  " + "\n"
                + "   " + slash + "  " + backslash + "\n" +  "  " + slash + underscore + bracket + " " + bracket2 +
                backslash + "\n" + " " + slash + "      " + backslash + "\n" + slash + underscore + underscore +
                underscore + underscore + slash + backslash + underscore + underscore + backslash);

        // Задание 8:
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10; // 123/10 = 12. 12%10 = 2 (остаток)
        int units = number % 10; // 3
        int sum = hundreds + tens + units; // 1+2+3=6
        int product = hundreds * tens * units; // 6

        System.out.println("\nЗадание 8: Вывод количества сотен, десятков и единиц числа:\nЧисло " + number +
                " содержит: \n" + hundreds + " - кол-во сотен;\n" + tens + " - кол-во десятков;\n" + units +
                " - кол-во единиц;\nСумма его цифр = " + sum + ";\nПроизведение = " + product);

        // Задание 9:
        int seconds = 86399;
        int hours = seconds / 3600; // 23
        int minutes = (seconds % 3600) / 60; // 3599/60=59
        int remainingSeconds = seconds % 60; // 59

        System.out.println("\nЗадание 9: Вывод времени\nОтвет: " + hours + ":" + minutes + ":" + remainingSeconds);
    }

}

