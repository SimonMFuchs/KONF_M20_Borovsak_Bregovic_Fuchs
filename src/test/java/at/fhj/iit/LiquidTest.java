package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    private Liquid l1;

    @BeforeEach
    void setup() {
        l1 = new Liquid("test", 0.1, 40, 50);
    }

    @Test
    void getName() {
        assertEquals("test", l1.getName());
    }

    @Test
    void setName() {
        l1.setName("testSetter");
        assertEquals("testSetter", l1.getName());
    }

    @Test
    void getVolume() {
        assertEquals(0.1, l1.getVolume());
    }

    @Test
    void setVolume() {
        l1.setVolume(0.2);
        assertEquals(0.2, l1.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        assertEquals(40, l1.getAlcoholPercent());
    }

    @Test
    void setAlcoholPercent() {
        l1.setAlcoholPercent(20);
        assertEquals(20, l1.getAlcoholPercent());
    }

    @Test
    void getPrice() {
        assertEquals(5, l1.getPrice());
    }

    @Test
    void setPrice() {
        l1.setPrice(25);
        assertEquals(2.5, l1.getPrice());
    }

    @Test
    void testCheckVolume() {
        assertThrows(IllegalArgumentException.class, () -> {l1.setVolume(0);});
    }
}