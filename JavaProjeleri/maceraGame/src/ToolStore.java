import java.util.Scanner;

public class ToolStore extends NormalLoc {
    ToolStore(Player player, String name) {
        super(player, name);
    }
    Scanner scan = new Scanner(System.in) ;
    int secimM, secimK, secimZ;
    @Override
    boolean onLocation() {
        System.out.println("Markete Hoşgeldiniz ");
        System.out.println("Paranız : " + player.getMoney());
        System.out.println("Ne Satın Almak İstersiniz ? ");
        System.out.println("1- Silah");
        System.out.println("2- Zırh");
        System.out.println("3- Çıkış");
        System.out.print("Seçiminiz : ");
        secimM = scan.nextInt() ;
        switch (secimM){
            case 1 :
                System.out.println("Silah Menüsüne Hoş Geldiniz!!");
                System.out.println("Hangi silahı vereyim ?");
                System.out.println("1-Kısa Kılıç --> +5 Damage  |10 Gold|");
                System.out.println("2-Uzun Kılıç --> +10 Damage |20 Gold|");
                System.out.println("3-AMK Kılıcı --> +15 Damage |30 Gold|");
                System.out.print("Seçiminiz :");
                secimK = scan.nextInt() ;
                switch (secimK){
                    case 1 :
                        if (player.getMoney()>=10){
                            player.env.setWeaponDamage(5);
                            player.env.setWeaponName("Kısa Kılıç");
                            player.setDamage(player.getDamage() + player.env.getWeaponDamage());
                            player.setMoney(player.getMoney()-10);
                            System.out.println("Kalan paranız : " + player.getMoney());
                            break ;
                        }else{
                            System.out.println("Paranız yetersiz");
                            break;
                        }

                    case 2 :
                        if (player.getMoney()>=20){
                            player.env.setWeaponDamage(10);
                            player.env.setWeaponName("Uzun Kılıç");
                            player.setDamage(player.getDamage() + player.env.getWeaponDamage());
                            player.setMoney(player.getMoney()-20);
                            System.out.println("Kalan paranız : " + player.getMoney());
                            break ;
                        }else{
                            System.out.println("Paranız yetersiz");
                            break;
                        }
                    case 3 :
                        if (player.getMoney()>=30){
                            player.env.setWeaponDamage(15);
                            player.env.setWeaponName("AMK Kılıcı");
                            player.setDamage(player.getDamage() + player.env.getWeaponDamage());
                            player.setMoney(player.getMoney()-30);
                            System.out.println("Kalan paranız : " + player.getMoney());

                            break ;
                        }else{
                            System.out.println("Paranız yetersiz");
                            break;
                        }
                    default:
                        System.out.println("Böyle bir Kılıç yok ");
                }
                System.out.println("Yeni Hasarınız: " + player.getDamage());
                break ;
            case 2 :
                System.out.println("Zırh Menüsüne Hoş Geldiniz!!");
                System.out.println("Hangi Zırhı vereyim ?");
                System.out.println("1-Deri Zırh --> +10 Can  |10 Gold|");
                System.out.println("2-Demir Zırh --> +15 Can |20 Gold|");
                System.out.println("3-Elmas Zırh --> +20 Can |30 Gold|");
                System.out.print("Seçiminiz :");
                secimZ = scan.nextInt() ;
                switch (secimZ){
                    case 1 :
                        if (player.getMoney()>=10){
                            player.env.setArmorDefance(10) ;
                            player.setHealthy(player.getHealthy() + player.env.getArmorDefance()) ;
                            player.env.setArmorName("Deri Zırh");
                            player.setMoney(player.getMoney()-10);
                            System.out.println("Kalan paranız : " + player.getMoney());
                            player.refHealthy = player.getHealthy();
                            break ;
                        }else{
                            System.out.println("Paranız yetmiyor");
                            break;
                        }

                    case 2 :
                        if (player.getMoney()>=15){
                            player.env.setArmorDefance(15) ;
                            player.setHealthy(player.getHealthy() + player.env.getArmorDefance()) ;
                            player.env.setArmorName("Demir Zırh");
                            player.setMoney(player.getMoney()-15);
                            System.out.println("Kalan paranız : " + player.getMoney());
                            player.refHealthy = player.getHealthy();
                            break ;
                        }else{
                            System.out.println("Paranız yetmiyor");
                            break;
                        }
                    case 3 :
                        if (player.getMoney()>=20){
                            player.env.setArmorDefance(20) ;
                            player.setHealthy(player.getHealthy() + player.env.getArmorDefance()) ;
                            player.env.setArmorName("Elmas Zırh");
                            player.setMoney(player.getMoney()-20);
                            System.out.println("Kalan paranız : " + player.getMoney());
                            player.refHealthy = player.getHealthy();

                            break ;
                        }else{
                            System.out.println("Paranız yetmiyor");
                            break;
                        }
                    default:
                        System.out.println("Böyle bir Kılıç yok ");
                }
                System.out.println("Yeni Canınız : " + player.getHealthy());
                break ;
            case 3 :
                break ;




        }





        return true;
    }

}