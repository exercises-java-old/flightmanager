import org.junit.Assert;
import org.junit.Test;

public class FLightTest {

    @Test
    public void availabilityTest(){
        Flight flight = new Flight();

        Ticket testTicket = new Ticket(TicketType.BUSINESS);

        flight.addTicket(new Ticket(TicketType.BUSINESS));
        flight.addTicket( new Ticket(TicketType.BUSINESS));
        flight.addTicket( new Ticket(TicketType.BUSINESS));
        flight.addTicket( new Ticket(TicketType.BUSINESS));
        flight.addTicket( new Ticket(TicketType.BUSINESS));
        flight.addTicket( testTicket);

        Assert.assertFalse(flight.getSeats().containsValue(testTicket));

    }

    @Test
    public void economySeatToBusinessTicketTest(){
        Flight flight = new Flight();

        //Assert.assertFalse(flight.addTicket( new Ticket(TicketType.BUSINESS)));

    }

    @Test
    public void addTicketTest(){
        Flight flight = new Flight();

        flight.addTicket( new Ticket(TicketType.BUSINESS));

    }
}
