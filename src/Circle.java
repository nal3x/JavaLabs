public class Circle {
    double x, y; //center
    double radius;
    
    double surface() {
        return Math.PI * Math.pow(radius, 2);        
    }
    
    String hasEqualSurface(Circle c) {
        String s = new String("");
        if (this.surface() != c.surface()) 
            s += "not";
        return s + "equal";
    }
    
    public static void main (String[] args) {
        Circle c = new Circle();
        c.x = c.y = 1.0;
        c.radius = 1;
        
    }
    
    
    
}