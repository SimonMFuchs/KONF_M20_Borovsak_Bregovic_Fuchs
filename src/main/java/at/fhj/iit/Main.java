package at.fhj.iit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SoftDrink drink1 = new SoftDrink(scanner.nextLine(), scanner.nextDouble());

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());
        
        Liquid tonic = new Liquid("Tonic", 0.150, 0);
        Liquid gin = new Liquid("Gin", 0.04, 40);

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);

        Drink ginTonic = new MixedDrink("Gin Tonic", gin, tonic);
        System.out.println(ginTonic);
    }
}
