
public class BeybladeFabrika {
    
    public Beyblade beybladeUret(String beyblade_turu){
        
        if (beyblade_turu.equals("Dragon")){
            return new Dragon (800 ,"Takao", 300 , "Mavi Ejderha" , "Kutsal Canavarla Konuşma");
        }
        
          else if (beyblade_turu.equals("Dranza")){
            return new Dranza (600 ,"Kai", 400 , "Kırmızı Anka Kuşu");
        }
         else if (beyblade_turu.equals("Drayga")){
            return new Drayga (800 ,"Rei", 250 , "Beyaz Kaplan");
        }
        
         else if (beyblade_turu.equals("Draciel")){
            return new Draciel (400 ,"Max", 1000 , "Kara Kaplumbağa" );
        }
         else{
             return null;
         }
    }
    
}
