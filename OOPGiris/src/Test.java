
public class Test {
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
    
        araba1.setModel("Porsche");
        
        System.out.println("Arabanın modeli " + araba1.getModel());
        
        araba1.setKapilar(-1);
        System.out.println("KAPI SAYISI " + araba1.getKapilar());
    }
    
}
