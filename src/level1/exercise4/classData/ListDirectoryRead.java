package level1.exercise4.classData;

import java.io.File;

public class ListDirectoryRead {
    private File[] fileList;

    public ListDirectoryRead(String directoryPath) {
        this.fileList = new File(directoryPath).listFiles();
    }

    public File[] getFileList() {
        return fileList;
    }
}
