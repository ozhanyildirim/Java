
public class Araba {
    
    private String renk;
    private int kapilar;
    private int tekerlek;
    private String motor;
    private String model;
    
    
    
    public void setModel(String model){
        
        //String model1 yazsaydık this kullanmaya gerek yoktu
        
        this.model = model;
        
        
    }
    
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
       
        if (kapilar <0){
            System.out.println("KAPILAR 0 DAN KUCUK OLAMAZ");
        }
        else 
            this.kapilar = kapilar;
    }
}
