
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OZHAN
 */
public class Logib {
    
    public  boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        
        String kullanici;
        String parola;
        
            System.out.println("KULLANICI ADI :");
            kullanici = scanner.nextLine();
            System.out.println("PAROLA : ");
            parola = scanner.nextLine();
            
            if (hesap.getKullanici().equals(kullanici) && hesap.getParola().equals(parola)){
                
                return true;
            }
            else{
                return false;
            }
    }
}
