import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public String getDepartureTime() {
        return departureTime;
    }

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
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

    public void addPassengerToFlight(Passenger passenger) {
        passengers.add(passenger);
    }

    public int getRemainingSeats(Plane plane) {
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Plane plane, Passenger passenger) {
        if (getRemainingSeats(plane) > 0) {
            addPassengerToFlight(passenger);
        }
    }
}
