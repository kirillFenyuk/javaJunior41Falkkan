package lesson18;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyWithApache implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File descFile = new File(destination);
        if (descFile.exists()) {
            throw new FileAlreadyExistsException("Файл назначения уже существует: " + destination);
        }

        File original = new File(source);
        File copied = new File(destination);

        try {
            FileUtils.copyFile(original, copied);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
