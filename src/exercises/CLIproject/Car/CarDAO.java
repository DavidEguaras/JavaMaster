package exercises.CLIproject.Car;

import exercises.CLIproject.EngineType;

public class CarDAO {
    public static Car[] cars = new Car[500];
    public static int carCounter = 0;

    public boolean addCar (Car car){
        if(carCounter < cars.length){
            cars[carCounter] = car;
            carCounter++;
            return true;
        }else{
            System.out.println("The cars array is full");
            return false;
        }
    }

    public Car getCarById(int id){
        for (int i = 0; i < carCounter; i++) {
            if(cars[i].getId() == id){
                return cars[i];
            }
        }
    }

    public Car[] viewAllAvailableCars (){
        Car[] allAvailableCars = new Car[carCounter];
        int availableCarsCounter = 0;
        for(int i = 0; i < carCounter; i++){
            if(cars[i].isAvailable()){
                System.out.println(cars[i].toString());
                allAvailableCars[availableCarsCounter] = cars[i];
                availableCarsCounter++;
            }
        }
        return allAvailableCars;
    }

    public Car[] viewAllElectricCars(){
        Car[] electricCars = new Car[carCounter];
        int electricCarsCounter = 0;
        for (int i = 0; i < carCounter; i++) {
            if(cars[i].getEngineType() == EngineType.ELECTRIC){
                System.out.println(cars[i].toString());
                electricCars[electricCarsCounter] = cars[i];
                electricCarsCounter++;
            }
        }
        //logic
        return electricCars;
    }

}
