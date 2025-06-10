# README - Recursive Directory Listing and Saving to a Text File

## Description
This program recursively lists the contents of a directory and its subdirectories, displaying them in alphabetical order within each level. It also indicates whether each entry is a **directory (D)** or a **file (F)** and displays the last modification date for each item, saving it to a Text file.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the `target/classes` directory, use the following command:

javac -d target/classes src/level1/exercise3/classData/ListDirectoryTree.java src/level1/exercise3/classManagement/ListDirectoryTreeManagement.java src/level1/exercise3/classManagement/Validator.java src/level1/exercise3/main/Main.java

## Execution Instructions
To execute the main class (`main`), specify the class path (`target/classes`) and pass the directory path as an argument:

java -cp target/classes level1.exercise3.main.Main  ".\src\level1"

This command will list the contents of the `level1` directory in alphabetical order and generate a file "directoryTree.txt" in the path `src/level1/exercise3/files`

Notes
- Ensure the provided directory exists and is accessible.
- The program will list all files and subdirectories in alphabetical order.
- Modify the directory path argument as needed for different locations.