/*
Write a Java class, Flower, that has three instance variables of type String, int and float, which respectively
represt the name of the flower, its number of petals, and price. Your class must include a constructor method that
iniializes each variable to an appropriate value, and your class should include methods for setting the value
of each type, and getting the value of each type.
*/

public class ReinforcementP9{
    Flower flr1 = new Flower("Red Rose", 10.0, 6);
    Flower flr2 = new Flower("White Rose", 12.0, 8);
}

class Flower{
    private String name;
    private double price;
    private int petals;

    public Flower(String name, double price, int petals){
        this.name = name;
        this.price = price;
        this.petals = petals;
    }

    public void setName(String name){ this.name = name; }
    public void setPrice(double price){ this.price = price; }
    public void setPetals(int petals){ this.petals = petals; }

    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public int getPetals(){ return petals; }
}