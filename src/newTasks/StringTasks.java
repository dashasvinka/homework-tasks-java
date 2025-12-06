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

    // Задача 8: Удаление дубликатов символов
    // Удали повторяющиеся символы в строке, оставив только первое вхождение каждого символа.
    // Пример:
    // "banana" → "ban"
    // Алгоритм:
    // - не пустая и не null нету пробелов или что с ними
    // - превращаем все в массив посимволно идем создаем перед этим хешмап и стринг билдер если не контейн записываем
    // и добавляем в стринг билдер
    // - возвращаем новую строку

    public static String removeDuplicates(String str) {
        if (str.trim().replaceAll("\\s+", "").isEmpty() || str == null)
            return "Строка должна быть не пуста и содержать символы";
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> dict = new HashMap<>();
        for (Character chr : str.trim().replaceAll("\\s+", "").toCharArray()) {
            if (!dict.containsKey(chr)) {
                dict.put(chr, 1);
                stringBuilder.append(chr.toString());
            }
        }
        return stringBuilder.toString();
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.removeDuplicates("banana"));
    // System.out.println(stringTasks.removeDuplicates("    "));
    // System.out.println(stringTasks.removeDuplicates(""));
    // System.out.println(stringTasks.removeDuplicates("djdjdjshqkwdl2jj3j!"));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 9: Максимально часто встречающийся символ
    // Верни символ, который встречается в строке чаще всего. Если таких несколько — верни любой из них.
    // Пример:
    // "abcccccddee" → 'c'
    // Алгоритм:
    // - не пустая и не null нету пробелов или что с ними
    // - превращаем все в массив посимволно идем создаем перед этим хешмап и стринг билдер если не контейн записываем
    // и добавляем в стринг билдер
    // - возвращаем новую строку
    public static Character getMostFrequentlyChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Недопустимая строка!");
        } else {

            int[] freq = new int[256];

            for (char c : str.toCharArray()) {
                freq[c]++;
            }

            int maxCount = 0;
            char maxChar = str.charAt(0);

            for (char c : str.toCharArray()) {
                if (freq[c] > maxCount) {
                    maxCount = freq[c];
                    maxChar = c;
                }
            }
            return maxChar;
        }
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.getMostFrequentlyChar("banana"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 10: Является ли строка перестановкой палиндрома
    // Проверь, можно ли переставить символы строки так, чтобы получился палиндром.
    // Пример:
    // "civic" → true
    // "ivicc" → true
    // "hello" → false
    // Алгоритм:
    // - если длина строки четная, каждый символ должен встречаться чётное количество раз
    // - если длина строки нечетная, ровно один символ может встречаться нечётное число раз, чтобы он был в середине
    // (1) считаем частоты для всех символов
    // (2) считаем, сколько нечетных
    // (3) если нечетных более 1 символа, тогда нельзя составить палиндром
    public static boolean canPermutePalindrome(String s) {
        if (s == null || s.isEmpty()) return false;

        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.canPermutePalindrome("banana"));
    // System.out.println(stringTasks.canPermutePalindrome("civic"));
    // System.out.println(stringTasks.canPermutePalindrome("ivicc"));
    // System.out.println(stringTasks.canPermutePalindrome("hello"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Задача 11: Сравнение строк с учетом бэкспейсов
    // Сравни две строки с символами '#', которые означают "удалить предыдущий символ". Верни, одинаковы ли строки после обработки.
    // Пример:
    // "ab#c" и "ad#c" → true
    // "a#c" и "b" → false
    // Алгоритм:
    // - выстраиваем обе строки перебирая посимвольно массив, если встречаем # удаляем предыдущий добавленный
    // - сравниваем две строки через equals()

    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.backspaceCompare("ab#c", "ad#c"));
    // System.out.println(stringTasks.backspaceCompare("a#c", "b"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Задача 12: Повторяющиеся символы подряд
    // Сожми строку, заменив группы одинаковых символов подряд на один символ + количество.
    // Пример:
    // aabcccccaaa" → "a2b1c5a3"
    // если сжатая строка не короче — верни оригинал.

    public static String compressString(String s) {
        if (s == null || s.length() < 2) return s;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(s.length() - 1)).append(count);
        return sb.length() < s.length() ? sb.toString() : s;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.compressString("aabcccccaaa"));
}
