import java.util.Scanner;

public class Client {

    Flights flights = new Flights();

    Flight flight = Flight.builder().withDestination("Asmara").build();

    private Scanner scanner = new Scanner(System.in);

    public Client() {

    }

    public void bookFlight() {
        selectFlight();
        selectTicketType();
    }

    public Flight selectFlight() {
        String input = "";
        boolean correctInput = false;

        System.out.println("Where would you like to travel, dear customer:");

        while (!correctInput) {
            System.out.println(flights.toString());
            input = scanner.nextLine();

            for(Flight flight : flights.getFlights())
            if (input.equals(flight.getDestination())) {
                return flight;
            }
            System.out.println("Dear customer, you have to choose one of our available destinations, they are:");

        }
        return null;

    }

    public TicketType selectTicketType(){
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

}
