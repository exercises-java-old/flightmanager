import java.util.List;
import java.util.Scanner;

public class Client {

    Flights flights = new Flights();

    Flight flight = Flight.builder().withDestination("Asmara").build();

    private Scanner scanner = new Scanner(System.in);

    public Client() {

    }

    /*
    TODO: when the customer chooses TicketType the system has to check if it is available.
     If not it should offer a TicketType of the other sort.
     If not avaliable in any TicketType the system should crash!!!
     Look in the Java API which int argument for System.exit(int arg) that is suitable for the situation
     */
    public Ticket bookFlight() {
        String customerName = setCustomerName();
        Flight flight = selectFlight();
        TicketType ticketType = selectTicketType();
        Food food = selectFood(ticketType);

        return null;
    }

    private String setCustomerName() {
        String customerName = "";
        System.out.println("Welcome, dear customer. May I please have your name:");
        return scanner.nextLine();
    }


    public Flight selectFlight() {
        String input = "";
        boolean correctInput = false;

        System.out.println("Where would you like to travel, dear customer:");

        while (!correctInput) {
            System.out.println(flights.toString());
            input = scanner.nextLine();

            for (Flight flight : flights.getFlights())
                if (input.equals(flight.getDestination())) {
                    return flight;
                }
            System.out.println("Dear customer, you have to choose one of our available destinations, they are:");

        }
        return null;

    }

    public TicketType selectTicketType() {
        String input = "";
        TicketType ticketType = null;
        boolean correctInput = false;

        while (!correctInput) {
            System.out.println("Would you like to travel with [B]usiness class or [E]conomy class:");
            input = scanner.nextLine();
            input = input.toUpperCase();

            switch (input) {
                case "B":
                    ticketType = TicketType.BUSINESS;
                    correctInput = true;
                    break;

                case "E":
                    ticketType = TicketType.ECONOMY;
                    correctInput = true;
                    break;

                default:
                    System.out.println("You have to choose either [B]usiness class or [E]conomy class");
            }
        }
        return ticketType;
    }

    private Food selectFood(TicketType ticketType) {
        String input = "";
        boolean correctInput = false;
        List<Food> menu;

        if (ticketType == TicketType.BUSINESS) {
            menu = Menu.getBusinessMenu();
        } else {
            menu = Menu.getEconomyMenu();
        }

        System.out.println("Pick your pick from our fantastic menu:");

        System.out.println(ticketType.name());

        System.out.println(menu.size());

        while(!correctInput){
            for (Food food : menu) {
                System.out.print(menu.indexOf(food) + 1 + ". " + food.toString());
            }

            input = scanner.nextLine();

            for (Food food : menu) {
                if (food.getName().equalsIgnoreCase(input)) {
                    return food;
                }
            }

            System.out.println("You have to pick something from the menu, dear costumer");
        }
        return null;
    }


}
