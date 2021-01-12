
public class Drayga extends Beyblade{
    
    private String kutsalCanavar;
    
    public Drayga(int saldiriGucu, String beybladeci, int donusHizi , String kutsalCanavar) {
        super(saldiriGucu, beybladeci, donusHizi);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
          System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        
         System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor ..." );
        System.out.println(getBeybladeci() + "'ın saldırısı : Kaplan Pençesi");
    }
    
    
}
