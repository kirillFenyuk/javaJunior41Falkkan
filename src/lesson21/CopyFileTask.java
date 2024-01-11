package lesson21;


import lesson18.FileCopyUtils;

/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version 1.0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param fileCopyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(FileCopyUtils fileCopyUtils);
}
