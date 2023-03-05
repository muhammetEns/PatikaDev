public class cihazlar extends markalar{
    private int  fiyat,stok, depolama,ekranInc,ram ;
    private String cihazName ;
    private markalar marka ;
    int id ;


    public cihazlar( int id, int fiyat, int stok, int depolama, int ekranInc, int ram, String cihazName, markalar marka) {

        this.id = id;
        this.fiyat = fiyat;
        this.stok = stok;
        this.depolama = depolama;
        this.ekranInc = ekranInc;
        this.ram = ram;
        this.cihazName = cihazName;
        this.marka = marka;
    }



    public markalar getMarka() {
        return marka;
    }

    public String getCihazName() {
        return cihazName;
    }

    public int getId() {
        return id;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getStok() {
        return stok;
    }

    public int getDepolama() {
        return depolama;
    }

    public int getEkranInc() {
        return ekranInc;
    }

    public int getRam() {
        return ram;
    }
}
