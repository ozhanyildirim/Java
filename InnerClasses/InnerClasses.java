

// STATIC INNER CLASS

public class Main {
    public static void main(String[] args) {
        
        
        Matematik.Alan alan = new Matematik.Alan();
        
        
        alan.daire_alan(5);
        Matematik.Alan.daire_alan(6);
        
        
    }
    
}




 // LOCAL INNER CLASS
/*
public class Main {
    public static void main(String[] args) {
        
        
        class  Alan {
            public void daire_alan(int yaricap) {
                
                System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
                
            }
        
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();
        
        alan.daire_alan(10);
        
        alan2.daire_alan(3);
        
        
    }
    public static void deneme() {
        
        //Alan alan1 = new Alan();
        
    }
    
}
*/



      // ANONIM INNERCLASS

/*

public class Main {
    public static void main(String[] args) {
        
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders çalışıyorum....");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum....");
                
            }
        };
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        
        System.out.println("******************************************************");
        
        AOgrenci ogrenci2 = new AOgrenci("Mustafa Murat Coşkun",314) {
            @Override
            void kayit_yaptir() {
                
                System.out.println("Kayıt Yapılıyor...." + " İsim :" + getIsim() + " Numara: " + getNumara());
                
                
            }
        };
        
        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();
        
        
    
    
    }
    public static abstract class AOgrenci {
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        abstract void kayit_yaptir();
        
        public void selamla() {
            
            System.out.println("Selamlar...");
        }
    }
    public interface IOgrenci{
        
        void ders_calis();
        void derse_gir();
        
    }
}

*/
