package lesson21;

import lesson18.FileCopyFailedException;
import lesson18.FileCopyUtils;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {
    private String from;
    private String to;
    private FileCopyUtils fileCopyUtils;

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils fileCopyUtils) {
        this.fileCopyUtils = fileCopyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            fileCopyUtils.copyFile(from,to);
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", fileCopyUtils=" + fileCopyUtils +
                '}';
    }
}
