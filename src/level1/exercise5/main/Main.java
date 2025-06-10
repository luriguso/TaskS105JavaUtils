package level1.exercise5.main;

import level1.exercise5.classData.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Camaro", "Chevrolet");

        try
                (FileOutputStream archive = new FileOutputStream("car.ser");
                 ObjectOutputStream exit = new ObjectOutputStream(archive)){
            exit.writeObject(car);
            System.out.println("object serialized successfully");
        }catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
