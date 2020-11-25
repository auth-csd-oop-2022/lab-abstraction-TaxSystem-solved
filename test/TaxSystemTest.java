import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaxSystemTest {

    public TaxSystemTest() {

    }


    @Test
    public void testHierarchy() {
        FixedFactorTax fixedFactorTax= new FixedFactorTax(0.8,0.15,0.05);
        assertTrue(fixedFactorTax instanceof Tax);
        LuxuryFactorTax luxuryFactorTax = new LuxuryFactorTax(0.8,0.2,0.1,500);
        assertTrue(luxuryFactorTax instanceof Tax);
    }

    @Test
    public void FixedFactorTaxTest() {
        FixedFactorTax fixedFactorTax = new FixedFactorTax(0.8,0.15,0.05);
        Car car = new Car(2000,4.5,300);
        House house = new House(50,3,8,1);
        assertEquals(1615.675,fixedFactorTax.carTax(car),0.001);
        assertEquals(15.5, fixedFactorTax.houseTax(house), 0.001);
        Car car2 = new Car(1500,8.5,100);
        House house2 = new House(150,4,16,1);
        assertEquals(1206.275,fixedFactorTax.carTax(car2),0.001);
        assertEquals(42.75, fixedFactorTax.houseTax(house2), 0.001);
    }

    @Test
    public void LuxuryFactorTaxTest() {
        LuxuryFactorTax luxuryFactorTax = new LuxuryFactorTax(0.8,0.15,0.05,200);
        Car car = new Car(2000,4.5,300);
        House house = new House(50,3,7,1);
        assertEquals(1815.675,luxuryFactorTax.carTax(car),0.001);
        assertEquals(15.25, luxuryFactorTax.houseTax(house), 0.001);
        Car car2 = new Car(1500,8.5,100);
        House house2 = new House(150,4,16,1);
        assertEquals(1206.275,luxuryFactorTax.carTax(car2),0.001);
        assertEquals(442.75, luxuryFactorTax.houseTax(house2), 0.001);
    }

    @Test
    public void TaxSystemTest() {
        FixedFactorTax fixedFactorTax = new FixedFactorTax(0.8,0.15,0.05);
        LuxuryFactorTax luxuryFactorTax = new LuxuryFactorTax(0.8,0.15,0.05,200);
        TaxSystem taxSystem1 = new TaxSystem(fixedFactorTax);
        Car car = new Car(2000,4.5,300);
        House house = new House(50,3,7,1);
        Car car2 = new Car(1500,8.5,100);
        House house2 = new House(150,4,16,1);
        taxSystem1.addCar(car);
        taxSystem1.addCar(car2);
        taxSystem1.addHouse(house);
        taxSystem1.addHouse(house2);
        ArrayList<Double> carTaxes = new ArrayList<>();
        ArrayList<Double> houseTaxes = new ArrayList<>();
        carTaxes.add(1615.675);
        carTaxes.add(1206.275);
        houseTaxes.add(15.25);
        houseTaxes.add(42.75);
        assertEquals(carTaxes, taxSystem1.getCarTaxes());
        assertEquals(houseTaxes,taxSystem1.geHouseTaxes());
        assertEquals(2879.95,taxSystem1.getTotalTaxes(),0.001);

        TaxSystem taxSystem2 = new TaxSystem(luxuryFactorTax);
        taxSystem2.addCar(car);
        taxSystem2.addCar(car2);
        taxSystem2.addHouse(house);
        taxSystem2.addHouse(house2);
        carTaxes = new ArrayList<>();
        houseTaxes = new ArrayList<>();
        carTaxes.add(1815.675);
        carTaxes.add(1206.275);
        houseTaxes.add(15.25);
        houseTaxes.add(442.75);
        assertEquals(carTaxes, taxSystem2.getCarTaxes());
        assertEquals(houseTaxes,taxSystem2.geHouseTaxes());
        assertEquals(3479.95,taxSystem2.getTotalTaxes(),0.001);
    }


}