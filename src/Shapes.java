import java.awt.Graphics;
import javax.swing.JPanel;

/*
The access modifiers protected and private pertain only
to member classes within a directly enclosing class declaration.

So the next class cannot be private or protected.

If the next class is declared as public, it can be referred 
from any package.

Otherwise it can only be referred to from the same package (namespace).
*/

class Shapes extends JPanel { 
    private int choice;
    
    public Shapes(int userChoice) {
        choice = userChoice;
    }
    
        
    @Override
    public void paintComponent(Graphics g) {
        
        switch(choice) {
            case 1: //rectangles
                for (int i = 0; i < 10; i++) 
                    g.drawRect(10 + i*10, 10 + i*10, 50 + i*10, 10 + i*10);
                break;
            case 2: //ovals
                for (int i = 0; i < 10; i++)
                    g.drawOval(10 + i*10, 10 + i*10, 50 + i*10, 10 + i*10);
                break;
            case 3:
                int p1 = getWidth()/2;
                int p2 = getHeight()/2;
                for (int i = 10; i < 120; i+=10)
                    g.drawOval(p1 - i, p2 - i, 2 * i, 2 * i);      
        }//switch          
    }
}
      

    
    
 
