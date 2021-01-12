
public class Calisan { 
    
 private String isim;
    private int maas;
    private String departman;
    //superclass or Baseclass
    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    
    
    public void calis(){
        
        System.out.println("ÇALIŞAN ÇALIŞIYOR");
    }
    
    public void bilgilerGoster(){
        
        System.out.println("İSİM : " + getIsim());
        System.out.println("MAAŞ : " + getMaas());
        System.out.println("DEPARTMAN : " + getDepartman());
        
    }
    
    public void departman_degistir(String yeni_departman){
        System.out.println("DEPARTMAN DEGİSTİRİLİYOR");
        this.setDepartman(yeni_departman);
        
        System.out.println("YENİ DEPARTMAN : " + this.getDepartman());
        
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
   
    
    
}
