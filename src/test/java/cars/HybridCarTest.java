package cars;

import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HybridCarTest {
    Engine engine;
    Tyres tyres;
    HybridCar hybridCar;

    @Before
    public void before(){
        engine = new Engine("Tyro", "YY88", EngineType.HYBRID, 160);
        tyres = new Tyres("Tirell", "tt66");
        hybridCar = new HybridCar(23_000, "red", engine, tyres, "ToyotaH");
    }


    @Test
    public void getPowerMeter() {
        assertEquals(10, hybridCar.getPowerMeter());
    }

    @Test
    public void getFuelMeter() {
        assertEquals(20, hybridCar.getFuelMeter());
    }

    @Test
    public void canUsePower(){
        hybridCar.usePower(5);
        assertEquals(5, hybridCar.getPowerMeter());
    }

    @Test
    public void canIncreasePower(){
        hybridCar.increasePower(5);
        assertEquals(15, hybridCar.getPowerMeter());
    }

    @Test
    public void canUseFuel() {
        hybridCar.useFuel(10);
        assertEquals(10, hybridCar.getFuelMeter());
    }

    @Test
    public void canIncreaseFuel() {
        hybridCar.increaseFuel(5);
        assertEquals(25, hybridCar.getFuelMeter());
    }
}