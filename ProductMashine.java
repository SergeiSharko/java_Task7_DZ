package Task1_DZ;

import java.util.List;

public interface ProductMashine {    
    
    public void initHotDrinks(List<HotDrink> listHotDrinks);
    public HotDrink getProduct(String name);
    public HotDrink getProduct(int temperature);
    public HotDrink getProduct(String name, double cost, int temperature);

}
