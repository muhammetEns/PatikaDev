import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        /*
        ListeClass<Integer> myList = new ListeClass<>(15) ;

        ListeClass<Integer> liste = new ListeClass<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        System.out.println("--------------------------------------------------------------------------");

        ListeClass<Integer> liste1 = new ListeClass<>();
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        System.out.println("2. indisteki değer : " + liste1.get(2));
        liste1.remove(2);
        liste1.add(40);
        liste1.set(0, 100);
        System.out.println("2. indisteki değer : " + liste1.get(2));
        System.out.println(liste1.toString());
        System.out.println("---------------------------------------------------------------------------");

         */

        ListeClass<Integer> liste = new ListeClass<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Liste veri türünde alt bir liste oluşturdu
        ArrayList altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());

    }
}
