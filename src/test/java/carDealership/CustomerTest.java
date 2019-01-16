package carDealership;

import cars.Car;
import cars.ElectricCar;
import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Tyro", "YY88", EngineType.ELECTRIC, 160);
        tyres = new Tyres("Tirell", "tt66");
        customer = new Customer("Dave", 20_000);
        electricCar = new ElectricCar(10_000, "pink", engine, tyres, "Test Car");
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
    public void carCollectionStartsEmpty() {
        assertEquals(0, customer.getCarCollection().size());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(electricCar);
        assertEquals(10_000, customer.getWallet());
        assertEquals(1, customer.getCarCollection().size());
    }


}