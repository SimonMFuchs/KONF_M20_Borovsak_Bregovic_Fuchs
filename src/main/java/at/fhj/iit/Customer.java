package at.fhj.iit;

import java.util.Date;

public class Customer {
    Date date;       // Umsatz at a specific Day
    String name;     // identifyer by name
    Integer sales;   // Umsatz pro Person





    public Customer(Date date, String name, Integer sales){
        this.date = date;
        this.name = name;
        this.sales = sales;
    }

    public void buyDrink (Integer sale){
        this.sales += sale;
    }


}
