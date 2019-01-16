package cars;

import behaviours.IFuel;
import components.Engine;
import components.Tyres;

public class DieselCar extends Car implements IFuel {

    private int fuelMeter;

    public DieselCar(int price, String colour, Engine engine, Tyres tyres, String type) {
        super(price, colour, engine, tyres, type);
        this.fuelMeter = 20;
    }

    public int getFuelMeter() {
        return fuelMeter;
    }

    @Override
    public void useFuel(int distance) {
        this.fuelMeter -= distance;

    }

    @Override
    public void increaseFuel(int diesel) {
        this.fuelMeter += diesel;
    }
}
