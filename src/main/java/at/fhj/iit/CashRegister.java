package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CashRegister {

    Drink drink;
    List<Customer> allCustomers = new ArrayList<>();
    Integer sales;          //whole sales will be calculated whe calcTotalSales is called


    /**
     * creating a cashRegister with the two needed variables
     * @param drink is our drink, could be Simpledrink, Softdrink, Wine....
     * @param customer  is our customer that can buy drinks
     */
    public CashRegister(Drink drink, Customer customer){
        this.drink = drink;
        this.allCustomers.add(customer);
    }

    /**
     * This method nas to be called when we want to calc the total sales of all customers
     */
    public void calcTotalSales(){
        for (int i = 0; i <allCustomers.size(); i++) {
            this.sales += allCustomers.get(i).getSales();
        }
    }
}
