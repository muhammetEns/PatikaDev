import java.util.Comparator;

public class Book  {

    private String bookName ,yayınTarihi;
    private int sayfaSayısı ;

    public Book(String bookName, String yayınTarihi, int sayfaSayısı) {
        this.bookName = bookName;
        this.yayınTarihi = yayınTarihi;
        this.sayfaSayısı = sayfaSayısı;
    }



    public String getBookName() {
        return bookName;
    }

    public String getYayınTarihi() {
        return yayınTarihi;
    }

    public int getSayfaSayısı() {
        return sayfaSayısı;
    }

}
