import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

class RandPoints extends JPanel {
    
    public class Point {
        int x;
        int y;
        
        public Point() {
            x = 1 + (int)(Math.random()*100);
            y = 1 + (int)(Math.random()*100);
            
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        Random randNums = new Random();
        for (int i = 200; i > 0; i--) {
            Point p = new Point();
            System.out.println("Point generated:" + p.x + " " + p.y);
            int red = randNums.nextInt(255);
            int green = randNums.nextInt(255);
            int blue = randNums.nextInt(255);
            
            Color endColor = new Color(red, green, blue);
            g.setColor(endColor);
            g.drawOval(p.x,p.y,1,1);
            
            
        }
    }
}


public class RandomNums {
    
    public static void main (String[] args) {
        RandPoints panel = new RandPoints();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(110, 130);
        app.setVisible(true);
        
        //RandPoints.Point x = new RandPoints.Point(); //valid if Point is a static nested class
        //needs RandPoints instance if Point is not static
        
//        To create instance of an inner class
//        RandPoints panel2 = new RandPoints();
//        RandPoints.Point point = panel2.new Point();
        
        //If we make the points class private?
        
        

        
    }
}
