import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TechnicalOperator {

    // Задание 1. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    // Напишите программу, которая выводит на экран числа от 1 до 10.
    public void printNumbersInOrder() {
        int countUp = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(countUp);
            countUp++;
        }
    }

    // Задание 2. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    // Напишите программу, которая находит сумму всех чисел от 1 до 100.
    public void printSumOfNumbers() {
        int number = 1;
        int result = 0;
        while (number <= 100) {
            result += number;
            number++;
            System.out.println(result);
        }
    }

    // Задание 3. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    // Найдите факториал заданного числа.
    public void printFactorialFunctionResult(int factorialNumber) {
        if (factorialNumber == 0) {
            System.out.println(0);
        } else {
            int result = 1;
            for (int i = 1; i <= factorialNumber; i++) {
                result *= i;
                System.out.println(result);
            }
        }
    }

    // Задание 4. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    // Напишите проверку, является ли заданное число простым.
    public void isSimpleNumber(int numberForCheck) {
        int some = 2;
        if (numberForCheck == 1) {
            System.out.println("В математике принято не относить единицу ни к простым, ни к составным числам");
        } else if (numberForCheck == 2) {
            System.out.println("Это первое наименьшее простое, единственное четное, простое число");
        } else {
            while (some < numberForCheck) {
                int result = numberForCheck % some;
                if (result == 0) {
                    System.out.println("Число не является простым");
                    break;
                }
                some++;
                if ((some == numberForCheck - 1) || (some == numberForCheck)) {
                    System.out.println("Число является простым");
                    break;
                }
            }
        }
    }

    // Задание 7. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    // Напишите программу, которая инвертирует массив (меняет порядок элементов на противоположный).
    public void getFlipArray(String[] needToFlip) {
        var finalList = Arrays.asList(needToFlip);
        Collections.reverse(finalList);
        Arrays.stream(needToFlip).forEach(i -> System.out.println(i));
    }

    // Задание 1.2.1 https://code.mu/ru/java/tasker/stager/1/2/
    // Дано целое число. Выведите в консоль первую цифру этого числа.
    public void getFirstNumber(int numberForEdit) {
        String number = String.valueOf(numberForEdit);
        char firstNumber = number.charAt(0);
        System.out.println("Если взять число " + numberForEdit + ", то его первая цифра будет " + firstNumber);
    }

    // Задание 1.2.2 https://code.mu/ru/java/tasker/stager/1/2/
    // Дано целое число. Выведите в консоль последнюю цифру этого числа.
    public void getLastNumber(int numberForEdit) {
        String number = String.valueOf(numberForEdit);
        int numberLength = number.length();
        String lastNumber = number.substring(numberLength - 1, numberLength);
        System.out.println("Если взять число " + numberForEdit + ", то его последняя цифра будет " + lastNumber);
    }

    // Задание 1.2.3 https://code.mu/ru/java/tasker/stager/1/2/
    // Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
    public void getSumLastAndFirstNumber(int numberForEdit) {
        String number = String.valueOf(numberForEdit);
        int numberLength = number.length();
        String lastNumber = number.substring(numberLength - 1, numberLength);
        String firstNumber = number.substring(0, 1);
        int numFirst = Integer.parseInt(firstNumber);
        int numSecond = Integer.parseInt(lastNumber);
        int result = numFirst + numSecond;
        System.out.println("Суммф первой и последней цифры числа " + numberForEdit + " равна:" + result);
    }

    // Задание 1.2.4 https://code.mu/ru/java/tasker/stager/1/2/
    // Дано целое число. Выведите количество цифр в этом числе.
    public void countNumber(int numberForEdit) {
        String number = String.valueOf(numberForEdit);
        int numberLength = number.length();
        System.out.println("У числа " + numberForEdit + " присутствует столько чисел: " + numberLength);
    }

    // Задание 1.3.2 https://code.mu/ru/java/tasker/stager/1/3/
    // Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.
    public void getPenultimateSymbol(String combinationOfSymbols) {
        int numberLength = combinationOfSymbols.length();
        if (numberLength == 1) {
            System.out.println("В строке " + combinationOfSymbols + " только 1 символ");
        } else if (numberLength == 0) {
            System.out.println("Вы передали пустую строку");
        } else {
            String penultimateSymbol = combinationOfSymbols.substring(numberLength - 2, numberLength - 1);
            System.out.println("В строке " + combinationOfSymbols + " предпоследний символ: " + penultimateSymbol);
        }
    }

    // Задание 1.4.3 https://code.mu/ru/java/tasker/stager/1/4/
    // Дано целое число, содержащее номер минуты от 0 до 60: Определите, в какую четверть часа попадает это значение.
    public void getQuarterOfAnHour(byte num) {

        if ((0 <= num) && (num <= 15)) {
            System.out.println("Попадает в первую четверть часа");
        } else if ((15 < num) && (num <= 30)) {
            System.out.println("Попадает во вторую четверть часа");
        } else if ((30 < num) && (num <= 45)) {
            System.out.println("Попадает в третью четверть часа");
        } else if ((45 < num) && (num <= 60)) {
            System.out.println("Попадает в четвертую четверть часа");
        } else {
            System.out.println("Значение за границами интервала от 0 до 60, поэтому не может быть соотнесено с четвертью часа");
        }
    }
}
