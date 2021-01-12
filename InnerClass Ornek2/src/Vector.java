
import java.util.Scanner;


/**
 *
 * @author OZHAN
 */
public class Vector {

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
 
  

    private String isim;


 
    private int i,j,k;
    
    
    public Vector(String isim){
        this.isim = isim;
        
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println(getIsim() + " i , j ve k değerlerini giriniz ...");
        System.out.print("i : ");
        this.i=scan.nextInt();
         System.out.print("j : ");
        this.j=scan.nextInt();
         System.out.print("k : ");
        this.k=scan.nextInt();
        
    }
    
}
