package at.fhj.iit;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class SoftDrink extends Drink{
    double volume;


    // nameing my drink and how much i want of it
    SoftDrink(String name, double volume){
        super(name);
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    };

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
