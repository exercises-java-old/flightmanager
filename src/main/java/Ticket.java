public class Ticket {

    TicketType ticketType;

    Food food;

    private int price;

    public Ticket(TicketType ticketType){
        this.ticketType = ticketType;
    }


    public TicketType getTicketType() {
        return this.ticketType;
    }
}
