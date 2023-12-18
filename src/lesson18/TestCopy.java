package lesson18;

public class TestCopy {
    public static void main(String[] args) {

        CopyWithOneByteUtils copyWithOneByteUtils = new CopyWithOneByteUtils();
        CopyWithNIOUtils copyWithNIOUtils = new CopyWithNIOUtils();
        CopyWithGuava copyWithGuava = new CopyWithGuava();


        // Сделать ещё тесты технологий



        long time1 = System.currentTimeMillis();
        try {
            copyWithOneByteUtils.copyFile("D:\\Видео\\InShot_20210925_204451973.mp4", "src\\lesson18\\copy.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();

        System.out.println("Copy with one byte: " + (time2 - time1));




        long time3 = System.currentTimeMillis();
        try {
            copyWithNIOUtils.copyFile("D:\\Видео\\InShot_20210925_204451973.mp4", "src\\lesson18\\copy1.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time4 = System.currentTimeMillis();

        System.out.println("Copy with one byte: " + (time4 - time3));


        long time5 = System.currentTimeMillis();
        try {
            copyWithGuava.copyFile("D:\\Видео\\InShot_20210925_204451973.mp4", "src\\lesson18\\copy2.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time6 = System.currentTimeMillis();

        System.out.println("Copy with one byte: " + (time6 - time5));
    }
}
