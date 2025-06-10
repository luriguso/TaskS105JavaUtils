# README - Recursive directory listing and saving to a text file using a Java Properties file.

##Description
This program recursively lists the contents of a directory and its subdirectories, displaying them in alphabetical order within each level. It also indicates whether each entry is a **directory (D)** or a **file (F)** and displays the last modification date for each item, saving it to a text file and obtaining parameters from a Java Properties file.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the `target/classes` directory, use the following command:

javac -d target/classes src/level2/exercise1/classData/ListDirectoryTree.java src/level2/exercise1/classManagement/ListDirectoryTreeManagement.java src/level2/exercise1/classManagement/ConfigLoader.java src/level2/exercise1/main/Main.java

## Execution Instructions
To execute the main class (`main`), specify the class path (`target/classes`) and pass the directory path as an argument:

java -cp target/classes level2.exercise1.main.Main

This command will execute the program that retrieves the parameters "directoryToRead, outputFileName, outputFileDirectory" from the file "config.properties" located in the "src/resources" path will, with these parameters, list the contents of the `level1` directory in alphabetical order and generate a file called "directoryTree.txt" in the `src/level2/exercise1/files` path.

Notes
- Make sure the provided directory exists and is accessible.
- The program will list all files and subdirectories in alphabetical order.
- Modify the directory path argument as needed for different locations.