package src;

public class Main implements Runnable{
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(main);
        thread.start();
    }

    @Override
    public void run() {
        GamePanel gp = new GamePanel();
        gp.start();
    }
}