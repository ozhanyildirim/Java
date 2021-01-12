/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OZHAN
 */
public class Hesap {
    
    private String kullanici;
    private String parola;
    private int bakiye; 

    public Hesap(String kullanici, String parola, int bakiye) {
        this.kullanici = kullanici;
        this.parola = parola;
        this.bakiye = bakiye;
        
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){
        this.bakiye += tutar;
        System.out.println("Yeni Bakiyeniz : " + tutar);
                
    }
    public void paraCek(int tutar){
        
        if (bakiye-tutar<0){
            System.out.println("YETERLİ BAKİYENİZ YOK ...");
            
        }
        else{
            bakiye -= tutar;
            System.out.println("YENİ BAKİYENİZ : " + bakiye);
        }
    }
    
    
}
