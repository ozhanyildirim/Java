import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {

    private String kullanici_adi = "root";
    private String parola ="";
    private String db_name = "demo";
    
    private String host = "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement =null;
    
    public void calisanlariGetir(){
        String sorgu = "Select * From calisanlar";
        
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id =rs.getInt("id");
                String ad= rs.getString("ad");
                   String soyad= rs.getString("soyad");
                      String email= rs.getString("email");
                      
                      System.out.println("ID : " + id + " AD :"+ad+" SOYAD :"  +soyad+ " EMAİL :"+email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanEkle() {
        
        try {
            statement = con.createStatement();
               String ad= "FURKAN";
                   String soyad= "KAYIKÇI";
                      String email= "furkankayikci@gmail.com";
                      
             String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES(" + "'" + ad + "'," + "'" + soyad + "'," + "'" + email + "')";            
                      statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        
    }
    public void calisanGuncelle(){
           
        try {
            statement = con.createStatement();
            
             String sorgu = "Update calisanlar set email = 'osiii@gmail.com' where id= 1";
                      statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void calisanSil() {
         try {
            statement = con.createStatement();
            
             String sorgu = "Delete from calisanlar where id> 4";
             int deger = statement.executeUpdate(sorgu);
             System.out.println(deger + " kadar veri etkilendi");
             
         } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Baglanti() {
        String url = "jdbc:mysql://" + host + ":"+port + "/"+db_name+"?useUnicode=true&characterEncoding=utf8";
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver bulunamadı");
            
        }
        try{
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı başarılı");
        }
        catch(SQLException ex){
            System.out.println("Bağlantı Başarısız");
        }
    
    } 
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();  
        baglanti.calisanlariGetir();
       // baglanti.calisanEkle();
      //  baglanti.calisanGuncelle();
      baglanti.calisanSil();
        System.out.println("AFTER **********************************");
        baglanti.calisanlariGetir();

    }
    
}
