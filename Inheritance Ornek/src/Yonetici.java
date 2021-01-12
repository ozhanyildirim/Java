
public class Yonetici extends Calisan {
    
    private int sorumlu_kisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu) {
        super(ad, soyad, id);
        this.sorumlu_kisi=sorumlu;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("YONETICININ SORUMLU OLDUGU KISI SAYISI  : " + sorumlu_kisi);
    }
    
    public void zamYap(int zam){
        System.out.println(getAd() + getSoyad() + " BEY çalisanlara " + zam + " tl zam yapıldı");
    }
}
