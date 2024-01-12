package lesson21;

import lesson18.CopyWithNIOUtils;
import lesson18.CopyWithOneByteUtils;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("D:\\Видео\\InShot_20210925_204451973.mp4",
                "src\\lesson21\\copyTask1.mp4");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("D:\\Видео\\VID_20210621_163731.mp4",
                "src\\lesson21\\copyTask2.mp4");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("D:\\Видео\\VID_20210125_204414.mp4",
                "src\\lesson21\\copyTask3.mp4");

        task1.setFileCopyUtils(new CopyWithOneByteUtils());
        task2.setFileCopyUtils(new CopyWithNIOUtils());
        task3.setFileCopyUtils(new CopyWithNIOUtils());

        FindFilesTask task4 = new FindFileTaskImpl();
        task4.setDirectory("D:\\Видео");
        task4.setFileNameSearchString("а");
        task4.setPrintStream(System.out);

        FindFilesTask task5 = new FindFileTaskImpl();
        task5.setDirectory("D:\\Видео");
        task5.setFileNameSearchString("622");
        task5.setPrintStream(System.out);

        TasksStorage tasksStorage = new TaskStoregeImpl();
        tasksStorage.add(task4);
        tasksStorage.add(task1);
        tasksStorage.add(task5);
        tasksStorage.add(task3);
        tasksStorage.add(task2);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();

        executor1.setStorage(tasksStorage);
        executor2.setStorage(tasksStorage);
        executor3.setStorage(tasksStorage);

        executor1.start();
        executor2.start();
        executor3.start();


    }
}
