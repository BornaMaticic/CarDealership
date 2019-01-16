package carDealership;

import cars.DieselCar;
import cars.ElectricCar;
import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDealershipTest {

    Customer customer;
    DieselCar dieselCar;
    ElectricCar electricCar;
    Engine engine;
    Engine electricEngine;
    Tyres tyres;
    Till till;
    CarDealership carDealership;

    @Before
    public void before(){
        engine = new Engine("Tyro", "YY88", EngineType.DIESEL, 160);
        electricEngine = new Engine("Tyro", "YY88", EngineType.ELECTRIC, 160);
        tyres = new Tyres("Tirell", "tt66");
        customer = new Customer("Dave", 20_000);
        dieselCar = new DieselCar(10_000, "pink", engine, tyres, "Test Car");
        electricCar = new ElectricCar(10_000, "pink", electricEngine, tyres, "Test Car");
        till = new Till(0);
        carDealership = new CarDealership("Joe's Garrage", till);
    }

    @Test
    public void getName() {
        assertEquals("Joe's Garrage", carDealership.getName());
    }

    @Test
    public void getTill() {
        assertEquals(0, carDealership.getTill().getMoney());
    }

    @Test
    public void getCars() {
        assertEquals(0, carDealership.getCars().size());
    }

    @Test
    public void sellDieselCar() {
        carDealership.addCar(dieselCar);
        carDealership.sellCar(customer, dieselCar);
        assertEquals(0, carDealership.getCars().size());
        assertEquals(11_000, carDealership.getTill().getMoney());
    }

    @Test
    public void sellElectricCar() {
        carDealership.addCar(electricCar);
        carDealership.sellCar(customer, electricCar);
        assertEquals(0, carDealership.getCars().size());
        assertEquals(9_000, carDealership.getTill().getMoney());
    }


}