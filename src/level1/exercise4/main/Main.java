package level1.exercise4.main;

import level1.exercise4.classManagement.ListDirectoryReadManagement;
import level1.exercise4.classManagement.Validator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (!Validator.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }
        String path = args[0];
        File rootDirectory = new File(path);

        ListDirectoryReadManagement manager= new ListDirectoryReadManagement(path);
        manager.loadDirectory(rootDirectory, 0);
    }
}
