package Task1_DZ;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        HotDrink prod1 = new HotDrink("Чай", 3.0, 50);
        HotDrink prod2 = new HotDrink("Кофе", 5.0, 90);
        HotDrink prod3 = new HotDrink("Американо", 4.0, 95);
        HotDrink prod4 = new HotDrink("Молоко", 3.0, 40);

        HotDrinkMashine hotDrinkAuto = new HotDrinkMashine();

        hotDrinkAuto.initHotDrinks(List.of(prod1, prod2, prod3, prod4));
        
        System.out.println(hotDrinkAuto.getProduct("чай"));
        System.out.println(hotDrinkAuto.getProduct(95));
        System.out.println(hotDrinkAuto.getProduct("Молоко", 3.0, 40));

    }
}