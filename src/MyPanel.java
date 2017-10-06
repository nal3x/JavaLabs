import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/*
JPanel is the canvas
Graphics object is the paintbrush
JFrame is the easel (kavaleto)
super.paintComponent(g) is the eraser
*/


public class MyPanel extends JPanel {
    private ImageIcon imIcon = new ImageIcon("dog.jpg");
    private Image image = imIcon.getImage();
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 10, 300, 300, null);
        g.drawString("Look at this dog", 0, 400);
        
        
        
//        int height = getHeight();
//        int width = getWidth();
//        g.drawLine(0, 0,width, height);
//        g.drawLine(0, height, width, 0);

//      int height = getHeight();
//        
//      for (int i = 0; i < 250 ; i+=12) {
//      g.drawLine(0, i, i, height);
//      }
        
        }
  
    
    public static void main (String[] args) {
        MyPanel panel = new MyPanel(); //προσθήκη panel
        JFrame frame = new JFrame("MyPanel"); //προσθήκη frame (παράθυρο)
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //το panel τοποθετείται στο frame
        frame.setSize(500, 500);
        frame.setVisible(true);   
        
        
    }
    
}
