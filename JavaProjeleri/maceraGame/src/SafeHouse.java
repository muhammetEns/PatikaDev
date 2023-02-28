public class SafeHouse extends NormalLoc{

    SafeHouse(Player player, String name) {
        super(player, "Güvenli Ev");
    }

    @Override
    boolean onLocation() {
        System.out.println("Güvenli Evdesiniz.\n Canınız Yenilendi ");
        player.setHealthy(player.refHealthy);
        System.out.println("Şuanki canınız " + player.getHealthy());
        return true;
    }
}
