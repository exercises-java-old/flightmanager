import org.junit.Assert;
import org.junit.Test;

public class FLightTest {

    @Test
    public void availabilityTest(){
        Flight flight = new Flight();

        flight.addTicket(1, new Ticket(TicketType.BUSINESS));
        flight.addTicket(2, new Ticket(TicketType.BUSINESS));
        flight.addTicket(3, new Ticket(TicketType.BUSINESS));
        flight.addTicket(5, new Ticket(TicketType.BUSINESS));

        Assert.assertTrue(flight.businessSeatIsAvailable());
    }

    @Test
    public void economySeatToBusinessTicketTest(){
        Flight flight = new Flight();

        Assert.assertFalse(flight.addTicket(6, new Ticket(TicketType.BUSINESS)));

    }
}
