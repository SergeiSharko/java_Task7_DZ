package Task1_DZ;

public abstract class Product {
    protected String name;
    protected double cost;    

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;        
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }    

    @Override

    public String toString() {
        return String.format("Товар: %s, Цена: %.2f,", name, cost);
    }
}