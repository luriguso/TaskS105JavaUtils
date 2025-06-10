package level2.exercise1.main;

import level2.exercise1.classManagement.ListDirectoryTreeManagement;
import level2.exercise1.classManagement.ConfigLoader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directoryToRead = ConfigLoader.getProperty("directory.to.read");
        String outputFileName = ConfigLoader.getProperty("output.file.name");
        String outputFileDirectory = ConfigLoader.getProperty("output.file.directory");
        if (directoryToRead == null || outputFileName == null || outputFileDirectory == null) {
            System.out.println("Error");
            return;
        }
        File rootDirectory = new File(directoryToRead);

        ListDirectoryTreeManagement manager= new ListDirectoryTreeManagement(outputFileDirectory, outputFileName);
        manager.loadDirectory(rootDirectory, 0);
    }
}
