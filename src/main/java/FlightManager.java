public class FlightManager {

    public FlightManager() {

    }

    public int calculateTotalBaggageAllowance(Plane plane) {
        return plane.getTotalWeight() / 2;
    }

    public int calculateBaggageAllowancePerPassenger(Plane plane) {
        return calculateTotalBaggageAllowance(plane) / plane.getCapacity();
    }

    public int calculateTotalBaggageWeight(Plane plane, Flight flight) {
        return calculateBaggageAllowancePerPassenger(plane) * flight.getPassengers().size();
    }

    public int calculateRemainingBaggageWeight(Plane plane, Flight flight) {
        return calculateTotalBaggageAllowance(plane) - calculateTotalBaggageWeight(plane, flight);
    }
}
