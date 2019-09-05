import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Flight {

    private String destination;

    private final int numberOfSeats = 10;

    Map<Integer, Ticket> seats = new HashMap<>(numberOfSeats);

    public Flight(Builder builder) {
        this.destination = Objects.requireNonNull(builder.destination, "flight must have a destination");
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

    public boolean addBusinessTicket(Ticket ticket) {
        if (ticket.getTicketType() == TicketType.BUSINESS) {
            if (businessSeatIsAvailable() > 0) {
                seats.put(businessSeatIsAvailable(), ticket);
                return true;
            }
        }
        return false;
    }

    public boolean addEconomyTicket(Ticket ticket){
        if (ticket.getTicketType() == TicketType.ECONOMY) {
            if(economySeatIsAvailable() > 0){
                seats.put(economySeatIsAvailable(), ticket);
                return true;
            }
        }
        return false;
    }

    public static Builder builder(){ return new Builder(); }

    public String getDestination() {
        return destination;
    }

    public static class Builder{
        private String destination;

        public Builder withDestination(String destination){
            this.destination = destination;
            return this;
        }

        public Flight build(){ return new Flight(this); }

    }
}
