package lesson19.Koncert;

public class Pevec2 extends Thread{

    public void run() {

        while (true) {

            // Мы засыпаем по этому монитору
            synchronized (Monitors.MICROFON){ // Критическая зона
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            for (int i =0;i<1;i++){
                System.out.println("LEND ------------" + Thread.currentThread().getName());

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Мы будим того кто спит по этому монитору
            synchronized (Monitors.MICROFON){ // Критическая зона
                Monitors.MICROFON.notify();
            }


        }
    }
}
