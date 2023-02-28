import java.util.Random;

public abstract class BattleLoc extends Location{
    Obstacle obstacle ;
    String award ;
    int maxObstacle ;
    int obsCount ;
    Random rand = new Random() ;
    BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle ;
        this.award = award ;
        this.maxObstacle = maxObstacle ;
    }


    @Override
    boolean onLocation() {
        System.out.println("Şuanda " + this.name + " Konumundasınız !! ");
        System.out.println("Dikkatli ol Burada " + randomObs() + " tane düşman var ");
        System.out.println("Düşmanın ");
        System.out.println("Savaşmak için 'S' kaçmak için 'K' yaz !");
        String secSav = scan.nextLine() ;
        secSav = secSav.toUpperCase( );
        int warsCou = obsCount ;

        int tempOBShea = obstacle.getHealth() ;
        if (secSav.equals("S")){
            System.out.println("savaş");
            int firstAtt = rand.nextInt(2);
            while(this.obsCount!=0){

                if (firstAtt ==0){
                    System.out.println("Savaş başladı!!");
                    System.out.println(warsCou + ". Düşmana Vurdunuz!");
                    tempOBShea = (tempOBShea-player.getDamage());
                    System.out.println("Düşmanın canı " + tempOBShea + " e düştü !! ");
                    if (tempOBShea>0){
                        player.setHealthy( player.getHealthy()-obstacle.getDamage() );
                        System.out.println("Düşman size vurdu");
                        if (player.getHealthy()<=0){
                            System.out.println("Öldünüz :(");
                            return false ;
                        }
                        System.out.println("Sizin canınız " + player.getHealthy() + " e düştü !! ");
                    }else{
                        System.out.println("Düşmanı Öldürdünüz Çok iyisiniz ");
                        obsCount-- ;
                        warsCou-- ;
                        tempOBShea = obstacle.getHealth() ;
                    }

                }else{
                    System.out.println(warsCou + ". Düşman size vuruyor !!");
                    player.setHealthy(player.getHealthy()-obstacle.getDamage());
                    System.out.println("Kalan Canınız : " + player.getHealthy());
                    if(player.getHealthy()>0){
                        System.out.println("Düşmana vurdunuz ! ");
                        tempOBShea=(tempOBShea-player.getDamage());
                        if (tempOBShea>0){
                            System.out.println("Kalan Canı : " + obstacle.getHealth());
                        }else{
                            System.out.println(warsCou + ". Düşmanı Öldürdünüz tebrikler");
                            obsCount-- ;
                            warsCou-- ;
                            tempOBShea = obstacle.getHealth() ;
                        }


                    }else{
                        System.out.println("Öldünüz !!");
                        return false ;
                    }
                }


            }
            if (obstacle.name.equals("Zombie")){
                player.env.food = true ;
                System.out.println("yemeği ve 5$ kazandınız !!!");
                player.setMoney(player.getMoney() + 5);

            }
            if (obstacle.name.equals("Ayı")){
                player.env.water = true ;
                System.out.println("Suyu ve 10$ kazandınız !!! ");
                player.setMoney(player.getMoney() + 10);
            }
            if (obstacle.name.equals("Vampir")){
                player.env.firewood = true ;
                System.out.println("Yakacak Odunu ve 15$ kazandınız!!!");
                player.setMoney(player.getMoney() + 15);
            }if (obstacle.name.equals("Savaş ve Ganimet")){
                player.env.ganimet = true ;
                System.out.println("Savaş ve Ganimet İtemini ve 30$ Aldınız!!");
                player.setMoney(player.getMoney() + 15);
            }


        }else{
            System.out.println("Kaçmak eziklere göredir!!");
        }

        return true;
    }

    public int randomObs(){
        obsCount = rand.nextInt(this.getMaxObstacle()) + 1 ;
        return  obsCount ;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
