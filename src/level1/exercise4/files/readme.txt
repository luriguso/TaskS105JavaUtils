# README - .txt File Reader

## Description
This program displays the contents of .txt files from a specified path to the console.

## Compilation Instructions
To compile the necessary Java classes and generate the .class files in the target/classes directory, use the following command:

javac -d target/classes src/level1/exercise4/classData/ListDirectoryRead.java src/level1/exercise4/classManagement/ListDirectoryReadManagement.java src/level1/exercise4/classManagement/Validator.java src/level1/exercise4/classManagement/ReaderFile.java src/level1/exercise4/main/Main.java

## Execution Instructions
To execute the main class (`main`), specify the class path (`target/classes`) and pass the directory path. as an argument:

java -cp target/classes level1.exercise4.main.Main ".\src\level1\exercise4\files"

This command will display the contents of the .txt files in the `.\src\level1\exercise4\files` directory.

Notes
- Make sure the provided directory exists and is accessible.
- The program will list all files and subdirectories in alphabetical order.
- Modify the directory path argument as needed for different locations.