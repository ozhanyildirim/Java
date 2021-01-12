
import java.util.Scanner;

/**
 *
 * @author OZHAN
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {


        Scanner scan = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz");
        
        String islem = "işlemler \n"
                + "1. Daire Alanı Hesaplama\n"
                + "2. Üçgen Çevresi Hesaplama\n"
                + "3. 2 Vektörün İç Çarpımını Hesaplama\n"
                + "4. Karenin Alanını Hesaplama\n"
                + "5. İvme Hesaplama\n"
                + "q. Çıkış ";
        
        
        while(true){
            
            System.out.println(islem);
            System.out.println("İSLEMİ SECİNİZ : ");
            String islemler = scan.nextLine();
            
            
            if(islemler.equals("q")){
                System.out.println("Programdan Çıkılıyor ...");
                Thread.sleep(3000);
                break;
            }
            else if(islemler.equals("1")){
            
                    
                    System.out.print("Daire yarıçapını giriniz :");
                    int yaricap = scan.nextInt();
                    scan.nextLine();
                    
                        
                    Problem.Matematik daire = new Problem.Matematik();
                    
                    daire.daireAlan(yaricap);
                    
                    
                    
            }
            else if(islemler.equals("2")){
            
                    
                    System.out.print("Kenar 1 Giriniz :");
                    int kenar1 = scan.nextInt();
                       
                    System.out.print("Kenar 2 Giriniz :");
                    int kenar2 = scan.nextInt();
                       
                    System.out.print("Kenar 3 Giriniz :");
                    int kenar3 = scan.nextInt();
                    
                    
                    scan.nextLine();
                    
                   //      Problem.Matematik.daireAlan(kenar3); diye de yazabilirddik
                    Problem.Matematik ucgen = new Problem.Matematik();
                    ucgen.ucgenCevresi(kenar1,kenar2,kenar3);
                  
                    
                    
                    
            }else if (islemler.equals("3")){
                
             Vector vec1 = new Vector("Vektör1");
             Vector vec2 = new Vector("Vektör2");
             
             
             Problem.Fizik.icCarpim(vec1, vec2);
                              
         
                
            }
             else if(islemler.equals("4")){
            
                    
                    System.out.print("Karenin kenarını giriniz :");
                    int kenarKare = scan.nextInt();
                    scan.nextLine();
                    
                        
                    Problem.Matematik.kareAlan(kenarKare);
                    
                    
                    
            }
             else if(islemler.equals("5")){
                 
                 System.out.println("İvmesi Hesaplanacak Kütle ve Kuvveti giriniz");
                 
                 System.out.print("Kütle (m) giriniz :");
                 int kutle = scan.nextInt();
                  
                 System.out.print("Kuvvet (F) giriniz :");
                 int kuvvet = scan.nextInt();
                 
                 
                 Problem.Fizik.ivmeHesapla(kutle, kuvvet);
                 
                 
             }
            
            
            
        }
                
        
        
    }
    
}
