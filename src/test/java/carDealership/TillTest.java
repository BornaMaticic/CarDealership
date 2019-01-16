package carDealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(0);
    }

    @Test
    public void getMoney() {
        assertEquals(0, till.getMoney());
    }

    @Test
    public void canPutMoneyInTill(){
        till.putMoneyInTill(10_000);
        assertEquals(10_000, till.getMoney());
    }


}