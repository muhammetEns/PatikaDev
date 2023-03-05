public class noteBook extends cihazlar {

    private int iOranı;

    public noteBook(int id, int fiyat, int stok, int depolama, int ekranInc, int ram, String cihazName, markalar marka, int iOranı) {
        super(id, fiyat, stok, depolama, ekranInc, ram, cihazName, marka);
        this.iOranı = iOranı;
    }


}
