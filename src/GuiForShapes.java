import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
JPanel is the canvas
Graphics object is the paintbrush
JFrame is the easel (kavaleto)
super.paintComponent(g) is the eraser
*/

class GuiForShapes {
    
    public static void main (String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + 
                "Enter 2 to draw ovals\n" + "Enter 3 to draw concentric cycles");
        int choice = Integer.parseInt(input);
        
        Shapes panel = new Shapes(choice);
        
        JFrame app = new JFrame("Draw some shape");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
    
}
