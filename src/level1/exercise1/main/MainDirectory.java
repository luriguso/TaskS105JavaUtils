package level1.exercise1.main;

import level1.exercise1.classManagement.ListDirectoryManagement;
import level1.exercise1.classManagement.Validator;

public class MainDirectory {
    public static void main(String[] args){
        if(!Validator.isValid(args))
        {
            System.out.println("Invalid Arguments");
            return;
        }

        new ListDirectoryManagement(args[0]);
    }
}
