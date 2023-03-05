import java.util.*;

public class run {
    Scanner scan = new Scanner(System.in) ;
    ArrayList<cepTel> telArr = new ArrayList<>();
    ArrayList<noteBook> noteBookArr = new ArrayList<>();
    public void go(){
        markalar Samsung = new markalar() ;
        markalar Lenovo = new markalar() ;
        markalar Apple = new markalar() ;
        markalar Huawei = new markalar() ;
        markalar Casper = new markalar() ;
        markalar Asus = new markalar() ;
        markalar HP = new markalar() ;
        markalar Xiaomi = new markalar() ;
        markalar Monster = new markalar() ;

        cepTel c1 = new cepTel(1001,4500,10,128,5,12,"SAMSUNG GALAXY A51",Samsung,"Sarı") ;
        telArr.add(c1) ;
        cepTel c2 = new cepTel(1002,12000,10,64,6,8,"iPhone 11 64 GB",Apple,"Siyah") ;
        telArr.add(c2) ;
        cepTel c3 = new cepTel(1003,6700,10,256,6,16,"Redmi Note 10 Pro 8GB ",Xiaomi,"Kırmızı") ;
        telArr.add(c3) ;


        noteBook n1 = new noteBook(2001,7000,5,512,14,16,"HUAWEI Matebook 14",Huawei,10) ;
        noteBookArr.add(n1) ;
        noteBook n2 = new noteBook(2002,3700,5,1024,15,16,"LENOVO V14 IGL",Lenovo,15) ;
        noteBookArr.add(n2) ;
        noteBook n3 = new noteBook(2003,5000,5,2048,17,16,"ASUS Tuf Gaming",Asus,5) ;
        noteBookArr.add(n3) ;

        menü();
    }

    public void menü(){
        System.out.println("Patika Mağaza Menüsüne Hoşgeldiniz ");
        System.out.println("1- ürünleri Listele");
        System.out.println("2- İD'den ürün bul");
        System.out.println("3- Markaları Sırala");
        System.out.print("Ne Yapmak İstersiniz");
        int menüSecim = scan.nextInt();
        switch (menüSecim){
            case 1 :
                System.out.println("--------------------------------------");
                System.out.println("| İD | Ürün Adı            | Fiyat  | Marka   | Depolama | Ekran    | Ram    |");
                System.out.println("------------------------------------------------------------------------------");
                for (cepTel ct : telArr){
                System.out.println("| 1 | " + ct.getCihazName() + "  | " + ct.getFiyat() + "   | " + ct.getMarka() + " | " + ct.getDepolama() + " | " + ct.getEkranInc() + " | " + ct.getRam());
                }
            case 2 :
                System.out.println("--------------------------------------");
                System.out.println("| İD | Ürün Adı            | Fiyat  | Marka   | Depolama | Ekran    | Ram    |");
                System.out.println("------------------------------------------------------------------------------");
                for (noteBook ct : noteBookArr){
                    System.out.println("| 1 | " + ct.getCihazName() + "  | " + ct.getFiyat() + "   | " + ct.getMarka() + " | " + ct.getDepolama() + " | " + ct.getEkranInc() + " | " + ct.getRam());
                }
        }





    }



}
