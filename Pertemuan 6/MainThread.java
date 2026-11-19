package TugasP6;
public class MainThread {
    public static void main(String[] args) {
        ThreadBaru t1 = new ThreadBaru();
        t1.start(); 
    }
}
class ThreadBaru extends Thread {
    @Override
    public void run() {
        System.out.println("berjalan...");
    }
}
