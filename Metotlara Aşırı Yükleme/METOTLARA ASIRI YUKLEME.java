/* ÖZHAN NURÝ YILDIRIM */
package javametotlar;

import java.util.Scanner;

public class JAVAMETOTLAR {

  

    
  /*  public static int toplama(int a,int b , int c)
    {
        return (a+b+c);
    }
     public static int ikicarp(int a) {
        return a*2;
    }
    
    public static int ikitop(int a){
        return a+2;
        
    }
    
    public static int dortcarp(int a){
        return a*4;
    }
    public static void main(String[] args) {
   

        System.out.println("ÇIKTI :  "  + toplama(455,500,600)); 
        
         System.out.println("SONUÇ " + dortcarp(ikitop(ikicarp(8))));
        
        */
    
    
    //  METOTLARDA AÞIRI YÜKLEME 
     /*  
    public static void skor(String ad , int puan){
         
        System.out.println(ad + " isimli oyuncunun " + puan + " puaný var. ");
    }
     public static void skor( int puan){
         
        System.out.println("isimsiz oyuncunun "  + puan + " puaný var. ");
    }
      public static void skor(String ad){
         
        System.out.println(ad + " isimli oyuncunun  puaný yok. ");
    }
    
         
          public static void main(String[] args) {
              
                skor("mehmet",300);
                skor(700);
                skor("mehmet");
              
          }
          
    }
    */
    
    // 1-1000 arasý asal sayýlarý yazdýrma
    
   /* public static boolean asal(int sayi) {
        
        for (int i=2 ; i<sayi ; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        
        for (int i=2 ; i<1000 ; i++){
            
            if (asal(i)){
                System.out.println("asal sayilar " + i);
            }
        }
        
    }   
    
    */
    
    
    
    // DISARDAN GIRILEN SAYININ EBOBUNU BULMA
    
    /*
    public static int ebob(int sayi1 , int sayi2){
        
        int ebob = 1;
        
        for (int i = 1; i<=sayi1 && i<=sayi2 ; i++){
            if(sayi1%i==0 && sayi2 %i==0){
                ebob = i;
                
            }
        }
        return ebob;
        
    }
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. SAYI : ");
        int birinci_sayi = scan.nextInt();
        
        System.out.println("2. SAYI : ");
        int ikinci_sayi = scan.nextInt();
        
        System.out.println("IKI SAYININ EBOBU : " +ebob(birinci_sayi,ikinci_sayi));
    }
    
   */
    
    
    
    
    // METOTLARA AÞIRI YÜKLEME ÝLE HESAP MAKÝNESÝ
   /* 
    public static int cikarma(int a,int b)
    {
        return(a-b);
        
    }
    
    public static int toplama(int a,int b)
    {
        return(a+b);
        
    }
    public static int carpma(int a,int b)
    {
        return(a*b);
        
    }
    public static double bolme(int a,int b)
    {
        return((double)a/b);
        
    }
     public static int toplama(int a,int b, int c)
    {
        return(a+b+c);
        
    }
     public static int carpma(int a,int b,int c)
    {
        return(a*b*c);
        
    }
     
     public static void main (String[] args){
     
     String islemler = "1. toplama islemi \n"
                       +"2. cikarma islemi \n"
                        +"3. carpma islemi \n"
                           +"4. bolme islemi \n"
                            +"Programdan çýkma için q'ya basýnýz";
         System.out.println("****************************");
         System.out.println(islemler);
         System.out.println("****************************");
         
         
         while(true){
             System.out.println("ISLEMI SECINIZ ...");
               System.out.println("****************************");
             System.out.println(islemler);
             System.out.println("****************************");

             Scanner scanner = new Scanner(System.in);
             String islem = scanner.nextLine();
             
             if(islem.equals("q")){
                 System.out.println("programdan çýkýlýyor ...");
                 break;
               
             }
              if(islem.equals("1")){
              System.out.println("KAÇ SAYI TOPLAYACAKSINIZ ? (2 VEYA 3) : ");
             
              int kacsayi = scanner.nextInt();
              
              if(kacsayi==2){
                  System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  scanner.nextLine();
                  
                  System.out.println("GIRILEN SAYILARIN TOPLAMI :" + toplama(a,b));
              }
              if(kacsayi==3){
                  
               System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  System.out.println("3. sayi :");
                  int c = scanner.nextInt();
                  scanner.nextLine();
                  
                System.out.println("GIRILEN SAYILARIN TOPLAMI :" + toplama(a,b,c));
     
             }
          
     }
             else if(islem.equals("2")){
                     System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  scanner.nextLine();
             System.out.println("GIRILEN SAYILARIN FARKLARI :" + cikarma(a,b));

               }
           else if(islem.equals("3")){
                    
               
              System.out.println("KAÇ SAYI ÇARPACAKSINIZ ? (2 VEYA 3) : ");
             
              int kacsayi = scanner.nextInt();
              
              if(kacsayi==2){
                  System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  scanner.nextLine();
                  
                  System.out.println("GIRILEN SAYILARIN ÇARPIMI :" + carpma(a,b));
              }
              if(kacsayi==3){
                  
               System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  System.out.println("3. sayi :");
                  int c = scanner.nextInt();
                  scanner.nextLine();
                  
                System.out.println("GIRILEN SAYILARIN ÇARPIMI :" + carpma(a,b,c));
     
             }
              
             
              
         }
               else if(islem.equals("4"))
              {
                  System.out.println("1. sayi :");
                  int a = scanner.nextInt();
                  System.out.println("2. sayi :");
                  int b = scanner.nextInt();
                  scanner.nextLine();
             System.out.println("GIRILEN SAYILARIN BOLUMU :" + bolme(a,b));

               }
              
              else
                   System.out.println("YANLIS GIRIS YAPTINIZ");
         }  
              
     
     
}}


*/