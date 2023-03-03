import java.util.TreeSet;

public class mAİN {

    public static void main(String[] args) {

        Book b1 = new Book("Aisim1","2001",100) ;
        Book b2 = new Book("Bisim2","2002",200) ;
        Book b3 = new Book("Cisim3","2003",300) ;
        Book b4 = new Book("Cisim4","2004",400) ;
        Book b5 = new Book("Cisim5","2005",500) ;

        TreeSet<Book> hs = new TreeSet<>(new bookNameComparator());

        TreeSet<Book> hs1 = new TreeSet<>(new bookPageNumbersComparator());

        hs.add(b1) ;
        hs.add(b2) ;
        hs.add(b3) ;
        hs.add(b4) ;
        hs.add(b5) ;

        hs1.add(b1) ;
        hs1.add(b2) ;
        hs1.add(b3) ;
        hs1.add(b4) ;
        hs1.add(b5) ;

        for (Book e : hs){
            System.out.println(e.getBookName());
        }
        System.out.println("------------------------------------------");

        for (Book e : hs1){
            System.out.println(e.getSayfaSayısı());
        }


    }

}
