public class LogicOperator {

   //    Поиск суммы элементов массива
   //    Задача: Напишите функцию, которая принимает массив чисел и возвращает сумму его элементов.

    public Integer getArraySumOfElements(Integer[] numbers) {
        int counter = numbers.length;
        int result = 0;
        for (int k = 0; k < counter; k++) {
            result = result + numbers[k];
        }
        System.out.println("Сумма элементов переданного массива " + result);
        return result;
    };

    //    Проверка палиндрома
    //    Задача: Напишите функцию, которая принимает строку и возвращает true, если строка является палиндромом, и false в противном случае.
    public static Boolean isPalindrom(String str) {
        String tehnicalStr = str.replace(" ", "").toLowerCase().replaceAll("[\\p{P}]", "");
        String reversedStr = new StringBuilder(tehnicalStr).reverse().toString();
        Boolean result = tehnicalStr.equals(reversedStr);
        System.out.println("Правда ли что полиндром " + result);
        return result;
    };

//    Факториал числа
//    Задача: Напишите функцию, которая вычисляет факториал заданного числа.

    public Integer getFactorial(Integer num) {
        int result = 1;
        for (int k = num; k != 0; k--) {
            result = result * k;
        }
        System.out.println("Факториал " + num + " равен " + result);
        return result;
    };

//    Фибоначчиева последовательность
//    Задача: Напишите функцию, которая принимает число n и возвращает n-ый элемент последовательности Фибоначчи.

    public class isFibonacci {
        public static long fibonacciIterative(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Число n не может быть отрицательным");
            }
            if (n <= 1) {
                return n;
            }

            long a = 0;
            long b = 1;
            for (int i = 2; i <= n; i++) {
                long temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    };

//    Поиск максимального/минимального элемента в массиве
//    Задача: Напишите функцию, которая принимает массив чисел и возвращает максимальный (или минимальный) элемент.

//    Линейный поиск
//    Задача: Напишите функцию, которая выполняет линейный поиск элемента в массиве и возвращает индекс этого элемента или -1, если элемент не найден.

//    Поиск гласных букв в строке
//    Задача: Напишите функцию, которая подсчитывает количество гласных букв в данной строке.

//    Обращение строки
//    Задача: Напишите функцию, которая принимает строку и возвращает её в обратном порядке.

//    Сортировка массива
//    Задача: Напишите функцию, которая сортирует массив чисел по возрастанию или убыванию.

//    Проверка на простое число
//    Задача: Напишите функцию, которая определяет, является ли число простым.

}
