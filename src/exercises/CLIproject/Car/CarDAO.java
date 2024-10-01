package exercises.CLIproject.Car;

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

    public Car[] viewAllAvailableCars (){
        Car[] allCars = new Car[carCounter];
        //logic
        return allCars;
    }

    public Car[] viewAllElectricCars(){
        Car[] electricCars = new Car[carCounter];
        //logic
        return electricCars;
    }

}
