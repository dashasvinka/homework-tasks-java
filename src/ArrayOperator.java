

public class ArrayOperator {

    // Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
    // Не используйте дополнительный массив для хранения результатов.
    //https://vertex-academy.com/tutorials/ru/kak-pomenyat-elementy-massiva-v-obratnom-poryadke-java/

    public void printFlipArray(String[] arrayName) {
        int position = arrayName.length;
        int result = position/2;
        int i = arrayName.length - 1;
        for (int k = 1; k <= result; k++) {
            var a = arrayName[k-1];
            var b = arrayName[i];
            arrayName[i] = a;
            arrayName[k-1] = b;
            i--;
        }
        for (int l = 0; l < position; l++) {
            System.out.println(arrayName[l]);
        }
    }
}
