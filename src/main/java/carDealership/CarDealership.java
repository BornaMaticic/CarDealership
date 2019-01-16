package carDealership;

import behaviours.IElectric;
import behaviours.IFuel;
import cars.Car;

import java.util.ArrayList;

public class CarDealership {

    private String name;
    private Till till;
    private ArrayList<Car> cars;

    public CarDealership(String name, Till till) {
        this.name = name;
        this.till = till;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void removeCar(Car car){
        this.cars.remove(car);
    }

    public void sellCar(Customer customer, Car car){
        environmentCashBack(car);
        pollutionTax(car);
        this.till.putMoneyInTill(car.getPrice());
        customer.buyCar(car);
        removeCar(car);
    }



    public void environmentCashBack(Car car){
        if (car instanceof IElectric){
            car.changeCarPrice(-1000);
        }
    }

    public void pollutionTax(Car car){
        if (car instanceof IFuel){
            car.changeCarPrice(1000);
        }
    }

}
