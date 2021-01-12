
import java.util.Scanner;



/**
 *
 * @author OZHAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scan = new Scanner(System.in);
        
        String islem = "İslemler :  \n"
                + "1. Kare Alan Hesapla \n"
                + "2. Üçgen Alan Hesapla \n"
                + "3. Daire Alan Hesapla\n"
                + "q. Çıkış \n";
        
        
        
        while(true){
            
            System.out.println(islem);
            System.out.println("Hangi Seklin Alanını Hesaplamak İstiyorsunuz ?");
            String tur = scan.nextLine();
            Sekil sekil =null;
            
            
            if(tur.equals("q")){
                System.out.println("Programdan Çıkılıyor . . .");
                break;
            }
            else if(tur.equals("1")){
                System.out.println("Karenin Kenarı  ");
                int kareKenar = scan.nextInt();
                scan.nextLine();
                
                sekil = new Kare("Kare" , kareKenar);
                sekil.alanHesapla();
            }
            else if (tur.equals("2")){
            System.out.println("Kenar 1 : ");
            int kenar1 =scan.nextInt();
            System.out.println("Kenar 2 : ");
            int kenar2 =scan.nextInt();
            System.out.println("Kenar 3 : ");
            int kenar3 =scan.nextInt();
            scan.nextLine();
            
            sekil = new Ucgen("Ucgen", kenar1,kenar2,kenar3);
            sekil.alanHesapla();
           
            
            
        }
            
            else if (tur.equals("3")){
                
                System.out.println("Dairenin Yarıçapı : ");
                int yaricap = scan.nextInt();
                            scan.nextLine();

                sekil =new Daire("Daire" , yaricap);
                sekil.alanHesapla();
            }
            else
            {
                System.out.println("GEÇERSİZ İŞLEM");
            }
            
        }
        
        
    }
    
}
