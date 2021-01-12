
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OZHAN
 */
public class Test {
    
    
    public static void main(String[] args) throws InterruptedException {
        
      //  Account account1 = new Account();
        
      /*
        account1.setHesapNo("123124");
        account1.setBakiye(1000.0);
        account1.setIsim("Özhan Nuri YILDIRIM");
        account1.setEmail("ozhannuri@gmail.com");
        account1.setTelefonNo("0553 720 13 35");
        
        
        System.out.println( account1.getTelefonNo());
        
        
        //TEK TEK YAZMAYI ÖNLEMEK İÇİN
        
        */
      
      Account account2 = new Account("123",1684.50,"özhan nuri yıldırım","ozhannuri@gmail.com","5537201335");
 
  //  Account account2 = new Account();
   /*   account2.getEmail();
        System.out.println(account2.getEmail());*/
    //  Account account2 = new Account("ali","a@gmail","55555");
      
     //   System.out.println(account2.getEmail());
    //    System.out.println(account2.getBakiye());
        
        account2.bilgi();
        
      account2.paraYatir(2000);
        System.out.println("PARA ÇEKİLİYOR LÜTFEN BEKLEYİN");
      sleep(3000);
      account2.paraCekme(500);
      sleep(1000);
        System.out.println("PARA ÇEKME İŞLEMİ BAŞARILI");
      
    }
}
