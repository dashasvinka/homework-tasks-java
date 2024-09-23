import java.util.Arrays;

public class Book implements Printable {
    String title;

    Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.print("Книга " + title);
    }

    public static void printBooks(Printable[] printable){
        Arrays.stream(printable).filter(p -> p instanceof Book).forEach(m -> m.print());
    }
}
