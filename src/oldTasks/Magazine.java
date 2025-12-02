package oldTasks;

import java.util.Arrays;

public class Magazine implements Printable {
    String name;

    Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print("Журнал " + name);
    }

    public static void printMagazines(Printable[] printable){
        Arrays.stream(printable).filter(p -> p instanceof Magazine).forEach(m -> m.print());
    }
}
