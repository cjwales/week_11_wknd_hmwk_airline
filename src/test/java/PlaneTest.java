import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneModel() {
        assertEquals(PlaneType.BOEING747, plane.getModel());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight() {
        assertEquals(200, plane.getTotalWeight());
    }
}
