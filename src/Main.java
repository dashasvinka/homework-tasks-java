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
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        TechnicalOperator operator = new TechnicalOperator();
        operator.getFlipArray(seasons);

        // Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
        ArrayOperator arrayOperator = new ArrayOperator();
        String[] people = new String[]{"Маша", "Паша", "Вика", "Лена", "Гена"};
        arrayOperator.printFlipArray(people);

        // Программа получает число n и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
        arrayOperator.dealingCardsInPoker(5);

        // Напишите алгоритм, который определит, сколько слов было передано
        arrayOperator.getAllWordsFromPhrase("Мама мыла раму рама мыла маму");

        // Создай ArrayList<String>. Добавь 100 строковых элементов. Реализуй метод для быстрого получения элемента по заданному индексу и выведи его на консоль.
        arrayOperator.getElementByIndex(100);

        // Создай LinkedList<Integer>. Добавь элементы в середину списка, удали первый и последний элемент, затем выведи обновленный список.
        arrayOperator.addElementInLinkedList();

        // Создай TreeSet<String>. Добавь несколько строк, включая строки с разными регистрами, и выведи их в отсортированном порядке.
        arrayOperator.sortElementsStructureTreeSet();

        // Создай PriorityQueue<Integer>. Добавь числа с различными приоритетами, затем извлеки и выведи элементы в порядке их приоритета.
        arrayOperator.getElementsBySuperHighPriority();

        // Создай TreeMap<Long, String>. Добавь записи с неупорядоченными ключами, убедись в их автоматической сортировке и выведи содержимое карты
        arrayOperator.autoSortElementsByKey();

        // Создай ArrayDeque<Boolean>. Добавь чередующиеся значения true и false, удали все элементы false с помощью итерации и выведи результат.
        arrayOperator.eliminateLies();

        // Создай Stack<Character>. Добавь символы, полностью очисти стек, затем проверь и выведи, пуст ли стек.
        arrayOperator.checkStackIsEmpty();

        // Создай коллекцию ArrayList<String>. Используя цикл for-each, выведи все элементы коллекции на консоль.
        arrayOperator.getAllElementsFromList();

        // Создай список LinkedList<Character>. Отсортируй символы в обратном алфавитном порядке с помощью Comparator и выведи на консоль.
        arrayOperator.customReverseSort();

        // Создай ArrayList<Integer>. Используя потоки (streams), отфильтруй числа больше 5 и выведи их.
        arrayOperator.filteringWithStreams();

        // Создай EnumSet<DayOfWeek>. Добавь несколько дней недели, выполни операции объединения и пересечения множеств и выведи результат.
        arrayOperator.getSubsetsOfDaysOfTheWeek();
    }
}