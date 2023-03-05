public class cepTel extends cihazlar {
    private int pilGücü;
    private String renk ;


    public cepTel(int id, int fiyat, int stok, int depolama, int ekranInc, int ram, String cihazName, markalar marka, String renk) {
        super(id, fiyat, stok, depolama, ekranInc, ram, cihazName, marka);
        this.renk = renk;
    }
}
