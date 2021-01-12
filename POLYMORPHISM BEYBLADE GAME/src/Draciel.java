/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OZHAN
 */
public class Draciel extends Beyblade {
    
    private String kutsalCanavar;

    public Draciel(int saldiriGucu, String beybladeci, int donusHizi , String kutsalCanavar) {
        super(saldiriGucu, beybladeci, donusHizi);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
              System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
           System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor ..." );
        System.out.println(getBeybladeci() + "'ın Savunması : Kale Savunması");

    }
    
}
