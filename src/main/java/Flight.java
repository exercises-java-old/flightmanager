import java.util.HashMap;
import java.util.Map;

public class Flight {

    private final int numberOfSeats = 10;

    Map<Integer, Ticket> seats = new HashMap<>(numberOfSeats);

    public Flight() {

    }

    public Map<Integer, Ticket> getSeats(){
        return seats;
    }

    public int businessSeatIsAvailable() {

        for (int i = 1; i <= 5; i++) {
            if (!seats.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }

    public int economySeatIsAvailable() {
        for (int i = 6; i <= 10; i++) {
            if (!seats.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }


    public boolean addTicket(Ticket ticket) {
        if (ticket.getTicketType() == TicketType.BUSINESS) {
            if(businessSeatIsAvailable() > 0) {
                seats.put(businessSeatIsAvailable(), ticket);
                return true;
            }

        }

        if (ticket.getTicketType() == TicketType.ECONOMY) {
            if(economySeatIsAvailable() > 0){
                seats.put(economySeatIsAvailable(), ticket);
                return true;
            }
        }
        return false;
    }
}
