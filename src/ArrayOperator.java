import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperator {

    // Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
    // Не используйте дополнительный массив для хранения результатов.
    //https://vertex-academy.com/tutorials/ru/kak-pomenyat-elementy-massiva-v-obratnom-poryadke-java/

    public void printFlipArray(String[] arrayName) {
        int position = arrayName.length;
        int result = position / 2;
        int i = arrayName.length - 1;
        for (int k = 1; k <= result; k++) {
            var a = arrayName[k - 1];
            var b = arrayName[i];
            arrayName[i] = a;
            arrayName[k - 1] = b;
            i--;
        }
        for (int l = 0; l < position; l++) {
            System.out.println(arrayName[l]);
        }
    }

    // Напишите программу, которая должна имитировать раздачу карт для игры в покер.
    // Программа получает число n и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
    // https://vertex-academy.com/tutorials/ru/razdacha-kart-v-pokere-java/
    public void dealingCardsInPoker(int peopleCount) {
        String[] pokerCards = new String[]{
                "Пики туз",
                "Пики 2",
                "Пики 3",
                "Пики 4",
                "Пики 4",
                "Пики 5",
                "Пики 6",
                "Пики 7",
                "Пики 8",
                "Пики 9",
                "Пики 10",
                "Пики валет",
                "Пики дама",
                "Пики король",
                "Черви туз",
                "Черви 2",
                "Черви 3",
                "Черви 4",
                "Черви 5",
                "Черви 6",
                "Черви 7",
                "Черви 8",
                "Черви 9",
                "Черви 10",
                "Черви валет",
                "Черви дама",
                "Черви король",
                "Трефы туз",
                "Трефы 2",
                "Трефы 3",
                "Трефы 4",
                "Трефы 5",
                "Трефы 6",
                "Трефы 7",
                "Трефы 8",
                "Трефы 9",
                "Трефы 10",
                "Трефы валет",
                "Трефы дама",
                "Трефы король",
                "Бубны туз",
                "Бубны 2",
                "Бубны 3",
                "Бубны 4",
                "Бубны 5",
                "Бубны 6",
                "Бубны 7",
                "Бубны 8",
                "Бубны 9",
                "Бубны 10",
                "Бубны валет",
                "Бубны король",
                "Джокер",
                "Джокер",
                "Джокер"
        };
        List<String> pokerCardsList = new ArrayList<>(Arrays.asList(pokerCards));
        Collections.shuffle(pokerCardsList);
        String[] shuffledCards = pokerCardsList.toArray(new String[0]);
        int cardPosition = 0;
        if ((peopleCount <= 0) || (peopleCount > 10)) {
            System.out.println("Указано недопустимое количество игроков");
        } else {
            for (int k = 1; k <= peopleCount; k++) {
                System.out.println("Выдаем игроку №" + k + " следующий набор карт:");
                System.out.println(shuffledCards[cardPosition] + " " + shuffledCards[cardPosition + 1] + " " + shuffledCards[cardPosition + 2] + " " + shuffledCards[cardPosition + 3] + " " + shuffledCards[cardPosition + 4]);
                cardPosition = cardPosition + 5;
            }
        }
    }

    // Напишите алгоритм, который определит, сколько слов было передано
    // https://vertex-academy.com/tutorials/ru/kak-opredelit-kolichestvo-slov-v-stroke-java/
    public void getAllWordsFromPhrase(String phrase) {
        String[] words = phrase.split(" ");
        int total = words.length;
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Итого слов: " + total);
    }

    // Task 1. List
    // ArrayList - Быстрый доступ по индексу
    // Создай ArrayList<String>. Добавь 100 строковых элементов. Реализуй метод для быстрого получения элемента по заданному индексу и выведи его на консоль.

    public void getElementByIndex(int index) {
        ArrayList<String> lotPosition = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lotPosition.add("Позиция " + i);
        }
        if ((index < 0) || (index >= 100)) {
            System.out.println("Недопустимый индекс, индекс должен быть более 0 и менее 100");
        } else {
            System.out.println(lotPosition.get(index));
        }
    }

    // Task 1. List
    // LinkedList - Эффективные вставки и удаления
    // Создай LinkedList<Integer>. Добавь элементы в середину списка, удали первый и последний элемент, затем выведи обновленный список.

    public void addElementInLinkedList() {
        LinkedList<Integer> startList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            startList.add(i);
        }
        System.out.println("Наш стартовый список: " + startList);
        for (int a = 1; a <= 3; a++) {
            startList.add(startList.size() / 2, a);
        }
        startList.removeFirst();
        startList.removeLast();
        System.out.println("Наш финальный список после манипуляций: " + startList);
    }

    // Task 2. Set
    // TreeSet - Естественная сортировка и упорядочивание
    // Создай TreeSet<String>. Добавь несколько строк, включая строки с разными регистрами, и выведи их в отсортированном порядке.

    public void sortElementsStructureTreeSet() {
        TreeSet<String> coffeeVibe = new TreeSet<>();
        coffeeVibe.add("кофе");
        coffeeVibe.add("кофетерия");
        coffeeVibe.add("Кофемания");
        coffeeVibe.add("кофеварка");
        coffeeVibe.add("Сварщица");
        coffeeVibe.add("yankeesierra");
        coffeeVibe.add("Yankee Sierra");
        coffeeVibe.add("Шоколадница");
        for (String element : coffeeVibe) {
            System.out.println(element);
        }
    }

    // Task 4. Queue
    // PriorityQueue - Очередь с приоритетами
    // Создай PriorityQueue<Integer>. Добавь числа с различными приоритетами, затем извлеки и выведи элементы в порядке их приоритета.
    public void getElementsBySuperHighPriority() {
        PriorityQueue<Integer> queueWithSuperHighPriority = new PriorityQueue<>(Comparator.reverseOrder());
        queueWithSuperHighPriority.add(19);
        queueWithSuperHighPriority.add(0);
        queueWithSuperHighPriority.add(78);
        queueWithSuperHighPriority.add(22);
        queueWithSuperHighPriority.add(56);
        queueWithSuperHighPriority.add(115);
        queueWithSuperHighPriority.add(5);
        while (!queueWithSuperHighPriority.isEmpty()) {
            System.out.println(queueWithSuperHighPriority.poll());
        }
    }

    // Task 3. Map
    // TreeMap - Сортировка по ключам
    // Создай TreeMap<Long, String>. Добавь записи с неупорядоченными ключами, убедись в их автоматической сортировке и выведи содержимое карты
    public void autoSortElementsByKey() {
        TreeMap<Long, String> rainbowColors = new TreeMap<>();
        rainbowColors.put(6L, "Сидит - синий");
        rainbowColors.put(4L, "Знать - зеленый");
        rainbowColors.put(1L, "Каждый - красный");
        rainbowColors.put(3L, "Желает - желтый");
        rainbowColors.put(7L, "Фазан - фиолетовый");
        rainbowColors.put(5L, "Где - голубой");
        rainbowColors.put(2L, "Охотник -оранжевый");
        for (Long key : rainbowColors.keySet()) {
            System.out.println(rainbowColors.get(key) + " у него ключ: " + key);
        }
    }

    // Task 5. Deque
    // ArrayDeque с фильтрацией
    // Создай ArrayDeque<Boolean>. Добавь чередующиеся значения true и false, удали все элементы false с помощью итерации и выведи результат.
    public void eliminateLies() {
        ArrayDeque<Boolean> dequeWithTrueAndFalse = new ArrayDeque<>();
        dequeWithTrueAndFalse.add(true);
        dequeWithTrueAndFalse.add(true);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(true);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(true);
        dequeWithTrueAndFalse.add(false);
        dequeWithTrueAndFalse.add(true);

        Iterator<Boolean> iterator = dequeWithTrueAndFalse.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == false) {
                iterator.remove();
            }
        }

        System.out.println("Получаем только чистую правду: " + dequeWithTrueAndFalse);
    }

    // Task 6. Stack
    // Stack - Полное очищение стека
    // Создай Stack<Character>. Добавь символы, полностью очисти стек, затем проверь и выведи, пуст ли стек.

    public void checkStackIsEmpty() {
        Stack<Character> stackWithCharacter = new Stack<>();

        stackWithCharacter.push('l');
        stackWithCharacter.push('2');
        stackWithCharacter.push('m');
        stackWithCharacter.push('5');
        stackWithCharacter.push(';');
        stackWithCharacter.push('r');
        stackWithCharacter.push('&');

        while (!stackWithCharacter.isEmpty()) {
            stackWithCharacter.pop();
        }

        if (stackWithCharacter.isEmpty()) {
            System.out.println("Ура! Задание выполнено успешно - стек пуст");
        } else {
            System.out.println("Оу ноу! Что-то пошло не так... кажется в стеке остались элементы");
        }
    }

    // Task 7. Iterable
    // ArrayList и цикл for-each - Простая итерация
    // Создай коллекцию ArrayList<String>. Используя цикл for-each, выведи все элементы коллекции на консоль.
    public void getAllElementsFromList() {

        ArrayList<String> menu = new ArrayList<>();
        menu.add("Пицца");
        menu.add("Бургер");
        menu.add("Суши");
        menu.add("Роллы");
        menu.add("Суп");
        menu.add("Салат");
        menu.add("Паста");
        menu.add("Бутерброд");

        for (String dish : menu) {
            System.out.println(dish);
        }
    }

    // Task 8. Comparable и Comparator
    // Custom Comparator для обратной сортировки
    // Создай список LinkedList<Character>. Отсортируй символы в обратном алфавитном порядке с помощью Comparator и выведи на консоль.
    public void customReverseSort() {
        LinkedList<Character> charactersForSort = new LinkedList<>();

        charactersForSort.add('K');
        charactersForSort.add('L');
        charactersForSort.add('N');
        charactersForSort.add('Q');
        charactersForSort.add('P');
        charactersForSort.add('O');
        charactersForSort.add('Y');
        charactersForSort.add('T');

        Collections.sort(charactersForSort, new Comparator<Character>() {
            @Override
            public int compare(Character Y, Character Z) {
                return Z.compareTo(Y);
            }
        });

        System.out.println("Отсортировали в обратном алфавитному порядке: " + charactersForSort);
    }

    // Task 9. Streams и Lambda
    // Фильтрация с использованием потоков
    // Создай ArrayList<Integer>. Используя потоки (streams), отфильтруй числа больше 5 и выведи их.
    public void filteringWithStreams() {
        ArrayList<Integer> streamWithInt = new ArrayList<>();

        streamWithInt.add(2);
        streamWithInt.add(16);
        streamWithInt.add(5);
        streamWithInt.add(6);
        streamWithInt.add(1);
        streamWithInt.add(4);
        streamWithInt.add(10);
        streamWithInt.add(3);

        ArrayList<Integer> filterStreamWithInt = streamWithInt.stream().filter(n -> n > 5).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Мы восхитительны, ведь мы получили коллекцию элементов, где все больше 5: " + filterStreamWithInt);
    }

    // Task 10. Другие коллекции
    // EnumSet для работы с перечислениями
    // Создай EnumSet<DayOfWeek>. Добавь несколько дней недели, выполни операции объединения и пересечения множеств и выведи результат.
    public void getSubsetsOfDaysOfTheWeek() {
        enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

        EnumSet<DayOfWeek> workDays = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);
        EnumSet<DayOfWeek> workOutDays = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY);
        EnumSet<DayOfWeek> weekendDays = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        EnumSet<DayOfWeek> studyDays = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY, DayOfWeek.MONDAY);

        Set<DayOfWeek> allWeekDays = EnumSet.copyOf(workDays);
        allWeekDays.addAll(weekendDays);
        System.out.println("Все дни недели: " + allWeekDays);

        Set<DayOfWeek> workOutAndStudyDays = EnumSet.copyOf(workOutDays);
        workOutAndStudyDays.retainAll(studyDays);
        System.out.println("Дни недели, в которые я учусь и хожу на тренировку: " + workOutAndStudyDays);
    }

    // Task 2. Set
    // TreeSet - LinkedHashSet - Сохранение порядка вставки
    // Создай LinkedHashSet<Character>. Добавь символы в определённом порядке, включая повторяющиеся, и выведи множество, показывая сохранённый порядок без дубликатов.
    public void printSaveCharacter() {
        Set<Character> letters = new LinkedHashSet<>();
        letters.add('y');
        letters.add('k');
        letters.add('p');
        letters.add('y');
        letters.add('m');
        letters.add('l');
        letters.add('k');
        letters.add('z');
        letters.add('o');
        System.out.println("Выводим список без дубликатов: " + letters);
    }

    // Task 3. Map
    // LinkedHashMap - Предсказуемый порядок итерации
    // Создай LinkedHashMap<Character, Boolean>. Добавь записи в определённом порядке, обнови некоторые значения и выведи карту, демонстрируя порядок вставки.
    public void printSaveLinkedHashMapCharacter() {
        Map<Character, Boolean> trueLetters = new LinkedHashMap<>();

        trueLetters.put('y', false);
        trueLetters.put('k', true);
        trueLetters.put('p', true);
        trueLetters.put('m', false);
        trueLetters.put('l', true);
        trueLetters.put('o', true);
        trueLetters.put('z', false);
        System.out.println("Выводим список до изменения: " + trueLetters);

        trueLetters.put('y', true);
        trueLetters.put('k', false);
        System.out.println("Выводим список после изменения: " + trueLetters);
    }

    // Task 4. Queue
    // LinkedList как очередь - Двунаправленная очередь
    // Создай LinkedList<String> и используй её как очередь. Добавь элементы, извлеки первый и последний элементы, затем выведи оставшуюся очередь.
    public void printDuoQueue() {
        List<String> visitors = new LinkedList<>();
        for (int i = 1; i <= 11; i++) {
            visitors.add("Пациент " + i);
        }
        System.out.println("Очередь до начала приема первого с начала и с конца: " + visitors);
        int queue = visitors.size();
        int lastPatient = queue - 1;
        visitors.remove(lastPatient);
        visitors.remove(0);
        System.out.println("Очередь после приема первого и последнего пациентов: " + visitors);
    }

    // Task 4. Queue
    // ArrayDeque - Высокопроизводительная двусторонняя очередь
    // Создай ArrayDeque<Character>. Добавь символы в начало и конец дека, удали элементы с обеих сторон и выведи оставшиеся символы.
    public void printHighPerformanceTwoWayQueue() {
        ArrayDeque<Character> letters = new ArrayDeque<>();

        letters.addFirst('l');
        letters.addLast('r');
        letters.addFirst('t');
        letters.addLast('k');
        letters.addLast('m');
        letters.addFirst('p');

        System.out.println("Добавили в очередь по несколько символов в начало и в конец: " + letters);

        letters.removeFirst();
        letters.removeLast();

        System.out.println("Удалили из очереди первый и последний элемент: " + letters);
    }

    // Task 5. Deque
    // ArrayDeque - Эффективные операции добавления и удаления с обоих концов
    // Создай ArrayDeque<String>. Добавь элементы в обе части дека, удали первый и последний элементы и выведи оставшиеся элементы.
    public void printVegetableArrayDequeString() {
        ArrayDeque<String> vegetablePlate = new ArrayDeque<>();
        vegetablePlate.addFirst("огурец");
        vegetablePlate.addLast("помидор");
        vegetablePlate.addFirst("перец");
        vegetablePlate.addLast("морковка");
        vegetablePlate.addFirst("сельдерей");
        vegetablePlate.addLast("зелень");
        vegetablePlate.addFirst("редис");
        vegetablePlate.addLast("капуста");
        System.out.println("Наполнили салатную тарелку с разных краев : " + vegetablePlate);

        vegetablePlate.removeFirst();
        vegetablePlate.removeLast();
        System.out.println("Съели крайние овощи : " + vegetablePlate);
    }

    // Task 5. Deque
    // LinkedList как Deque - Гибкость реализации
    // Создай LinkedList<Long> и используй её как дек. Добавь несколько элементов с обеих сторон, получи элемент по индексу и выведи его.
    public void printLinkedListLong() {
        LinkedList<Long> fatigueLevel = new LinkedList<>();
        fatigueLevel.addFirst(1L);
        fatigueLevel.addLast(2L);
        fatigueLevel.addFirst(3L);
        fatigueLevel.addLast(4L);
        fatigueLevel.addLast(5L);
        fatigueLevel.addLast(6L);
        fatigueLevel.addLast(7L);
        System.out.println("Градации усталости: " + fatigueLevel);

        Long actualFatigue = fatigueLevel.get(3);
        System.out.println("Я где-то устал на четверочку: " + actualFatigue);
    }

    // Задача: По переданной строке определите, является ли она палиндромом
    // Верно ли, что она одинаково читается слева направо и справа налево
    // Версия 1
    public static Boolean checkIsPalindromeFirstVersion(String valueToCheck) {
        String valueToCheckWithOutSpace = valueToCheck.replace(" ", "");
        String valueToCheckWithOutSpaceAndLowerCase = valueToCheckWithOutSpace.toLowerCase();
        String valueToCheckWithOutSpaceAndPunctuationMarksLowerCase = valueToCheckWithOutSpaceAndLowerCase.replaceAll("[\\p{P}-]", "");
        int valueSize = valueToCheckWithOutSpaceAndPunctuationMarksLowerCase.length();
        String resultToCheck = "";
        for (int i = 0; i < valueSize; i++) {
            char charFromPhrase = valueToCheckWithOutSpaceAndPunctuationMarksLowerCase.charAt(valueSize - i - 1);
            resultToCheck =  resultToCheck + charFromPhrase;
            System.out.println(resultToCheck);
        }
        if (resultToCheck.equals(valueToCheckWithOutSpaceAndPunctuationMarksLowerCase)) {
            System.out.println("строки одинаковые");
            return true;
        } else {
            System.out.println("строки разные");
            return false;
        }
    }

    // Задача: По переданной строке определите, является ли она палиндромом
    // Верно ли, что она одинаково читается слева направо и справа налево
    // Версия 2
    public static Boolean checkIsPalindromeSecondVersion(String valueToCheck) {

        String cleanedValue = valueToCheck.replace(" ", "").toLowerCase().replaceAll("[\\p{P}]", "");
        StringBuilder reversedValue = new StringBuilder(cleanedValue).reverse();
        if (cleanedValue.contentEquals(reversedValue)) {
            System.out.println("строки одинаковые");
            return true;
        } else {
            System.out.println("строки разные");
            return false;
        }
    }

    // Задача: По переданной строке определите, является ли она палиндромом
    // Верно ли, что она одинаково читается слева направо и справа налево
    // Версия 3
    public static Boolean checkIsPalindromeThirdVersion(String valueToCheck) {
        String cleanedValue = valueToCheck.replace(" ", "").toLowerCase().replaceAll("[\\p{P}]", "");

        int left = 0;
        int right = cleanedValue.length() - 1;

        while (left < right) {
            if (cleanedValue.charAt(left) != cleanedValue.charAt(right)) {
                System.out.println("строки разные");
                return false;
            }
            left++;
            right--;
        }

        System.out.println("строки одинаковые");
        return true;
    }
}
