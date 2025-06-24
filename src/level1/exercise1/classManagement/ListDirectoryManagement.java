package level1.exercise1.classManagement;

import level1.exercise1.classData.ListDirectory;

import java.io.File;
import java.util.Arrays;

public class ListDirectoryManagement {
    private ListDirectory listDirectory;

    public ListDirectoryManagement(String directory) {
        this.listDirectory = new ListDirectory(directory);
        loadDirectory();
    }

    public void loadDirectory() {
        String directoryPath = listDirectory.getDirectory();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){

            File[] files = directory.listFiles();
            if (files != null && files.length > 0){
                Arrays.sort(files);
                for (File file:files){
                    System.out.println(file.getName());
                }

            }else {
                System.out.println("The directory is empty");
            }
        }else{
            System.out.println("the directory does not exist");
        }
    }
}
