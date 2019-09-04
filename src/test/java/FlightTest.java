import org.junit.Assert;
import org.junit.Test;

public class FlightTest {

    @Test
    public void availabilityTest(){
        Flight flight = new Flight();

        Ticket testTicket = new Ticket(TicketType.BUSINESS);

        //creating the Ticket object
        Ticket economyTestTicket = new Ticket(TicketType.ECONOMY);

        flight.addBusinessTicket(new Ticket(TicketType.BUSINESS));
        flight.addBusinessTicket( new Ticket(TicketType.BUSINESS));
        flight.addBusinessTicket( new Ticket(TicketType.BUSINESS));
        flight.addBusinessTicket( new Ticket(TicketType.BUSINESS));

        //för att kolla om det går att lägga till economyticket i businessdelen.
        //det borde inte gå
        flight.addBusinessTicket( economyTestTicket);

        flight.addBusinessTicket( new Ticket(TicketType.BUSINESS));
        flight.addBusinessTicket( testTicket);


        Assert.assertFalse(flight.getSeats().containsValue(testTicket));
        Assert.assertFalse(flight.getSeats().containsValue(economyTestTicket));


    }

    @Test
    public void economySeatToBusinessTicketTest(){
        Flight flight = new Flight();

        //Assert.assertFalse(flight.addTicket( new Ticket(TicketType.BUSINESS)));

    }

    @Test
    public void addTicketTest(){
        Flight flight = new Flight();

        flight.addBusinessTicket( new Ticket(TicketType.BUSINESS));

    }
}
