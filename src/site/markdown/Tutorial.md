#Tutorial with excample

* Overview: With this program we are able to create and buy our drink.
  
1. First we have to now which drink we want to buy. In our tutorial we will have a gin tonic, which, as the name says, consist of the liquide gin and the liquide tonic.
   
   * create an instance of liquid and name it "tonic"
   * create an instance of liquid and name it "gin"
    
    
2. In order to mix our two liquids we have to create a mixedDrink:
     Good luck that we now what inheritance is and how to make use of it. For those who are not familiar with this topic, please read this: https://www.w3schools.com/java/java_inheritance.asp
   * we will now assign a instance of the MixedDrink class which needs a name (as String) and our two liquids, to our super-class Drink. 
   * exc: Drink gintonic = new MixedDrink("ginTonic", gin, tonic);
    
     
3. In order to buy a drink we will further on have to create a new instance of the cashier class, which will lead us to the possibility to create an instance of the sales class.  
The Sale-class also needs the price and the alcohol percentage. We can take this information from our mixedDrink "ginTonic"
  * exc:Cashier ourCashier = new Cashier(); --> Sale sale1 = new Sale(ourCashier, ginTonic.getPrice(), ginTonic.getAlcoholPercent());


4. After the first step we are able to build our CashRegister class and use the method addSale to assign our CashRegister instance all necessary information.
  * exc: CashRegister cashRegister = new CashRegister(ourCashier); then --> cashRegister.addSale(sale1);