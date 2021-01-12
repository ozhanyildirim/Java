
public class Yonetici extends Calisan{  // subClass

   private int sorumlu; // ex. özellik
    
    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) 
    {
        super(isim, maas, departman);
        this.sorumlu = sorumlu_kisi;
        
        
      
        
    }
    
    public void zamYap(int zam){
        System.out.println("ÇALIŞANLARA " + zam+ " TL ZAM YAPILDI");
    }
    
    public void bilgilerGoster(){
        
           
      /*  System.out.println("İSİM : " + getIsim());
        System.out.println("MAAŞ : " + getMaas());
        System.out.println("DEPARTMAN : " + getDepartman());*/
       
      // ÜSTTEKİ GİBİ VEYA ALTTAKİ GİBİ YAPABİLİRİZ
        super.bilgilerGoster();
        System.out.println("SORUMLU KISI SAYISI : " + this.sorumlu);
    }
    
    
    
    
    
}
