# README - Serializing and Deserializing an Object

## Description
This program serializes a "Car" object by generating a .ser file and deserializes it from the "Deserialize" class.

## Compilation Instructions
To compile the necessary Java classes and generate the .class files in the target/classes directory, use the following command:

javac -d target/classes src/level1/exercise5/classData/Car.java src/level1/exercise5/main/Main.java src/level1/exercise5/main/Deserialize.java

## Execution Instructions
To execute the main class (`main`), specify the class path (`target/classes`) and pass the directory path as an argument:

java -cp target/classes level1.exercise5.main.Main

This command will serialize a "Car" object. and will generate a "car.ser" file in the project root.

java -cp target/classes level1.exercise5.main.Deserialize

This command will look for the "car.ser" file in the project root, deserialize it, and display it in the console.

Example:
Object deserialized successfully.
Name: Chevrolet
Age: Camaro