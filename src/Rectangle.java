public class Rectangle {
    double x, y; //center of our shape
    double width, height;
    
    double surface() {
        return width * height;        
    }
    
    String hasEqualSurface(Rectangle r) {
        String s = new String("");
        if (this.surface() != r.surface()) 
            s += "not";
        return s + "equal";
    }
    
}

class Tester {
    public static void main (String[] args) {
        Rectangle rec1;
        rec1 = new Rectangle();
        
        rec1.x = rec1.y = 0.0;
        rec1.width = 3.0;
        rec1.height = 2.0;
        
        Rectangle rec2 = new Rectangle();
        
        rec2.x = 1.0;
        rec2.y = -1.0;
        rec2.width = 1.0;
        rec2.height = 6.0;

        System.out.println("Surface of first rectangle is: " + rec1.surface());
        System.out.println("Surface of second rectangle is: " + rec2.surface());
        
//        String s = new String("equal");
//        if (rec1.surface() != rec2.surface()) 
//            s = "not " + s;
//        System.out.println("Surfaces of the two shapes are " + s);

        System.out.println("Rectangle 1 surface is " + 
                rec1.hasEqualSurface(rec2) +
                " to Rectangle 2 surface");
            
        
    }
}
/*construct a second rectangle with arbitrary dimensions and compare its surface
to rec1
*/

/*homework: class Circle on a new file, having x,y and radius attributes. Provide a surface
method using Java.lang.Math.pow() and Math.PI
*/ 