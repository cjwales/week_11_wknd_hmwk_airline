import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before() {
        flight = new Flight("BA109", "EDI", "GLA");
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("BA109", flight.getFlightNumber());
    }
}
