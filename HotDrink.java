package Task1_DZ;

public class HotDrink extends Product {

    int temperature;

    public HotDrink(String name, double cost, int temperature) {
        this.name = name;
        this.cost = cost;
        this.temperature = temperature;
    }

    public int getTemp() {
        return temperature;
    }

    @Override

    public String toString() {
        return String.format("Товар: %s, Цена: %.2f, Температура напитка: %d", name, cost, temperature);
    }

}
