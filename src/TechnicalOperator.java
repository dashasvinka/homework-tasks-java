public class TechnicalOperator {

    // Задание 1. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    public void printNumbersInOrder() {
        int countUp = 1;

        while (countUp <= 10) {
            System.out.println(countUp);
            countUp++;
        }
    }

    // Задание 2. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    public void printSumOfNumbers() {
        int number = 1;
        int result = 0;
        while (number <= 100) {
            result = result + number;
            number++;
            System.out.println(result);
        }
    }

    // Задание 3. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    public void printFactorialFunctionResult(int factorialNumber) {
        if (factorialNumber == 0) {
            System.out.println(0);
        } else {
            int result = 1;
            for (int i = 1; i <= factorialNumber; i++) {
                result = result * i;
                System.out.println(result);
            }
        }
    }

    // Задание 4. https://tproger.ru/articles/zadachi-po-java-dlya-nachinayushhih
    public void isSimpleNumber(int numberForCheck) {
        int some = 2;
        while (some < numberForCheck) {
            int result = numberForCheck % some;
            if (result == 0) {
                System.out.println("Число не является простым");
                break;
            }
            some++;
            if (some == numberForCheck - 1) {
                System.out.println("Число является простым");
            }
        }
    }

    // Задание 1.2.1 https://code.mu/ru/java/tasker/stager/1/2/
    // Дано целое число. Выведите в консоль первую цифру этого числа.
    public void getFirstNumber(int numberForEdit) {
        String number = String.valueOf(numberForEdit);
        String firstNumber = number.substring(0, 1);
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
        if (numberLength == 1){
            System.out.println("В строке " + combinationOfSymbols + " только 1 символ");
        }
        else if (numberLength == 0){
            System.out.println("Вы передали пустую строку");
        }
        else {
            String penultimateSymbol = combinationOfSymbols.substring(numberLength - 2, numberLength - 1);
            System.out.println("В строке " + combinationOfSymbols + " предпоследний символ: " + penultimateSymbol);
        }
    }
}
