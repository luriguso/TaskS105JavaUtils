package level1.exercise5.main;

import level1.exercise5.classData.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args){
        try(
                FileInputStream archiveInput = new FileInputStream("car.ser");
                ObjectInputStream entry = new ObjectInputStream(archiveInput)){

            Car deserializedCar = (Car) entry.readObject();
            System.out.println("Object deserialized successfully.");
            System.out.println("Name: " + deserializedCar.getBrand());
            System.out.println("Age: " + deserializedCar.getModel());
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization: "+e.getMessage());
        }
    }
}
