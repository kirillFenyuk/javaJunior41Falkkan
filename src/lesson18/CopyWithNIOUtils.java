package lesson18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNIOUtils implements  FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File descFile = new File(destination);
        if (descFile.exists()) {
            throw new FileAlreadyExistsException("Файл назначения уже существует: " + destination);
        }

        Path copied = Paths.get(destination);
        Path originalPath = Paths.get(source);

        try {
            Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
