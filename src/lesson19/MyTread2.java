package lesson19;

public class MyTread2 implements Runnable{
    @Override
    public void run() {

        for (int i=1000;i<=1040;i++){
            System.out.println(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
