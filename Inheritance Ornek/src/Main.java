
import java.awt.BorderLayout;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ÇALIŞANLAR PROGRAMINA HOŞGELDİNİZ");
        
        String islemler = "İşlemler ... \n" + "1. Yazılımcı İşlemleri \n"  + "2. Yonetici İşlemleri \n " + "ÇIKIŞ İÇİN q ya basınız ";
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
    
    while(true){
            System.out.println("İŞLEMİ SEÇİNİZ");
   
            String islem = scanner.nextLine();
    
    if(islem.equals("q")){
        System.out.println("ÇIKIŞ YAPILIYOR ");
        break;
    }
    else if (islem.equals("1"))
    {
        Yazilimci yazilimci = new Yazilimci ("ÖZHAN NURİ","YILDIRIM",534,"JAVA,C++,C#");
        String yazilimci_islem = "1. Format At \n" 
                + "2. Bilgileri Göster \n" 
                + "çıkış için q ya basınız";
        
        System.out.println(yazilimci_islem);
      
          while(true){
            System.out.println("İŞLEMİ SEÇİNİZ");
         String y_islem = scanner.nextLine();
            if(y_islem.equals("q")){
        System.out.println("ÇIKIŞ YAPILIYOR ");
        break;
    }
            else if (y_islem.equals("1")){
                System.out.println("İŞLETİM SİSTEMİ : ");
                String isletim_sistemi = scanner.nextLine();
                yazilimci.formatAt(isletim_sistemi);
            }
            else if (y_islem.equals("2")){
                yazilimci.bilgileriGoster();
            }
            else {
                System.out.println("HATALI İSLEM");
            }
        
    }
    }
    else if(islem.equals("2")){    
        Yonetici yonetici = new Yonetici ("ALİ","CANDAN",1,150);
        String yonetici_islem = "YONETICI ISLEMLERİ \n"+
                                "1. Zam Yap \n"+
                                 "2. Bilgileri Goster \n"+
                                  "Çıkış için q ya basınız ";
        System.out.println(yonetici_islem);
        
        while(true){
            System.out.println("İŞLEMİ SEÇİNİZ");
         String y_islem = scanner.nextLine();
            if(y_islem.equals("q")){
        System.out.println("YONETICIDEN ÇIKIŞ YAPILIYOR ");
            break;
            }
        else if (y_islem.equals("1")){
                
                System.out.println("NE KADAR ZAM İSTİYORSUNUZ ? ");
                int zam = scanner.nextInt();
                scanner.nextLine();
                yonetici.zamYap(zam);
                
                }
        
        else if (y_islem.equals("2")){
            yonetici.bilgileriGoster();
        }
        else{
                System.out.println("HATALI SEÇİM ");
        }
    }    
    }
   
    else{
        System.out.println("YANLIŞ GİRİŞ YAPTINIZ");
        
    }
    
    
    
        }
}

}