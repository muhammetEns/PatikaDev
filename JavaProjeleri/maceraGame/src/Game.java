import java.util.Scanner;

public class Game {
    String pName ;
    Scanner scan = new Scanner(System.in) ;
    void start(){
        System.out.println("Oyuna Hoş Geldiniz!!!");
        System.out.print("Lütfen bir isim giriniz :");
        pName = scan.nextLine() ;
        Player p1 = new Player();
        p1.selecChar();
        p1.setName(pName);

        Location location = null ;
        while (true) {

            if (p1.env.firewood&&p1.env.water&&p1.env.food){
                System.out.println("Oyunu Kazandınız Tebriklerrrr!!!!");
                break;
            }
            System.out.println("Lütfen Gitmek İstediğinz Yeri Seçiniz");
            System.out.println("1-Güvenli Ev");
            System.out.println("2-Mağaza");
            System.out.println("3-Mağaraya Git ! Dikkatli ol karşına ZOMBİ çıkabilir");
            System.out.println("4-Nehire Git ! Dikkatli ol karşına AYI çıkabilir" );
            System.out.println("5-Ormana Git ! Dikkatli ol karşına VAMPİR");
            System.out.println("6-Madene Git ! Dikkatli ol burası çok YILANLI");

            int locCho = scan.nextInt() ;
            switch (locCho){
                case 1 :
                    location = new SafeHouse(p1, "Güvenli Ev") ;
                    break ;
                case 2 :
                    location = new ToolStore(p1,"Mağaza") ;
                    break ;
                case 3 :
                    location = new Cave(p1) ;
                    break;
                case 4 :
                    location = new River(p1) ;
                    break;
                case 5 :
                    location = new Forest(p1) ;
                    break;
                case 6 :
                    location = new Maden(p1) ;
                    break ;
                default:
                    location = new SafeHouse(p1,"Güvenli Ev") ;




            }
            if (!location.onLocation() ){
                System.out.println("Oyun bitti !!");
                break;

            }

        }



    }





}
