# README - List Directory Alphabetically

## Description
This program lists the contents of a directory in alphabetical order.
The directory to be listed is received as a parameter during execution.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:

javac -d target/classes src/level1/exercise1/classData/ListDirectory.java src/level1/exercise1/classManagement/ListDirectoryManagement.java src/level1/exercise1/classManagement/Validator.java src/level1/exercise1/main/MainDirectory.java

## Execution Instructions
To execute the main class (`main`), specify the classpath (`target/classes`)
and pass the directory path as an argument:

java -cp target/classes level1.exercise1.main.MainDirectory  ".\src\level1"


This command will list the contents of the `level1` directory in alphabetical order.

## Notes
- Ensure that the provided directory exists and is accessible.
- The program will list all files and subdirectories alphabetically.
- Modify the directory path argument as needed for different locations.