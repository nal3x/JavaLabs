public class Casting {

    public static void main(String[] args) {
        
        float f = 3.1415f; 

        /*suffix f is used in order for 3.1415 literal not to be treated as double
        in case we wrote float f = 3.1415
        int i = 5L; would invoke 
        "Uncompilable source code - incompatible types: possible lossy conversion from long to int
        */
        
        int i = 5;
        float f1 = (float) 32.3; //compiles
        float f3 = 32.3F;
        
        short x = 5, y = 12;
        short z = (short)(x + y); //needs explicit casting
        
        byte b = 3;
        b += 7; //implicit casting
        
        byte c = 3;
        c = (byte)(c + 7); //needs explicit casting

    }
    
}
