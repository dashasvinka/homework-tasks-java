package newTasks;

import java.util.*;

public class StringTasks {

    // Задача 1: в двух строках найти только уникальные значения и вывести их
    // Пример: "banana apple mango", "house Banana java"
    // Алгоритм:
    // - соединяем две строки в одну через пробел
    // - разделяем их по пробелу на массив
    // - в HashMap записываем каждое слово и количество его упоминаний
    // - в финальный массив записываем только встречающиеся один раз

    public static String[] getUniqueValueFromTwoStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str1.toLowerCase());
        stringBuilder.append(" ");
        stringBuilder.append(str2.toLowerCase());
        String[] words = stringBuilder.toString().split(" ");

        Map<String, Integer> frequencyOfWords = new HashMap<>();
        for (String word : words) {
            if (!frequencyOfWords.containsKey(word)) {
                frequencyOfWords.put(word, 1);
            } else {
                frequencyOfWords.put(word, frequencyOfWords.get(word) + 1);
            }

        }

        List<String> result = new LinkedList<>();
        for (String word : frequencyOfWords.keySet()) {
            if (frequencyOfWords.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(result.toArray(new String[0]));
    }

    public static void printArray(String[] str) {
        System.out.println(Arrays.toString(str));
    }
    // Тестирование:
    // StringTasks  stringTasks = new StringTasks();
    // stringTasks.printArray(StringTasks.getUniqueValueFromTwoStrings("banana apple mango", "house Banana java"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 2: проверить является ли строка Палиндромом
    // Пример:
    // "ama" -> true
    // "dramma" -> false
    // "dD dd" -> true
    // Алгоритм:
    // - удаляем пробелы и приводим к нижнему регистру
    // - читаем с одной стороны и запоминаем
    // - читаем с обратной стророны и запоминаем
    // - в HashMap записываем каждое слово и количество его упоминаний
    // - если строки равны -> возращаем true, иначе - false

    public static boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replace(" ", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.isPalindrome("dD dd"));
    // System.out.println(stringTasks.isPalindrome("dramma"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 3: Посчитать количество вхождений каждого символа
    // Пример:
    // "java" -> j - 1, a - 2, v - 1
    // "12j" -> 1 - 1, 2 - 1, j - 1
    // "№:№;%%№" -> № - 3, % - 2, : - 1, ; - 1
    // Алгоритм:
    // - идти по каждому симолу строки
    // - если для символа еще нет ключа, то создаем ключ-значение (1)
    // - если для символа есть ключа, то обновляю, получается то что было (+1)

    public static Map<Character, Integer> repeatNumberOfChars(String input) {
        if (input.length() < 1 || input.length() > 10) {
            throw new IllegalArgumentException("Недопустимая длина строки!");
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!freq.containsKey(c)) {
                freq.put(c, 1);
            } else
                freq.put(c, freq.get(c) + 1);
        }
        return freq;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    //    System.out.println(stringTasks.repeatNumberOfChars("java"));
    //    System.out.println(stringTasks.repeatNumberOfChars("12j"));
    //    System.out.println(stringTasks.repeatNumberOfChars("№:№;%%№"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 4: Развернуть слова в предложении
    // Пример:
    // "I love java" -> "java love I"
    // "I am qa" -> "Qa am I"
    // Алгоритм:
    // - разделяю предложение на слова с помощью пробелов
    // - выстраиваю новое предложение, начиная со слов с конца, разделяя их пробелами
    // - формирую финальную строку

    public static String reverseWords(String input) {
        String[] words = input.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    //    System.out.println(stringTasks.repeatNumberOfChars("java"));
    //    System.out.println(stringTasks.repeatNumberOfChars("12j"));
    //    System.out.println(stringTasks.repeatNumberOfChars("№:№;%%№"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 5: Проверка на анаграмму
    // Проверь, являются ли две строки анаграммами друг друга (содержат одни и те же буквы, порядок не важен).
    // Пример:
    // "listen" и "silent" → true
    // "hello" и "world" → false
    // Алгоритм:
    // - создать массив из чаров
    // - проверить равность массивов
    // - возврашаю результат

    public static Boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.isAnagram("listen","silent"));
    // System.out.println(stringTasks.isAnagram("hello","world"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 6: Самый первый неповторяющийся символ
    // Найди первый символ, который встречается только один раз в строке. Верни индекс. Если такого нет — верни -1.
    // Пример:
    // "leetcode" → 0 ('l')
    // "aabb" → -1
    // Алгоритм:
    // - создать массив
    // - считаем частоты
    // - находим первый уникальный

    public static Integer getIndexOfUniqueChar(String str) {
        if (str == null || str.isEmpty()) return -1;

        int[] freq = new int[256]; // ASCII

        // 1. Считаем частоты
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        // 2. Находим первый уникальный
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.getIndexOfUniqueChar("leetcode"));
    // System.out.println(stringTasks.getIndexOfUniqueChar("aabb"));


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 7: Подсчет количества слов в строке
    // Дана строка. Подсчитай количество слов (определяй слова по пробелам, игнорируй множественные пробелы подряд).
    // Пример:
    // " Hello world " → 2
    // "aabb" → 1
    // Алгоритм:
    // - тримим и проверяем, что строка не пустая и что она содрежит пробелы
    // - сплитуем
    // - возвращаем размер массива

    public static Integer countWordsFromString(String str) {
        if (str.replace(" ", "").isEmpty() || str == null) return 0;
        if (!str.trim().isEmpty() && !str.contains(" ")) return 1;
        String[] words = str.trim().replaceAll("\\s+", " ").split(" ");
        return words.length;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.countWordsFromString("leet code"));
    // System.out.println(stringTasks.countWordsFromString("aabb"));
    // System.out.println(stringTasks.countWordsFromString(""));
    // System.out.println(stringTasks.countWordsFromString(" "));
    // System.out.println(stringTasks.countWordsFromString("     "));
    // System.out.println(stringTasks.countWordsFromString(" dsds dsds ds "));
    // System.out.println(stringTasks.countWordsFromString("dsds     dsds    ds    аыйцй"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 7: Удаление дубликатов символов
    // Удали повторяющиеся символы в строке, оставив только первое вхождение каждого символа.
    // Пример:
    // "banana" → "ban"
    // Алгоритм:
    // - не пустая и не null нету пробелов или что с ними
    // - превращаем все в массив посимволно идем создаем перед этим хешмап и стринг билдер если не контейн записываем
    // и добавляем в стринг билдер
    // - возвращаем новую строку

    public static String removeDuplicates(String str){
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> dict = new HashMap<>();
        for (Character chr : str.toCharArray()){
            if (!dict.containsKey(chr)){
                dict.put(chr, 1);
                stringBuilder.append(chr.toString());
            }
        }
        return stringBuilder.toString();
    }
}
