import org.junit.Test;

public class TicketTest {

    @Test
    public void createTicketTest(){
        Ticket.builder()
                .withTicketType(TicketType.ECONOMY)
                .withCustomerName("Shaza Hlaleh")
                .withFood(new Food("Spaghetti", 139))
                .withSeatNumber("12F")
                .withFlight(new Flight(Flight.builder()))
                .build();
    }

}
