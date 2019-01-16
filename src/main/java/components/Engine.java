package components;

public class Engine {

    private String make;
    private String model;
    private int horsePower;
    private Enum type;

    public Engine(String make, String model, Enum type, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Enum getType() {
        return type;
    }
}
