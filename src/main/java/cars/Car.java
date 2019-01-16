package cars;

import components.Engine;
import components.Tyres;

public abstract class Car {

    private int price;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private String type;

    public Car(int price, String colour, Engine engine, Tyres tyres, String type) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getType() {
        return type;
    }

    public void changeCarPrice(int money){
        this.price += money;
    }
}
