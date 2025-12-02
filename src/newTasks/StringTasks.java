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

    public static String[] getUniqueValueFromTwoStrings(String str1, String str2){
        StringBuilder stringBuilder = new StringBuilder(str1.toLowerCase());
        stringBuilder.append(" ");
        stringBuilder.append(str2.toLowerCase());
        String[] words = stringBuilder.toString().split(" ");

        Map<String, Integer> frequencyOfWords = new HashMap<>();
        for (String word: words){
            if (!frequencyOfWords.containsKey(word)) {
                frequencyOfWords.put(word, 1);
            }
            else {
                frequencyOfWords.put(word, frequencyOfWords.get(word) +1);
            }

        }

        List<String> result = new LinkedList<>();
        for (String word: frequencyOfWords.keySet()){
            if (frequencyOfWords.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(result.toArray(new String[0]));
    }

    public static void printArray(String[] str){
        System.out.println(Arrays.toString(str));
    }
    // Тестирование:
    // StringTasks  stringTasks = new StringTasks();
    // stringTasks.printArray(StringTasks.getUniqueValueFromTwoStrings("banana apple mango", "house Banana java"));

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

    public static boolean isPalindrome(String str){
        String cleaned = str.toLowerCase().replace(" ", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    // System.out.println(stringTasks.isPalindrome("dD dd"));
    // System.out.println(stringTasks.isPalindrome("dramma"));

    // Задача 3: Посчитать количество вхождений каждого символа
    // Пример:
    // "java" -> j - 1, a - 2, v - 1
    // "12j" -> 1 - 1, 2 - 1, j - 1
    // "№:№;%%№" -> № - 3, % - 2, : - 1, ; - 1
    // Алгоритм:
    // - идти по каждому симолу строки
    // - если для символа еще нет ключа, то создаем ключ-значение (1)
    // - если для символа есть ключа, то обновляю, получается то что было (+1)

    public static Map<Character, Integer> repeatNumberOfChars(String input){
        if (input.length() < 1 || input.length() > 10) {
            throw  new IllegalArgumentException("Недопустимая длина строки!");
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: input.toCharArray()){
            if (!freq.containsKey(c)){
                freq.put(c,1);
            }
            else
                freq.put(c, freq.get(c) + 1);
        }
        return freq;
    }

    // Тестирование:
    // StringTasks stringTasks = new StringTasks();
    //    System.out.println(stringTasks.repeatNumberOfChars("java"));
    //    System.out.println(stringTasks.repeatNumberOfChars("12j"));
    //    System.out.println(stringTasks.repeatNumberOfChars("№:№;%%№"));

    // Задача 4: Развернуть слова в предложении
    // Пример:
    // "I love java" -> "java love I"
    // "I am qa" -> "Qa am I"
    // Алгоритм:
    // - разделяю предложение на слова с помощью пробелов
    // - выстраиваю новое предложение, начиная со слов с конца, разделяя их пробелами
    // - формирую финальную строку

    public static String reverseWords(String input){
        String[] words = input.trim().replaceAll("\\s+"," ").split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i>=0; i--){
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
}
