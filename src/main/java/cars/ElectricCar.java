package cars;

import behaviours.IElectric;
import components.Engine;
import components.Tyres;

public class ElectricCar extends Car implements IElectric {

    private int powerMeter;

    public ElectricCar(int price, String colour, Engine engine, Tyres tyres, String type) {
        super(price, colour, engine, tyres, type);
        this.powerMeter = 10;
    }

    public int getPowerMeter() {
        return powerMeter;
    }

    @Override
    public void usePower(int distance) {
     this.powerMeter -= distance;
    }

    @Override
    public void increasePower(int volt) {
        this.powerMeter += volt;
    }
}
