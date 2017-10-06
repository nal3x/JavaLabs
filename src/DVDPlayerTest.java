class DVDPlayer {
    boolean recorder;
    
    void recordDVD() {
        System.out.println("DVD recording ...");
    }
    
    void playDVD() {
        System.out.println("DVD playing ...");
    }
}

public class DVDPlayerTest {
    public static void main(String args[]) {
        DVDPlayer d = new DVDPlayer();
        d.recorder = true;
        d.playDVD();
        if (d.recorder == true) d.recordDVD();
          
          
        
    }
    
}
