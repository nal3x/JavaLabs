public class Visibility {
    static int i;
    static String[] s = new String[10];

    static void aMethod() {
        int j = 10; //must be initialized!!!
        int[] a= new int[5];


        System.out.println("Local j:" + j);
        System.out.println("Local array ref:" + a[3]);

    }

    public static void main (String[] args) {
        System.out.println("Field i: " +i);
        System.out.println("Field array ref: " + s[2]);
        aMethod();
    }
}
