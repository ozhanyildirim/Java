
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        System.out.println("Beyblade Programına Hosgeldiniz");
        System.out.println("Çıkış için q'ya basınız");
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ?");
            String secim = scan.nextLine();
            
            
            
            if(secim.equals("q")){
                System.out.println("Oyundan Çıkılıyor");
                break;
            }
            else{
                BeybladeFabrika fabrika = new BeybladeFabrika();
                Beyblade beyblade = fabrika.beybladeUret(secim);
                
                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade ismi girin");
                    
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
                
            }
            
        }
        
    }
    
}
