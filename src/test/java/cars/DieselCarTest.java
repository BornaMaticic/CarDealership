package cars;

import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DieselCarTest {

    Engine engine;
    Tyres tyres;
    DieselCar dieselCar;

    @Before
    public void before(){
        engine = new Engine("Tyro", "YY88", EngineType.DIESEL, 160);
        tyres = new Tyres("Tirell", "tt66");
        dieselCar = new DieselCar(18_000, "Lavander", engine, tyres, "Skoda");
    }

    @Test
    public void getFuelMeter() {
        assertEquals(20, dieselCar.getFuelMeter());
    }

    @Test
    public void canUseFuel() {
        dieselCar.useFuel(10);
        assertEquals(10, dieselCar.getFuelMeter());
    }

    @Test
    public void canIncreaseFuel() {
        dieselCar.increaseFuel(5);
        assertEquals(25, dieselCar.getFuelMeter());
    }
}