import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Plane plane;
    Plane plane2;

    @Before
    public void before() {
        flight = new Flight("BA109", "EDI", "GLA", "21:00");
        passenger1 = new Passenger("Jake Stevens", 1);
        plane = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.TINYPLANE);
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("BA109", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("21:00", flight.getDepartureTime());
    }

    @Test
    public void canAddAPassengerToFlight() {
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canGetRemainingSeats() {
        flight.addPassengerToFlight(passenger1);
        assertEquals(99, flight.getRemainingSeats(plane));
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(plane, passenger1);
        assertEquals(99, flight.getRemainingSeats(plane));
    }

    @Test
    public void canNotBookPassengerIfFlightIsFull() {
        flight.bookPassenger(plane2, passenger1);
        assertEquals(0, flight.getPassengers().size());
    }
}
