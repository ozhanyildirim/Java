
public class Beyblade {
    
    private int saldiriGucu;
    private String beybladeci;
    private int donusHizi;

    public Beyblade(int saldiriGucu, String beybladeci, int donusHizi) {
        this.saldiriGucu = saldiriGucu;
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
    }

    /**
     * @return the saldiriGucu
     */
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    /**
     * @param saldiriGucu the saldiriGucu to set
     */
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    /**
     * @return the beybladeci
     */
    public String getBeybladeci() {
        return beybladeci;
    }

    /**
     * @param beybladeci the beybladeci to set
     */
    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    /**
     * @return the donusHizi
     */
    public int getDonusHizi() {
        return donusHizi;
    }

    /**
     * @param donusHizi the donusHizi to set
     */
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }
    
    public void saldir(){
        System.out.println(getBeybladeci()+  " " + saldiriGucu + " ve " + donusHizi + " ile saldırıyor...");
        
    }
    
   public void kutsalCanavarOrtayaCikar(){
       System.out.println("Bu beyblade'in kutsal canavarı yok");
   }
    
   
   public void bilgileriGoster(){
       
       System.out.println("Beybladeci İsmi : " + beybladeci);
       System.out.println("Saldırı Gücü : " + saldiriGucu);
       System.out.println("Dönüş Hızı : " + donusHizi);
       
   }
       
}
