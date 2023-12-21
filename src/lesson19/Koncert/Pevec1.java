package lesson19.Koncert;

public class Pevec1 extends Thread{
    private boolean needStop=false;
    @Override
    public void run() {
        int count=0;
        while (!needStop) {

            count++;
            if (count>3){
                needStop=true;
            }

            for (int i =0;i<2;i++){
                System.out.println("------------ LA" + Thread.currentThread().getName());

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

            // Мы засыпаем по этому монитору
            synchronized (Monitors.MICROFON){ // Критическая зона
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
