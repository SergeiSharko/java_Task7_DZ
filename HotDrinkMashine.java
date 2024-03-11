package Task1_DZ;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMashine implements ProductMashine {    
   
    List<HotDrink> listHotDrinks = new ArrayList<HotDrink>();

    public void initHotDrinks(List<HotDrink> listHotDrinks) {
        this.listHotDrinks = listHotDrinks;
    }

    public HotDrink getProduct(String name) {
        for (HotDrink hotDrink : listHotDrinks) {
            if (hotDrink.getName().equalsIgnoreCase(name)) {
                return hotDrink;
            }
        }
        return null;        
    }

    public HotDrink getProduct(String name, double cost, int temperature) {
        for (HotDrink hotDrink : listHotDrinks) {
            if (hotDrink.getName().equalsIgnoreCase(name) && hotDrink.getCost() == cost && hotDrink.getTemp() == temperature) {
                return hotDrink;
            }
        }
        return null;        
    }
    
    public HotDrink getProduct(int temperature) {
        for (HotDrink hotDrink : listHotDrinks) {
            if (hotDrink.getTemp() == temperature) {
                return hotDrink;
            }
        }
        return null;        
    }
}
