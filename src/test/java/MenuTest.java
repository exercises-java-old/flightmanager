import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    @Test
    public void createMenuTest(){
        List<Food> cheapFoodList = new ArrayList<>();
        List<Food> classyFoodList = new ArrayList<>();

        Food food1 = new Food("Spaghetti Bolognese", 149);
        Food food2 = new Food("Chicken Tikka Masala", 149);
        Food food3 = new Food("Cheese sandwich", 99);
        Food food4 = new Food("Beer", 39);
        Food food5 = new Food("Water", 29);
        Food food6 = new Food("Nescafé", 29);
        Food food7 = new Food("Lipton Tea", 29);

        cheapFoodList.add(food1);
        cheapFoodList.add(food2);
        cheapFoodList.add(food3);
        cheapFoodList.add(food4);
        cheapFoodList.add(food5);
        cheapFoodList.add(food6);
        cheapFoodList.add(food7);

        Menu cheapMenu = new Menu(TicketType.ECONOMY, cheapFoodList);

        Food food11 = new Food("Lobster", 649);
        Food food12 = new Food("Wagyu", 1149);
        Food food13 = new Food("Smörgåstårta", 399);
        Food food14 = new Food("Champagne", 339);
        Food food15 = new Food("Sparkling Water", 89);
        Food food16 = new Food("Espresso", 129);
        Food food17 = new Food("Japanese Tea Ceremony", 729);

        classyFoodList.add(food11);
        classyFoodList.add(food12);
        classyFoodList.add(food13);
        classyFoodList.add(food14);
        classyFoodList.add(food15);
        classyFoodList.add(food16);
        classyFoodList.add(food17);

        Menu highLifeMenu = new Menu(TicketType.BUSINESS, classyFoodList);

        System.out.println(cheapMenu.toString());

        System.out.println(highLifeMenu.toString());

    }

}
