public class Ticket {

    TicketType ticketType;

    Food food;

    private int price;

    private String seatNumber;

    private Flight flight;

    public Ticket(TicketType ticketType){
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return this.ticketType;
    }
}
