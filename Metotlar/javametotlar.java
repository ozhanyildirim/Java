/* �ZHAN NUR� YILDIRIM */
import java.util.Scanner;

public class JAVAMETOTLAR {

    
    public static void selamlama() {
        
        System.out.println("MERHABALAR ");
        System.out.println("FAKTORIYEL HESAPLAYICIYA HOSGELDINIZ");
    }
    
    public static void faktoriyel(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        long sayi = scanner.nextLong();
        
        int fak=1;
        
        while(sayi>0){
            fak*=sayi;
            sayi--;
        }
        
        System.out.println("FAKTORIYEL : " +fak);
    }

    
    public static void selam(String isim){
        System.out.println("SELAMLAR " +isim);
    }
    
    public static void toplama(int a,int b , int c)
    {
        System.out.println("TOPLAMLARI = " + (a+b+c));
    }
    
    public static void main(String[] args) {
   
/*  ER���M BEL�RLEY�C�(opsiyonel) extra_�zellikler d�n��_tipi fonk_ad�(parametre) */


       // selam("murat   ");
     // selam("ayse ");
        
      //  selamlama();
      //  faktoriyel();
        
      //  toplama(5,5,6);
        
    }
    
}
