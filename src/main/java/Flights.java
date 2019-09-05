import java.util.ArrayList;
import java.util.List;

public class Flights {

    private static List<Flight> flights = new ArrayList<>();

    {
        flights.add(Flight.builder().withDestination("Istanbul").build());
        flights.add(Flight.builder().withDestination("Asmara").build());
        flights.add(Flight.builder().withDestination("Damascus").build());
        flights.add(Flight.builder().withDestination("Skavsta").build());
        flights.add(Flight.builder().withDestination("Sanaa").build());
        flights.add(Flight.builder().withDestination("Teheran").build());
    }

    public String toString(){
        String output = "";
        for(Flight flight : flights){
            output += flights.indexOf(flight)+1 + ". " + flight.getDestination() +"\n";
        }
        return output;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
