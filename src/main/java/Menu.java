import java.util.Iterator;
import java.util.List;

public class Menu {

    TicketType ticketType;

    List<Food> foodList;

    public Menu(TicketType ticketType, List<Food> foodList) {
        this.ticketType = ticketType;
        this.foodList = foodList;
    }

    public void addFoodItem(Food food) {
        foodList.add(food);
    }

    public void removeFoodItem(String foodName) {
        Iterator<Food> iter = foodList.iterator();

        while (iter.hasNext()) {
            Food food = iter.next();
            if (food.getName().equals(foodName)) {
                foodList.remove(food);
            }
        }
    }
}