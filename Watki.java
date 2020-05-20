import java.util.Random;

public class Watki extends Thread {
    public static int t = 3;

    @Override
    public void run(){

        Random r = new Random();
        int a = r.nextInt(8);
        System.out.println(a+"    "+" ID: "+Thread.currentThread().getId());
        try {
            Thread.sleep(t*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Gui.guzik.setEnabled(true);
        Gui.mWatek.setEnabled(true);
        Gui.text.setText("");
    }

}