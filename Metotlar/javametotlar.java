/* ÖZHAN NURÝ YILDIRIM */
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
   
/*  ERÝÞÝM BELÝRLEYÝCÝ(opsiyonel) extra_özellikler dönüþ_tipi fonk_adý(parametre) */


       // selam("murat   ");
     // selam("ayse ");
        
      //  selamlama();
      //  faktoriyel();
        
      //  toplama(5,5,6);
        
    }
    
}
