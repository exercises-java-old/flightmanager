import java.util.HashMap;
import java.util.Map;

public class Flight {

    Map<Integer, Ticket> seats;

    public Flight() {
        seats = new HashMap<Integer, Ticket>();
    }

    public boolean addTicket(Ticket ticket){
        if(ticket.getTicketType() == TicketType.ECONOMY){

        }
        else{

        }
        return false;
    }

}
