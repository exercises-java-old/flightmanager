import java.util.HashMap;
import java.util.Map;

public class Flight {

    private final int numberOfSeats = 10;

    Map<Integer, Ticket> seats = new HashMap<>(numberOfSeats);

    public Flight() {

    }

    public boolean businessSeatIsAvailable() {
        //if there is any seat 1-5 that is not taken --> return true
        for (int i = 1; i <= 5; i++) {
            if (!seats.containsKey(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean economySeatIsAvailable() {
        for (int i = 6; i <= 10; i++) {
            if (!seats.containsKey(i)) {
                return true;
            }
        }
        return false;
    }


    public boolean addTicket(int seatNumber, Ticket ticket) {
        if (seatNumber >= 1 && seatNumber <= 5
                && ticket.getTicketType() == TicketType.BUSINESS) {
            seats.put(seatNumber, ticket);
            return true;
        } else if (seatNumber >= 6 && seatNumber <= 10
                && ticket.getTicketType() == TicketType.ECONOMY) {
            seats.put(seatNumber, ticket);
            return true;
        }
        return false;
    }
}
