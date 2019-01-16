package carDealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Dave", 20_000);
    }

    @Test
    public void getName() {
        assertEquals("Dave", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(20_000, customer.getWallet());
    }

    @Test
    public void CarCollectionStartsEmpty() {
        assertEquals(0, customer.getCarCollection().size());
    }
}