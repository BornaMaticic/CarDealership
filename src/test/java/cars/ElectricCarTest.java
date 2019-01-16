package cars;

import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Tyro", "YY88", EngineType.ELECTRIC, 160);
        tyres = new Tyres("Tirell", "tt66");
        electricCar = new ElectricCar(20_000, "pink", engine, tyres, "ElectroCar");
    }

    @Test
    public void getPowerMeter() {
        assertEquals(10, electricCar.getPowerMeter());
    }

    @Test
    public void canUsePower(){
        electricCar.usePower(5);
        assertEquals(5, electricCar.getPowerMeter());
    }

    @Test
    public void canIncreasePower(){
        electricCar.increasePower(5);
        assertEquals(15, electricCar.getPowerMeter());
    }
}