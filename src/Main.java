public class Main {
    public static void main(String[] args) {

        // Задание https://www.examclouds.com/ru/java/java-core-russian/lesson10-tasks
        // Интерфейсы и перечисления. Задание Интерфейс Printable

        Printable[] wastePaper = {
                new Book("Старик и море"),
                new Magazine("Гламур"),
                new Book("Война и мир"),
                new Book("Похороните меня за плинтусом"),
                new Magazine("Плейбой")
        };

        for (Printable printable : wastePaper) {
            printable.print();
            System.out.println(" ");
        }

        // Задача 7 https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
        // Напишите программу, которая инвертирует массив (меняет порядок элементов на противоположный).
        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        TechnicalOperator operator = new TechnicalOperator();
        operator.getFlipArray(seasons);
    }
}