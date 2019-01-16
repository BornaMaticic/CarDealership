package carDealership;

import cars.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Car> carCollection;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.carCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getCarCollection() {
        return carCollection;
    }


}
