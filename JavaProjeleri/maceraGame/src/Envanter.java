public class Envanter extends Player {
    boolean water=false, food=false, firewood=false ,ganimet=false;
    String WeaponName, armorName;
    int weaponDamage, armorDefance ;



    Envanter (){
        setWeaponName("Yumruk");
        setWeaponDamage(0);

        setArmorName("Paçavra");
        setArmorDefance(0);
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
        damage = damage + weaponDamage ;
    }

    public int getArmorDefance() {
        return armorDefance;
    }

    public void setArmorDefance(int armorDefance) {
        this.armorDefance = armorDefance;
        healthy = healthy + armorDefance ;
    }
    public boolean isGanimet() {
        return ganimet;
    }

    public void setGanimet(boolean ganimet) {
        this.ganimet = ganimet;
    }
}
