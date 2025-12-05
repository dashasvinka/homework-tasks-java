import newTasks.StringTasks;
import oldTasks.*;

public class Main {
    public static void main(String[] args) {
        // Для проверки алгоритма - вызвать метод из целевого класса с тестовыми данными
         StringTasks stringTasks = new StringTasks();
        System.out.println(stringTasks.removeDuplicates("banana"));
    }
}