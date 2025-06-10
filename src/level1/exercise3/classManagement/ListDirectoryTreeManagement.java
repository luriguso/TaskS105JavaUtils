package level1.exercise3.classManagement;

import level1.exercise3.classData.ListDirectoryTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListDirectoryTreeManagement {
    private ListDirectoryTree listDirectoryTree;

    public ListDirectoryTreeManagement(String relativePath) {
        this.listDirectoryTree = new ListDirectoryTree(relativePath);
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
            String type = file.isDirectory() ? "[D]" : "[F]";
            String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(file.lastModified());
            //System.out.printf("%s %s - Last Modified: %s%n", type, file.getName(), lastModified);
            String line = type + file.getName() + "- Las Modifications: " +  lastModified;
            saveDirectoryTree(line);
            if (file.isDirectory()) {
                loadDirectory(file, level + 1);
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
