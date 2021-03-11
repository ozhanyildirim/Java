
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Oyun extends JPanel implements KeyListener,ActionListener{

        Timer timer = new Timer(2,this);
             
        private int gecen_sure =0;
        private int harcanan_ates = 0;
        
        private BufferedImage image;
    
        private ArrayList<Ates> atesler = new ArrayList<Ates>();
    
        private int atesdirY = 1;
        private int topX = 0;
        
        private int topdirX = 2;
        private int gemiX=0;
        private int dirUzayX=20;
  

        public boolean kontrol(){
            for (Ates ates : atesler) {
                
                if(new Rectangle(ates.getX(),ates.getY(),2,30).intersects(new Rectangle(topX,0,20,20))){
                return true;
            }
            }
            return false;
            
        }

    public Oyun() {
   
                
        String dosyaYolu = "C:\\Users\\OZHAN\\Documents\\NetBeansProjects\\Oyun\\uzaygemisi.jpg";
            try {
                image = ImageIO.read(new FileImageInputStream(new File(dosyaYolu)));
            } catch (IOException ex) {
                Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
            }
           
      setBackground(Color.BLACK);
      timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        g.setColor(Color.red);
   g.fillOval(topX,0,20,20);
   g.drawImage(image,gemiX,490,image.getWidth()/5,image.getHeight()/7,this);
   
    for(Ates ates : atesler){
        if(ates.getY()<0){
            atesler.remove(ates);
        }}
        g.setColor(Color.GREEN);
    
        for(Ates ates : atesler){
            g.fillRect(ates.getX(), ates.getY(), 2, 30);
        }
    
        if(kontrol() ){
       
            timer.stop();



            String message = "TEBRİKLER KAZANDINIZ ... \n" + 
                    "Harcanan Ateş : " + harcanan_ates ;
            
     
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
   int c = e.getKeyCode();
        
        if(c == KeyEvent.VK_LEFT){
            if(gemiX <= 0 ) {
                gemiX =0;
            }
            else {
                gemiX -= dirUzayX;
            }
            
        }
        else if( c == KeyEvent.VK_RIGHT){
            if(gemiX >= 700 ) {
                gemiX =700;
            }
            else {
                gemiX += dirUzayX;
            }
        }
        
        else if (c == KeyEvent.VK_SPACE){
            atesler.add(new Ates(gemiX+49,460));
            harcanan_ates++;
            }
       }
    

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(Ates ates : atesler){
            ates.setY(ates.getY() - atesdirY);
        }
    
        topX += topdirX;
        
        if(topX >=750){
            topdirX = -topdirX;
            
        }
        if (topX <= 0 ){
            topdirX = -topdirX;
        }
    
        repaint();
    
    }

    private void intersects(Rectangle rectangle) {
    }
    
    
    
}
