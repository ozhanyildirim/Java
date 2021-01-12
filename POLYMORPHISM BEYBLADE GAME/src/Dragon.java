
public class Dragon extends Beyblade {
    
    private String kutsalCanavar;
    private String gizliYetenek;
    
    public Dragon(int saldiriGucu, String beybladeci, int donusHizi , String kutsalCanavar , String gizliYetenek) {
        super(saldiriGucu, beybladeci, donusHizi);
        this.gizliYetenek=gizliYetenek;
        this.kutsalCanavar=kutsalCanavar;
                
                
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
                  System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
                  System.out.println("Gizli Yetenek : " + gizliYetenek);

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor ..." );
        System.out.println(getBeybladeci() + "'ın Saldırısı : Hayalet Kasırgası");

    }
    
}
