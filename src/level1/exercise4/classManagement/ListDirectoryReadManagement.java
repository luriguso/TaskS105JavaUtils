package level1.exercise4.classManagement;

import level1.exercise4.classData.ListDirectoryRead;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ListDirectoryReadManagement {
    private ListDirectoryRead listDirectoryRead;

    public ListDirectoryReadManagement(String relativePath) {
        this.listDirectoryRead = new ListDirectoryRead(relativePath);
    }

    public void loadDirectory(File directory, int level) {
        if (!directory.exists()) {
            System.out.println("The directory does not exist");
            return;
        }
        if (!directory.isDirectory()) {
            System.out.println("The specified path is not a directory");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("The directory is empty");
            return;
        }
        Arrays.sort(files);
        for (File file : files) {
            System.out.println("File name: " + file.getName());
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                ReaderFile.readTxt(file.getPath());
            }
        }
    }

    public void saveDirectoryTree(String lineDirectory){
        try {
            FileWriter file = new FileWriter("src/level1/exercise3/files/directoryTree.txt", true);
            file.write("\n"+lineDirectory);
            file.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
