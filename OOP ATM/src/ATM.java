
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        
        Logib login = new Logib();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BANKAMIZA HOSGELDINIZ...");
        System.out.println("*************************");
        System.out.println("KULLANICI GIRISI");
        System.out.println("*************************");
    
        int giris_hakki=3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("GİRİŞ BAŞARILI");
                break;
            }
            else{
                System.out.println("GİRİŞ BAŞARISIZ ...");
                giris_hakki-=1;
                System.out.println("KALAN GİRİS HAKKI : " + giris_hakki);
                
            }
            if(giris_hakki==0){
                System.out.println("GİRİŞ HAKKINIZ BİTTİ...");
                return;
                
            }
        }
        
        System.out.println("**************************");
        String islemler = "1. Bakiye Görüntüle\n"
                        +"2. Para Yatırma \n"
                        +"3.Para Çekme \n"
                            +"Çıkış için 'q' ya basınız ...";
        System.out.println(islemler);
        System.out.println("***************************");
    
        
        while(true){  
                System.out.println("İŞLEMİ SEÇİNİZ ...");
            islemler=scanner.nextLine();

           if (islemler.equals("q")){
               System.out.println("PROGRAMDAN ÇIKILIYOR...");
               break;   
        }
           else if(islemler.equals("1")){
               
            System.out.println("BAKİYENİZ  : " + hesap.getBakiye());
         
        }
        
        else if(islemler.equals("2")){
            System.out.println("YATIRILACAK TUTAR :");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            
            hesap.paraYatir(tutar);
            
            
        }
        else if(islemler.equals("3")){
            System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTAR");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraCek(tutar);
        }
        else{
            System.out.println("GEÇERSİZ İŞLEM ");
        }
           
           
        }
    
    
    
    
    
    
    
    
    
    
    }
}
