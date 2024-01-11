package lesson21;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends AbstractTask implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File startDir = new File(directory);

        if (!startDir.exists()) {
            throw new TaskExecutionFailedException("Такой папки не существует!!! " + directory);
        }

        if (startDir.isFile()){
            throw new TaskExecutionFailedException("Это не папка!!! " + directory);
        }

        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().contains(searchString)){
                    return true;
                }
                return false;
            }
        });

        out.println("Результат выполнения задачи: -------------");
        for (File f: files) {
            out.println(f.getAbsoluteFile());
        }
        out.println("----------------------------------");
    }

    @Override
    public String toString() {
        return "FindFileTaskImpl{" +
                "directory='" + directory + '\'' +
                ", searchString='" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
