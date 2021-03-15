package at.fhj.iit;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class SoftDrink extends Drink{
    String nameDrink;
    double volume;



    SoftDrink(String name1, double volume){
        this.nameDrink = name1;
        this.volume = volume;
    }

    @Override
    public double getVolume(double volume) {
        this.volume = volume;
    }
}
