import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
}
