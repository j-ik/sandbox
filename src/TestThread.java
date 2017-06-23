import java.util.Random;

/**
 * Created by jounikauremaa on 23/06/2017.
 */
public class TestThread extends Thread {

    private Random rand;
    private int id;
    private int suoritusKertaId;

    public TestThread (int id) {
        this.id = id;
        rand = new Random();
        suoritusKertaId = 1;
        start();
    }

    @Override
    public void run() {
        System.out.println("Säie id [" + id + "]" + " aloittaa");
        while (rand.nextInt(50) != 0) {
            try {
                Thread.sleep(rand.nextInt(2000) + 2000);
                System.out.println("Suorituksessa säie: " + id + ", " + suoritusKertaId++ + ":n kerran");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Säie id [" + id + "]" + "lopettaa");
    }
}
