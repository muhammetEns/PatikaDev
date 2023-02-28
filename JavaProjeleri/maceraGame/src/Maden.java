import java.util.Random;

public class Maden extends BattleLoc{
    Random rand = new Random();

    Maden(Player player) {
        super(player, "Maden", new Yılan(player.snaDam()), "Savaş ve Ganimet", 5);
    }



}
