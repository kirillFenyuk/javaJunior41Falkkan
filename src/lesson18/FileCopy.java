package lesson18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // Путь бывает полный и относительный
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Фото на печать\\N_hW-jSKOHo.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\lesson18\\copy.jpg"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1) // Это не конец файла?
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
