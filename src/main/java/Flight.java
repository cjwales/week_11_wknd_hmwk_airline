import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;

    public Flight(String flightNumber, String destination, String departureAirport) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
}
