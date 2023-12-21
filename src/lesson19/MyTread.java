package lesson19;

public class MyTread extends Thread{
    @Override
    public void run() {

        for (int i=100;i<=120;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
