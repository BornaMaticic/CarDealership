package cars;

import behaviours.IElectric;
import behaviours.IFuel;
import components.Engine;
import components.Tyres;

public class HybridCar extends Car implements IElectric, IFuel {

    private int powerMeter;
    private int fuelMeter;

    public HybridCar(int price, String colour, Engine engine, Tyres tyres, String type) {
        super(price, colour, engine, tyres, type);
        this.fuelMeter = 20;
        this.powerMeter = 10;
    }

    public int getPowerMeter() {
        return powerMeter;
    }

    public int getFuelMeter() {
        return fuelMeter;
    }

    @Override
    public void usePower(int distance) {
        this.powerMeter -= distance;

    }

    @Override
    public void increasePower(int volt) {
        this.powerMeter += volt;

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
