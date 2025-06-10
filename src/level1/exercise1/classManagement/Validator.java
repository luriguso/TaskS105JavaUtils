package level1.exercise1.classManagement;

public class Validator {
    public static boolean isValid(String[] args) {
        return args.length > 0 && args[0] != null && !args[0].trim().isEmpty();
    }
}
