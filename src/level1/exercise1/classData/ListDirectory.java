package level1.exercise1.classData;

public class ListDirectory {
    private String directory;

    public ListDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    @Override
    public String toString() {
        return "ListDirectory{" +
                "directory='" + directory + '\'' +
                '}';
    }
}
