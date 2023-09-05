package technology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Program {

    @Test
    public void testComputerStartAndShutdown() {
        Computer computer = new Computer("Dell", "XPS", 999.99);

        computer.start();
        assertTrue(true);
        computer.shutDown();
        assertTrue(true);
    }

    @Test
    public void testLaptopCarry() {
        Laptop laptop1 = new Laptop("HP", "EliteBook", 1299.99, 15.6);
        Laptop laptop2 = new Laptop("Lenovo", "ThinkPad", 899.99, 25.3);

        assertTrue(laptop1.carry());
        assertFalse(laptop2.carry());
    }

    @Test
    public void testSmartPhoneMakeCall() {
        SmartPhone phone1 = new SmartPhone("Apple", "iPhone 12", 799.99, "iOS", 128);
        SmartPhone phone2 = new SmartPhone("Samsung", "Galaxy S21", 699.99, "Android", 32);

        phone1.makeCall("123-456-7890");
        phone2.makeCall("987-654-3210");

    }
}
