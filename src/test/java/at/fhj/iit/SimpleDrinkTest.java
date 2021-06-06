package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    private SimpleDrink drink;
    private Liquid l1;
    private CashRegister cashRegister;
    private Cashier cashier;

    @BeforeEach
    void setup() {
        l1 = new Liquid("TestLiquid1", 0.1, 40, 50);
        drink = new SimpleDrink("drink", l1);
    }

    @Test
    void getVolume() {
        assertEquals(0.1, drink.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        assertEquals(40, drink.getAlcoholPercent());
    }

    @Test
    void isAlcoholic() {
        assertEquals(true, drink.isAlcoholic());
    }

    @Test
    void getName() {
        assertEquals("drink", drink.getName());
    }

    @Test
    void getPrice() {
        assertEquals(5, drink.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Simple Drink called drink with 40.0 percent alcohol by volume", drink.toString());
    }

    @Test
    void purchase() {
        cashier = new Cashier("cashier");
        cashRegister = new CashRegister(cashier);
        Sale expected = new Sale(cashier, 5, 40);
        drink.purchase(cashRegister);
        assertEquals(expected.getPrice(), cashRegister.getSalesList().get(0).getPrice());
    }
}