import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class Player extends Game{
    int damage ,healthy ,money ,secim, refHealthy ;
    String name ,charName;
    Envanter env ;
    Scanner scan = new Scanner(System.in) ;
    Random rand = new Random() ;
    Player() {


    }

    public void selecChar(){
        System.out.println("Karekter Seçme Bölümüne Hoşgeldiniz\n Lütfen karakterinizi Seçiniz");
        System.out.println("ID : 1 | AD : Samuray | Hasar : 5 | Sağlık : 21 | Para : 15");
        System.out.println("ID : 2 | AD : Okçu    | Hasar : 7 | Sağlık : 18 | Para : 20");
        System.out.println("ID : 3 | AD : Şovalye | Hasar : 8 | Sağlık : 24 | Para :  5");

        System.out.print("Seçiminiz Nedir : ");
        secim = scan.nextInt() ;

        switch (secim){
            case 1 :
                this.damage = 5 ;
                this.healthy = 21;
                money = 15;
                this.charName = "Samuray" ;
                break ;
            case 2 :
                this.damage = 7 ;
                this.healthy = 18;
                money = 20;
                this.charName = "Okçu" ;
                break ;
            case 3 :
                this.damage = 8 ;
                this.healthy = 24;
                money = 25;
                this.charName = "Şovalye" ;
                break ;

        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Seçtiğiniz Karakterin Özellikleri :");
        System.out.println("İsim : " + getCharName() + "| Hasar : " + getDamage() + "| Sağlık : " + getHealthy() + "| Para: " + getMoney());
        env = new Envanter() ;
        playerİnfo();
        refHealthy = getHealthy() ;

    }

    public void playerİnfo(){
        System.out.println("Hasarınız " + getDamage());
        System.out.println("Canınız : " + getHealthy());
        System.out.println("Paranız : " + getMoney());
        System.out.println("Silahınız adı : " + env.getWeaponName() + " Size verdiği ekstra güç : " + env.getWeaponDamage());
        System.out.println("Zırhınızın adı : " + env.getArmorName() + "Size verdiği ekstra can : " + env.getArmorDefance());


    }



    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    int snaDam(){

        return rand.nextInt(6) +1 ;

    }
}
