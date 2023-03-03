import java.util.Comparator;

public class bookPageNumbersComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getSayfaSayısı()-o2.getSayfaSayısı();
    }
}
