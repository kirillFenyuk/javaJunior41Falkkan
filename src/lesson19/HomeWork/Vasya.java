package lesson19.HomeWork;

import lesson19.Koncert.Monitors;

public class Vasya extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {

        while (!needStop) {


            if (Main.count >= 10) {
                needStop = true;
            } else {
                Main.count++;

                if (Main.count % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + Main.count);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                synchronized (Monitors.MICROFON) {
                    Monitors.MICROFON.notify();
                }


                synchronized (Monitors.MICROFON) {
                    try {
                        Monitors.MICROFON.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


        }
    }
}
