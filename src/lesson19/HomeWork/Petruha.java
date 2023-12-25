package lesson19.HomeWork;

import lesson19.Koncert.Monitors;

public class Petruha extends Thread{
    @Override
    public void run() {
        while (true){

            synchronized (Monitors.MICROFON) {
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            Main.count++;
            if (Main.count%2==0){
                System.out.println(Thread.currentThread().getName()+Main.count);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }

        }
    }
}
