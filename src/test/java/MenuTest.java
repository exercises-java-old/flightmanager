import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MenuTest {

    @Test
    public void createMenuTest(){
        List<Food> foodList = new ArrayList<>();

        Food food1 = new Food("Spaghetti Bolognese", 149);
        Food food2 = new Food("Chicken Tikka Masala", 149);
        Food food3 = new Food("Cheese sandwich", 99);
        Food food4 = new Food("Beer", 39);
        Food food5 = new Food("Water", 29);
        Food food6 = new Food("Coffee", 29);
        Food food7 = new Food("Tea", 29);

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);
        foodList.add(food6);
        foodList.add(food7);

        System.out.println(foodList.toString());
    }

}
