package com.kevinmichie;

/**
 * Created by kevinmichie on 4/2/16.
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';


    public void printVariables(){

        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);

    }

    public void wreckCar(){
        condition = 'C';
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        Car aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice's Car:");
        aliceCar.printVariables();

    }
}
