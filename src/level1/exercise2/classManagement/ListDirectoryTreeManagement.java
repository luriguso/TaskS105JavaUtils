package level1.exercise2.classManagement;

import level1.exercise2.classData.ListDirectoryTree;

import java.io.File;
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
            String space = "";
            for(int i = 0; i < level; i++) {
                space = space + "  ";
            }
            System.out.printf(space + "%s %s - Last Modified: %s%n", type, file.getName(), lastModified);

            if (file.isDirectory()) {
                loadDirectory(file, level + 1);
            }
        }
    }
}
