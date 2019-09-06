import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

    TicketType ticketType;

    static List<Food> businessMenu = new ArrayList<>();

    static List<Food> economyMenu = new ArrayList<>();

    //anonymous scope
    static
    {
        economyMenu.add(new Food("Spaghetti Bolognese", 149));
        economyMenu.add(new Food("Chicken Tikka Masala", 149));
        economyMenu.add(new Food("Cheese sandwich", 99));
        economyMenu.add(new Food("Beer", 39));
        economyMenu.add(new Food("Tap Water From Toilet Zink", 29));
        economyMenu.add(new Food("Nescafé", 29));
        economyMenu.add(new Food("Lipton Tea", 29));

        businessMenu.add(new Food("Lobster", 649));
        businessMenu.add(new Food("Wagyu", 1149));
        businessMenu.add(new Food("Smörgåstårta", 399));
        businessMenu.add(new Food("Champagne", 339));
        businessMenu.add(new Food("Sparkling Water", 89));
        businessMenu.add(new Food("Espresso", 129));
        businessMenu.add(new Food("Japanese Tea Ceremony", 729));
    }

    public Menu(){}

    public Menu(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    List<Food> getAllFoodItems(){
        List<Food> allFood = new ArrayList<>();
        allFood.addAll(economyMenu);
        allFood.addAll(businessMenu);
        return allFood;
    }

    public void addFoodToBusinessMenu(Food food) {
        businessMenu.add(food);
    }

    public void removeFoodFromBusinessMenu(String foodName) {

        Iterator<Food> iter = businessMenu.iterator();
        while(iter.hasNext()){
            if(iter.next().getName().equals(foodName)){
                iter.remove();
            }
        }
    }

    public void removeFoodFromEconomyMenu(String foodName) {

        Iterator<Food> iter = economyMenu.iterator();
        while(iter.hasNext()){
            if(iter.next().getName().equals(foodName)){
                iter.remove();
            }
        }
    }


    @Override
    public String toString() {
        String output = "";

        output += "Business Menu:\n";
        for(Food food : businessMenu){
            output += food.toString();
        }

        output += "\nEconomy Menu:\n";
        for(Food food : economyMenu) {
            output += food.toString();
        }

        //ternary operator statement
        //String menuName = ticketType == TicketType.ECONOMY ? "Cheap Menu:" : "Classy Menu:";

        return output;

    }

    public static List<Food> getBusinessMenu() {
        return businessMenu;
    }

    public static List<Food> getEconomyMenu() {
        return economyMenu;
    }
}