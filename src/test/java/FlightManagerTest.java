import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    Flight flight;
    Passenger passenger;

    @Before
    public void before() {
        flightManager = new FlightManager();
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("BA109", "EDI", "GLA", "21:00");
        passenger = new Passenger("Brian Manson", 1);
    }

    @Test
    public void canCalculateTotalBaggageAllowance() {
        assertEquals(100, flightManager.calculateTotalBaggageAllowance(plane));
    }

    @Test
    public void canCalculateBaggageAllowancePerCustomer() {
        assertEquals(1, flightManager.calculateBaggageAllowancePerPassenger(plane));
    }

    @Test
    public void canCalculateTotalBaggageWeight() {
        flight.bookPassenger(plane, passenger);
        flight.bookPassenger(plane, passenger);
        assertEquals(2, flightManager.calculateTotalBaggageWeight(plane, flight));
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flight.bookPassenger(plane, passenger);
        assertEquals(99, flightManager.calculateRemainingBaggageWeight(plane, flight));
    }
}
