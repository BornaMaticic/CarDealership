package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyresTest {


    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Continental", "DB20");
    }

    @Test
    public void getMake() {
        assertEquals("Continental", tyres.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("DB20", tyres.getModel());
    }
}