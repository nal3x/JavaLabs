public class Rectangle {
    double x, y; //center of our shape
    double width, height;
    
    double surface() {
        return width * height;        
    }
    
}

class Tester {
    public static void main (String[] args) {
        Rectangle rec1;
        rec1 = new Rectangle();
        
        rec1.x = rec1.y = 0.0;
        rec1.width = 4.0;
        rec1.height = 2.0;

        System.out.println("Surface of first rectangle is:" + rec1.surface());
        
    }
}
/*construct a second rectangle with arbitrary dimensions and compare its surface
to rec1
*/

/*homework: class Circle, having x,y and radius attributes. Provide a surface
method using Java.lang.Math.pow() and Math.PI
*/ 