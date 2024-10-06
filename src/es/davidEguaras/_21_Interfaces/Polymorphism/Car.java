package es.davidEguaras._21_Interfaces.Polymorphism;

public class Car {
    private int currentSpeed;


    public Car(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public void move(int amount){
        this.currentSpeed += amount;
    }

    public void applyBreaks(int amount){
        this.currentSpeed -= currentSpeed;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }
}
