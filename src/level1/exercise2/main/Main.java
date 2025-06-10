package level1.exercise2.main;

import level1.exercise2.classManagement.ListDirectoryTreeManagement;
import level1.exercise2.classManagement.Validator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (!Validator.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }
        String path = args[0];
        File rootDirectory = new File(path);

        ListDirectoryTreeManagement manager= new ListDirectoryTreeManagement(path);
        manager.loadDirectory(rootDirectory, 0);
    }
}
