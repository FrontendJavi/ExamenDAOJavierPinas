public class Ingredient extends Entity {
    public String name;
    public double price;
    
    public Ingredient(String name, double price){
       super();
       this.name = name;
       this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;

    }
}
