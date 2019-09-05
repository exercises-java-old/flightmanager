import java.util.Objects;

public class Ticket {

    TicketType ticketType;

    private String customerName;

    Food food;

    private int price;

    private String seatNumber;

    private Flight flight;

    public Ticket(TicketType ticketType){
        this.ticketType = ticketType;
    }

    public Ticket(Builder builder) {
        this.ticketType = Objects.requireNonNull(builder.ticketType, "type may not be null");
        this.food = Objects.requireNonNull(builder.food, "food may not be null");
        this.seatNumber = Objects.requireNonNull(builder.seatNumber, "Ticket must have a seat number");
        this.flight = Objects.requireNonNull(builder.flight, "Ticket must have a flight");
        this.customerName = Objects.requireNonNull(builder.customerName, "ticket must have customer");
    }

    public TicketType getTicketType() {
        return this.ticketType;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private TicketType ticketType;
        private String customerName;
        private Food food;
        private String seatNumber;
        private Flight flight;

        public Builder withTicketType(TicketType ticketType){
            this.ticketType = ticketType;
            return this;
        }

        public Builder withCustomerName(String customerName){
            this.customerName = customerName;
            return this;
        }

        public Builder withFood(Food food){
            this.food = food;
            return this;
        }

        public Builder withSeatNumber(String seatNumber){
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder withFlight(Flight flight){
            this.flight = flight;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }

    }

}
