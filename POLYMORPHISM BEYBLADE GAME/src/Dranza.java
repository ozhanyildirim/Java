
public class Dranza extends Beyblade {
    
    private String kutsalCanavar ;

    public Dranza(int saldiriGucu, String beybladeci, int donusHizi , String kutsalCanavar) {
        super(saldiriGucu, beybladeci, donusHizi);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
  
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor ..." );
        System.out.println(getBeybladeci() + "'ın saldırısı : Alev Kılıcı");
    
    }
    
    
    
    
}
