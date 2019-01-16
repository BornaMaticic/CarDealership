package components;

import com.sun.deploy.security.ValidationState;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("BMW", "3", EngineType.ELECTRIC, 180);

    }

    @Test
    public void getMake() {
        assertEquals("BMW", engine.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("3", engine.getModel());
    }

    @Test
    public void getHorsePower() {
        assertEquals(180, engine.getHorsePower());
    }

    @Test
    public void getEngineType() {
        assertEquals(EngineType.ELECTRIC, engine.getType());
    }
}