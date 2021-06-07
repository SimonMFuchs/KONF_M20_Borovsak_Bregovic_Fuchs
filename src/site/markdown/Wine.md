## Description of the Wine class ##


 * Configuration management
 * Exercise 4 - Class Wine
 * Author: Katarina Borovsak
 * Last modified: 25.04.2021


It is a class, where you can create a new drink with two diffrent liquids, namely wine and water.
Class is part of [repository](https://github.com/SimonMFuchs/KONF_MSD20_Borovsak_Bregovic_Fuchs)

| methods       |  description  |parameters|return values| 
| ------------- |---------------|----------|-------------|
|constructor Wine | represents a constructor Wine, with parameters name and two liquids | name, w, a | / |
| getVolume  | returns the volume of drink in litre| / | Volume in litre as double |
| getAlcoholPercent | returns the alcohol percent | / | Alcohol amount in percent |
| isAlcoholic | returns the boolean value (true or false) if the drink is alcoholic or not | / |  |
| getName | returns the String value name | / | name |
| getPrice | returns the double value price | / |price  |
| toString | prints the drink object in a nice way | / | information as a string |
| purchase| creates a sale with the current time and the drink information and adds it to the cash register | cashRegister | information as a string |

1. There are two possible liquids defined
2. Constructor named Wine with parameters: name, liquid1 and liquid2
3. Methods printOut, getVolume, getAlcoholPercent and isAlcoholic are extended from class Drink

