package lesson19;

public class Main {
    public static void main(String[] args) {

        MyTread myTread = new MyTread(); //Первый вариант создания потока, путём наследования от класса Tread
        myTread.start();

        Thread myThread2 = new Thread(new MyTread2()); //Второй вариант создания потока, путём наследования от интерфейса Runnable
        myThread2.start();

        for (int i=0;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
