package com.kevinmichie;

/**
 * Created by kevinmichie on 4/2/16.
 */
public class Car {
    //These are declared instances
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    //Setters and getters

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }

    public void setTheCarOn(boolean theCarOn) {
        isTheCarOn = theCarOn;
    }

    public char getCondition() {
        return this.condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfCar() {
        return this.nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public double getMaxFuel() {
        return this.maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() {
        return this.currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getNumberOfPeopleInCar() {
        return numberOfPeopleInCar;
    }

    public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
        this.numberOfPeopleInCar = numberOfPeopleInCar;
    }


    //This is a method
    public void printVariables(){

        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    //This is also a method
    public void upgradeMinSpeed(){
     setMaxSpeed(getMaxSpeed() + 10);
    }

    //This is definitely a method
    public void wreckCar(){
        condition = 'C';
    }

    //LOL so many methods, I must be MethodMan
    public void fixedCar() { condition = 'A';}

    public void getOut(){
        if(this.numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        }
        else{
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }

    public void getIn(){
        numberOfPeopleInCar++;
    }

    public double howManyTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn){
            isTheCarOn = true;
        }
        else{
            System.out.println("The car is already on" + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.5, true);
        System.out.println("Birthday Car v1:");
        //methods do stuff to instances
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: " + birthdayPresent.howManyTillOutOfGas());
        System.out.println("Max Miles: " +birthdayPresent.maxMilesPerFillUp());

        System.out.println("Birthday Car v2:");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();

        System.out.println("Birthday Car v3:");
        birthdayPresent.printVariables();
        //System.out.println("Christmas Car:");
        //Car christmasPresent = new Car(550, 2000, false);
        //christmasPresent.printVariables();



    }
}
